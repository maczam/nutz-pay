package org.nutz.pay.bean.qpay.req;

/**
 * Created by Howe on 2017/4/25.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class RefundQueryReq extends Base {

    /**
     * QQ钱包退款单号
     * 如果传入，则查询refund_id的退款详情，同时忽略out_refund_no参数
     */
    private String refund_id;

    /**
     * 商户退款单号
     * 在refund_id没有传入时，如果传入out_refund_no，
     * 则查询out_refund_no的退款详情
     */
    private String out_refund_no;

    /**
     * QQ钱包订单号
     * 在refund_id，out_refund_no没有传入时，如果传入transaction_id，
     * 则查询transaction_id相关的全部退款详情。
     * transaction_id存在时，则忽略out_trade_no
     */
    private String transaction_id;

    /**
     * 商户订单号
     * 在上面3项都没有传入时，
     * 则查询transaction_id相关的全部退款详情。以上4项必须传入一个
     * 4选1
     */
    private String out_trade_no;

    public String getRefund_id() {
        return refund_id;
    }

    public void setRefund_id(String refund_id) {
        this.refund_id = refund_id;
    }

    public String getOut_refund_no() {
        return out_refund_no;
    }

    public void setOut_refund_no(String out_refund_no) {
        this.out_refund_no = out_refund_no;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }
}
