package github.clyoudu.storage.service.impl;

import github.clyoudu.storage.dao.StockTbDao;
import github.clyoudu.storage.dto.ResultDto;
import github.clyoudu.storage.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author leichen
 * @date 2020/6/19 5:23 下午
 */
@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockTbDao stockTbDao;

    @Override
    public ResultDto deduct(String productCode, int count) {
        if(stockTbDao.deduct(productCode, count) > 0) {
            return new ResultDto(200, "操作成功", null);
        }
        throw new RuntimeException("库存扣除失败");
    }
}
