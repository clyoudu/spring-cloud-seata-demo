package github.clyoudu.account.sercice;

import github.clyoudu.account.dto.ResultDto;

import java.math.BigDecimal;

/**
 * @author leichen
 * @date 2020/6/19 5:33 下午
 */
public interface BalanceService {

    /**
     * 账户扣款
     * @param userId 用户ID
     * @param amount 账单金额
     * @return
     */
    ResultDto debit(int userId, BigDecimal amount);

}
