package github.clyoudu.business.controller;

import github.clyoudu.business.dto.ResultDto;
import github.clyoudu.business.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author leichen
 * @date 2020/6/19 5:42 下午
 */
@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("purchase")
    public ResultDto purchase(@RequestParam Integer userId, @RequestParam String username, @RequestParam String productCode, @RequestParam Integer count, @RequestParam BigDecimal amount) {
        return purchaseService.purchase(userId, username, productCode, count, amount);
    }

}
