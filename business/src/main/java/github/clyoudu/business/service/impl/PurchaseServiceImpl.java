package github.clyoudu.business.service.impl;

import github.clyoudu.business.dto.ResultDto;
import github.clyoudu.business.service.PurchaseService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

/**
 * @author leichen
 * @date 2020/6/19 5:44 下午
 */
@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @GlobalTransactional(timeoutMills = 300000, name = "business")
    public ResultDto purchase(Integer userId, String username, String productCode, Integer count, BigDecimal amount) {
        restTemplate.getForEntity("http://account/debit?userId=" + userId + "&amount=" + amount, ResultDto.class).getBody();
        restTemplate.getForEntity("http://storage/deduct?productCode=" + productCode + "&count=" + count, ResultDto.class).getBody();
        restTemplate.getForEntity("http://order/create?username=" + username + "&productCode=" + productCode + "&count=" + count + "&amount=" + amount, ResultDto.class).getBody();
        return new ResultDto(200, "支付成功", null);
    }
}
