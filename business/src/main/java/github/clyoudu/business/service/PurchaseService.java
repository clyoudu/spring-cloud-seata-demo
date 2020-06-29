package github.clyoudu.business.service;

import github.clyoudu.business.dto.ResultDto;

import java.math.BigDecimal;

/**
 * @author leichen
 */
public interface PurchaseService {

    /**
     * 支付
     * @param userId 用户ID
     * @param username 用户姓名
     * @param productCode 商品编码
     * @param count 商品数量
     * @param amount 商品总额
     * @return
     */
    ResultDto purchase(Integer userId, String username, String productCode, Integer count, BigDecimal amount);

}
