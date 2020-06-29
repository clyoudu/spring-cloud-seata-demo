package github.clyoudu.order.controller;

import github.clyoudu.order.dto.ResultDto;
import github.clyoudu.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leichen
 * @date 2020/6/19 5:31 下午
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("create")
    public ResultDto create(@RequestParam String username, @RequestParam String productCode, @RequestParam Integer count) {
        return orderService.create(username, productCode, count);
    }

}
