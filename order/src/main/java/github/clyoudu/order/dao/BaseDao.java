package github.clyoudu.order.dao;

import lombok.extern.slf4j.Slf4j;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.ExecuteContext;
import org.jooq.conf.RenderNameStyle;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultExecuteListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.text.MessageFormat;

/**
 * @author leichen
 * @date 2020/6/19 4:29 下午
 */
@Slf4j
public abstract class BaseDao {

    @Autowired
    private DataSource dataSource;

    protected DSLContext dslContext;

    @PostConstruct
    public void init() {
        TransactionAwareDataSourceProxy proxy = new TransactionAwareDataSourceProxy(dataSource);
        Settings settings = new Settings().withRenderSchema(false).withRenderNameStyle(RenderNameStyle.AS_IS);
        Configuration configuration = new DefaultConfiguration();
        configuration.set(new DataSourceConnectionProvider(proxy)).set(new JooqLogListener()).set(settings);

        dslContext = DSL.using(configuration);
    }

    private static class JooqLogListener extends DefaultExecuteListener {

        private static final long serialVersionUID = 5606929463701173072L;

        long startTime = 0;

        String logTemplate = "{0} execute-time: {1}ms";

        String logContent = "";

        /**
         * Hook into the query execution lifecycle before executing queries
         */
        @Override
        public void executeStart(ExecuteContext ctx) {
            super.executeStart(ctx);
            startTime = System.currentTimeMillis();
            DSLContext create = DSL.using(ctx.dialect(),
                    new Settings().withRenderFormatted(true));

            if (ctx.query() != null) {
                logContent = create.renderInlined(ctx.query());
            } else if (ctx.routine() != null) {
                logContent = create.renderInlined(ctx.routine());
            }
        }

        @Override
        public void executeEnd(ExecuteContext ctx) {
            super.executeEnd(ctx);
            long takeTime = System.currentTimeMillis() - startTime;
            log.info(MessageFormat.format(logTemplate, logContent, takeTime));
        }
    }

}
