package github.clyoudu.order.service.impl;

import github.clyoudu.order.dao.OrderTbDao;
import github.clyoudu.order.dto.ResultDto;
import github.clyoudu.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author leichen
 * @date 2020/6/19 5:29 下午
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderTbDao orderTbDao;

    @Override
    public ResultDto create(String username, String productCode, int count) {
        int orderId = orderTbDao.create(username, productCode, count);
        if (orderId > 0) {
            return new ResultDto(200, "创建成功", orderId);
        }
        throw new RuntimeException("订单创建失败");
    }
}
