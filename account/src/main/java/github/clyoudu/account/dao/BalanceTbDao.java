package github.clyoudu.account.dao;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @author leichen
 * @date 2020/6/19 4:41 下午
 */
@Repository
public class BalanceTbDao extends BaseDao {

    public int debit(Integer userId, BigDecimal amount) {
        return dslContext.execute("update balance_tb set balance = balance - " + amount + " where id = " + userId);
    }

}
