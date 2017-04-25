package org.nutz.pay.bean.qpay.req;

/**
 * <a href="https://qpay.qq.com/qpaywiki/showdocument.php?pid=38&docid=62">申请退款</a>
 * Created by Howe on 2017/4/25.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class RefundReq extends Base {

    /**
     * QQ钱包订单号
     * QQ钱包订单号，优先使用
     */
    private String transaction_id;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    /**
     * 商户订单号
     * 商户系统内部的订单号,32个字符内、可包含字母，说明见商户订单号
     * 当没提供transaction_id时需要传入该参数
     * 2选1
     */
    private String out_trade_no;

    public String getOut_refund_no() {
        return out_refund_no;
    }

    public void setOut_refund_no(String out_refund_no) {
        this.out_refund_no = out_refund_no;
    }

    /**
     * 商户退款单号
     * 商户系统内部的退款单号，商户系统内部唯一，同一退款单号多次请求只退一笔
     * 必填
     */
    private String out_refund_no;

    public Integer getRefund_fee() {
        return refund_fee;
    }

    public void setRefund_fee(Integer refund_fee) {
        this.refund_fee = refund_fee;
    }

    /**
     * 退款申请金额
     * 本次退款申请的退回金额。单位：分。币种：人民币
     * 必填
     */
    private Integer refund_fee;

    public String getOp_user_id() {
        return op_user_id;
    }

    public void setOp_user_id(String op_user_id) {
        this.op_user_id = op_user_id;
    }

    /**
     * 操作员ID
     * 操作员帐号, 默认为商户号
     * 必填
     */
    private String op_user_id;

    public String getOp_user_passwd() {
        return op_user_passwd;
    }

    public void setOp_user_passwd(String op_user_passwd) {
        this.op_user_passwd = op_user_passwd;
    }

    /**
     * 操作员密码的MD5
     * 操作员密码的MD5
     * 必填
     */
    private String op_user_passwd;

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }
}
