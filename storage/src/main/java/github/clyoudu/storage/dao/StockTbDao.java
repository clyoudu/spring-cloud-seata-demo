package github.clyoudu.storage.dao;

import org.springframework.stereotype.Repository;

/**
 * @author leichen
 * @date 2020/6/19 5:12 下午
 */
@Repository
public class StockTbDao extends BaseDao {

    public int deduct(String productCode, int count) {
        return dslContext.execute("update stock_tb set count = count - ? where product_code = ?", count, productCode);
    }

}
