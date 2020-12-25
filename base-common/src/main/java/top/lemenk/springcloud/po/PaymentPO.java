package top.lemenk.springcloud.po;


import java.io.Serializable;

/**
 * @Description 支付实体类
 * @Author liuke@e6yun.com
 * @Created Date: 2020/11/27 17:14
 * @ClassName Payment
 * @Remark
 */
public class PaymentPO implements Serializable {
    private Long id;
    private String serial;

    public Long getId() {
        return id;
    }

    public PaymentPO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getSerial() {
        return serial;
    }

    public PaymentPO setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                '}';
    }
}
