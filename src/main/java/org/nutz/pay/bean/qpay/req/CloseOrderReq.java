package org.nutz.pay.bean.qpay.req;

/**
 * Created by Howe on 2017/4/25.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class CloseOrderReq extends Base {

    /**
     * 商户订单号
     * 商户系统内部的订单号
     * 32个字符内、可包含字母。其它说明见商户订单号
     * 必填
     */
    private String out_trade_no;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    /**
     * 订单金额
     * 订单总金额，单位为分，只能为整数，详见交易金额
     * 选填
     */
    private Integer total_fee;

    public Integer getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(Integer total_fee) {
        this.total_fee = total_fee;
    }
}
