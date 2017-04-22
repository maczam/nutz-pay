package org.nutz.pay.bean.alipay.resp.wap;

import java.util.Date;
import java.util.List;

/**
 * 统一收单交易退款接口
 * Created by Jianghao on 2017/4/22
 *
 * @howechiang
 */
public class TradeRefundResp extends Base {

    /**
     * 支付宝交易号
     * 必填
     */
    private String trade_no;

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(java.lang.String trade_no) {
        this.trade_no = trade_no;
    }

    /**
     * 商户订单号
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
     * 买家支付宝用户号
     * 该参数已废弃，请不要使用
     * 必填
     */
    private String open_id;

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    /**
     * 买家用户的登录id
     * 必填
     */
    private String buyer_logon_id;

    public String getBuyer_logon_id() {
        return buyer_logon_id;
    }

    public void setBuyer_logon_id(String buyer_logon_id) {
        this.buyer_logon_id = buyer_logon_id;
    }

    /**
     * 本次退款是否发生了资金变化
     * Y/N
     * 必填
     */
    private String fund_change;

    public String getFund_change() {
        return fund_change;
    }

    public void setFund_change(String fund_change) {
        this.fund_change = fund_change;
    }

    /**
     * 退款总金额
     * 必填
     */
    private Double refund_fee;

    public Double getRefund_fee() {
        return refund_fee;
    }

    public void setRefund_fee(Double refund_fee) {
        this.refund_fee = refund_fee;
    }

    /**
     * 退款支付时间
     * 必填
     */
    private Date gmt_refund_pay;

    public Date getGmt_refund_pay() {
        return gmt_refund_pay;
    }

    public void setGmt_refund_pay(Date gmt_refund_pay) {
        this.gmt_refund_pay = gmt_refund_pay;
    }

    /**
     * 退款使用的资金渠道
     * 选填
     */
    private List<TradeRefundDetailItem> refund_detail_item_list;

    public List<TradeRefundDetailItem> getRefund_detail_item_list() {
        return refund_detail_item_list;
    }

    public void setRefund_detail_item_list(List<TradeRefundDetailItem> refund_detail_item_list) {
        this.refund_detail_item_list = refund_detail_item_list;
    }

    /**
     * 交易在支付时候的门店名称
     * 选填
     */
    private String store_name;

    public java.lang.String getStore_name() {
        return store_name;
    }

    public void setStore_name(java.lang.String store_name) {
        this.store_name = store_name;
    }

    /**
     * 买家在支付宝的用户id
     * 必填
     */
    private String buyer_user_id;

    public java.lang.String getBuyer_user_id() {
        return buyer_user_id;
    }

    public void setBuyer_user_id(java.lang.String buyer_user_id) {
        this.buyer_user_id = buyer_user_id;
    }
}
