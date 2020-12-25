package top.lemenk.springcloud.service;

import top.lemenk.springcloud.po.PaymentPO;
import top.lemenk.springcloud.util.Result;

/**
 * @Description 支付service接口
 * @Author liuke@e6yun.com
 * @Created Date: 2020/12/10 13:45
 * @ClassName PaymentService
 * @Remark
 */
public interface PaymentService {

    /**
     * 根据id查询详情
     *
     * @param id 主键id
     * @return top.lemenk.springcloud.po.CommonResult<top.lemenk.springcloud.top.lemenk.springcloud.po.Payment>
     * @Author liuke@e6yun.com
     * @Date 2020/12/10 13:48
     **/
    Result<PaymentPO> getInfoById(Long id);

    /**
     * 新增
     *
     * @param payment 支付信息对象
     * @return java.lang.Integer
     * @Author liuke@e6yun.com
     * @Date 2020/12/11 10:07
     **/
    Result<Object> save(PaymentPO payment);
}
