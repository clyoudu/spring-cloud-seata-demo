package github.clyoudu.order.service;

import github.clyoudu.order.dto.ResultDto;

/**
 * @author leichen
 * @date 2020/6/19 5:27 下午
 */
public interface OrderService {

    /**
     * 创建订单
     * @param username 用户名称
     * @param productCode 产品编码
     * @param count 产品数量
     * @return
     */
    ResultDto create(String username, String productCode, int count);

}
