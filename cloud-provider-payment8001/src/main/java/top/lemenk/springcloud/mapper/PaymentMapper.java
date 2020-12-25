package top.lemenk.springcloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.lemenk.springcloud.po.PaymentPO;

/**
 * @Description TODO
 * @Author liuke@e6yun.com
 * @Created Date: 2020/12/10 13:49
 * @ClassName PaymentMapper
 * @Remark
 */
@Mapper
public interface PaymentMapper {

    /**
     * 根据id查询
     *
     * @Author liuke@e6yun.com
     * @Date 2020/12/10 13:54
     * @param id 主键id
     * @return top.lemenk.springcloud.top.lemenk.springcloud.po.Payment
     **/
    PaymentPO getInfoById(Long id);

    /**
     * 新增
     * 
     * @Author liuke@e6yun.com
     * @Date 2020/12/11 10:07
     * @param payment 支付信息对象
     * @return java.lang.Integer
     **/
    Integer save(PaymentPO payment);
}
