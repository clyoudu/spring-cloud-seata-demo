package github.clyoudu.storage.service;

import github.clyoudu.storage.dto.ResultDto;

/**
 * @author leichen
 * @date 2020/6/19 5:22 下午
 */
public interface StockService {

    /**
     * 扣除库存
     * @param productCode 商品编码
     * @param count 数量
     * @return
     */
    ResultDto deduct(String productCode, int count);

}
