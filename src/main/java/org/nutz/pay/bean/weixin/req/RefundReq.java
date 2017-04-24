package org.nutz.pay.bean.weixin.req;

/**
 * Created by Howe on 2017/4/24.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class RefundReq extends Base {

    /**
     * 设备号
     * 自定义参数，可以为请求支付的终端设备号等
     * 选填
     */
    private String device_info;

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    /**
     * 微信订单号
     * 微信的订单号，建议优先使用
     */
    private String transaction_id;

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    /**
     * 商户订单号
     * 商户系统内部的订单号，请确保在同一商户号下唯一。
     * 二选一
     */
    private String out_trade_no;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    /**
     * 商户退款单号
     * 商户系统内部的退款单号，商户系统内部唯一，
     * 同一退款单号多次请求只退一笔
     * 必填
     */
    private String out_refund_no;

    public String getOut_refund_no() {
        return out_refund_no;
    }

    public void setOut_refund_no(String out_refund_no) {
        this.out_refund_no = out_refund_no;
    }

    /**
     * 订单金额
     * 订单总金额，单位为分，只能为整数，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_2">支付金额</a>
     * 必填
     */
    private Integer total_fee;

    public Integer getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(Integer total_fee) {
        this.total_fee = total_fee;
    }

    /**
     * 退款金额
     * 退款总金额，订单总金额，单位为分，只能为整数，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_2">支付金额</a>
     * 必填
     */
    private Integer refund_fee;

    public Integer getRefund_fee() {
        return refund_fee;
    }

    public void setRefund_fee(Integer refund_fee) {
        this.refund_fee = refund_fee;
    }


}
