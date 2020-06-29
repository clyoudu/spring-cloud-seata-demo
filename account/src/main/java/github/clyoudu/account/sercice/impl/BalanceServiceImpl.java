package github.clyoudu.account.sercice.impl;

import github.clyoudu.account.dao.BalanceTbDao;
import github.clyoudu.account.dto.ResultDto;
import github.clyoudu.account.sercice.BalanceService;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author leichen
 * @date 2020/6/19 5:34 下午
 */
@Service
@Slf4j
public class BalanceServiceImpl implements BalanceService {

    @Autowired
    private BalanceTbDao balanceTbDao;

    @Override
    public ResultDto debit(int userId, BigDecimal amount) {
        log.info("事务ID:" + RootContext.getXID());
        if(balanceTbDao.debit(userId, amount) > 0) {
            return new ResultDto(200, "操作成功", null);
        }
        throw new RuntimeException("账户扣款失败");
    }
}
