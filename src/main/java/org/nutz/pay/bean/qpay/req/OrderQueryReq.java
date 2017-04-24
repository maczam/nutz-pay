package org.nutz.pay.bean.qpay.req;

/**
 * Created by howe on 2017/4/24.
 */
public class OrderQueryReq extends Base {

    /**
     * QQ钱包订单号
     * QQ钱包订单号，优先使用
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
     * 商户系统内部的订单号
     * 32个字符内、可包含字母
     * 说明见商户订单号,当没传入transaction_id时必须传该参数
     * 2选1
     */
    private String out_trade_no;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }
}
