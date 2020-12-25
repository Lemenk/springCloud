package top.lemenk.springcloud.controller;

import org.springframework.web.bind.annotation.*;
import top.lemenk.springcloud.po.PaymentPO;
import top.lemenk.springcloud.util.Result;
import top.lemenk.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Description 支付controller
 * @Author liuke@e6yun.com
 * @Created Date: 2020/12/10 13:45
 * @ClassName PaymentController
 * @Remark
 */
@RestController
@RequestMapping("/provider")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @GetMapping("/getInfoById/{id}")
    public Result<PaymentPO> getInfoById(@PathVariable("id") Long id){
        return paymentService.getInfoById(id);
    }

    @PostMapping("/save")
    public Result<Object> save(@RequestBody PaymentPO payment){
        return paymentService.save(payment);
    }
}
