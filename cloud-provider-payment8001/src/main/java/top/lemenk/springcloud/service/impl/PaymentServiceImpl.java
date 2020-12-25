package top.lemenk.springcloud.service.impl;

import top.lemenk.springcloud.constant.CodeConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import top.lemenk.springcloud.po.PaymentPO;
import top.lemenk.springcloud.util.Result;
import top.lemenk.springcloud.mapper.PaymentMapper;
import top.lemenk.springcloud.service.PaymentService;
import top.lemenk.springcloud.util.ResultWrapperUtil;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @Description 支付实现类
 * @Author liuke@e6yun.com
 * @Created Date: 2020/12/10 13:45
 * @ClassName PaymentServiceImpl
 * @Remark
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    private static final Logger logger = LoggerFactory.getLogger(PaymentServiceImpl.class);

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public Result<PaymentPO> getInfoById(Long id) {
        PaymentPO payment = paymentMapper.getInfoById(id);
        return ResultWrapperUtil.ok(payment);
    }

    @Override
    public Result<Object> save(PaymentPO payment) {
        if (Objects.isNull(payment)){
            return ResultWrapperUtil.illegalArgument();
        }
        Integer saveId = paymentMapper.save(payment);
        logger.info("新增，payment={}",payment);
        if (saveId > 0){
            return ResultWrapperUtil.ok(CodeConstant.SAVE_SUCCESS_MESSAGE);
        }else {
            return ResultWrapperUtil.error(CodeConstant.SAVE_ERROR_MESSAGE);
        }
    }
}
