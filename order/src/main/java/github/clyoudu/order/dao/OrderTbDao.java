package github.clyoudu.order.dao;

import github.clyoudu.order.jooq.tables.records.OrderTbRecord;
import org.springframework.stereotype.Repository;

import static github.clyoudu.order.jooq.tables.OrderTb.ORDER_TB;


/**
 * @author leichen
 * @date 2020/6/19 5:07 下午
 */
@Repository
public class OrderTbDao extends BaseDao {

    public int create(String username, String productCode, int count) {
        OrderTbRecord orderTbRecord = dslContext.newRecord(ORDER_TB);
        orderTbRecord.setUserName(username);
        orderTbRecord.setProductCode(productCode);
        orderTbRecord.setCount(count);
        orderTbRecord.store();
        return orderTbRecord.getId();
    }

}
