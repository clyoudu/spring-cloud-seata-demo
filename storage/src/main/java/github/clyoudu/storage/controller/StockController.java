package github.clyoudu.storage.controller;

import github.clyoudu.storage.dto.ResultDto;
import github.clyoudu.storage.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leichen
 * @date 2020/6/19 5:16 下午
 */
@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("deduct")
    public ResultDto deduct(@RequestParam String productCode, @RequestParam Integer count) {
        return stockService.deduct(productCode, count);
    }

}
