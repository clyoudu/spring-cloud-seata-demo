package github.clyoudu.account.controller;

import github.clyoudu.account.dto.ResultDto;
import github.clyoudu.account.sercice.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author leichen
 * @date 2020/6/19 5:39 下午
 */
@RestController
public class BalanceController {

    @Autowired
    private BalanceService balanceService;

    @GetMapping("debit")
    public ResultDto purchase(@RequestParam Integer userId, @RequestParam BigDecimal amount) {
        return balanceService.debit(userId, amount);
    }

}
