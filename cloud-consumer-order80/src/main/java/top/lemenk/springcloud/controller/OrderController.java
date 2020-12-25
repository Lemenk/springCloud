package top.lemenk.springcloud.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import top.lemenk.springcloud.po.PaymentPO;
import top.lemenk.springcloud.util.Result;

import javax.annotation.Resource;

/**
 * @Description 消费者调用的controller
 * @Author liuke@e6yun.com
 * @Created Date: 2020/12/11 17:19
 * @ClassName OrderController
 * @Remark
 */
@RestController
@RequestMapping("/consumer")
public class OrderController {

    public static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/save")
    public Result<PaymentPO> save(@RequestBody PaymentPO payment){
        return restTemplate.postForObject(PAYMENT_URL+"/provider/save" ,payment, Result.class);
    }

    @GetMapping("/getInfoById/{id}")
    public Result<PaymentPO> getInfoById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/provider/getInfoById/"+id, Result.class);
    }
}
