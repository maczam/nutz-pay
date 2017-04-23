package org.nutz.pay.bean.alipay.resp.unity;

import org.nutz.pay.bean.alipay.resp.unity.extend.TradeFundBil;
import org.nutz.pay.bean.alipay.resp.unity.extend.VoucherDetail;

import java.util.Date;
import java.util.List;

/**
 * Created by howe on 2017/4/22.
 */
public class TradePayResp extends Base {

    /**
     * 错误码	                                    错误描述	            解决方案
     * ACQ.SYSTEM_ERROR	                            接口返回错误	        请立即调用查询订单API，查询当前订单的状态，并根据订单状态决定下一步的操作，如果多次调用依然报此错误码，请联系支付宝客服。
     * ACQ.INVALID_PARAMETER	                    参数无效	            检查请求参数，修改后重新发起请求
     * ACQ.ACCESS_FORBIDDEN	                        无权限使用接口	    未签约条码支付或者合同已到期
     * ACQ.EXIST_FORBIDDEN_WORD	                    订单信息中包含违禁词	修改订单信息后，重新发起请求
     * ACQ.PARTNER_ERROR	                        应用APP_ID填写错误	联系支付宝小二，确认APP_ID的状态
     * ACQ.TOTAL_FEE_EXCEED	                        订单总金额超过限额	    修改订单金额再发起请求
     * ACQ.PAYMENT_AUTH_CODE_INVALID	            支付授权码无效	    用户刷新条码后，重新扫码发起请求
     * ACQ.CONTEXT_INCONSISTENT	                    交易信息被篡改	    更换商家订单号后，重新发起请求
     * ACQ.TRADE_HAS_SUCCESS	                    交易已被支付	        确认该笔交易信息是否为当前买家的，如果是则认为交易付款成功，如果不是则更换商家订单号后，重新发起请求
     * ACQ.TRADE_HAS_CLOSE	                        交易已经关闭	        更换商家订单号后，重新发起请求
     * ACQ.BUYER_BALANCE_NOT_ENOUGH	                买家余额不足	        买家绑定新的银行卡或者支付宝余额有钱后再发起支付
     * ACQ.BUYER_BANKCARD_BALANCE_NOT_ENOUGH	    用户银行卡余额不足	    建议买家更换支付宝进行支付或者更换其它付款方式
     * ACQ.ERROR_BALANCE_PAYMENT_DISABLE	        余额支付功能关闭	    用户打开余额支付开关后，再重新进行支付
     * ACQ.BUYER_SELLER_EQUAL	                    买卖家不能相同	    更换买家重新付款
     * ACQ.TRADE_BUYER_NOT_MATCH	                交易买家不匹配	    更换商家订单号后，重新发起请求
     * ACQ.BUYER_ENABLE_STATUS_FORBID	            买家状态非法	        用户联系支付宝小二，确认买家状态为什么非法
     * ACQ.PULL_MOBILE_CASHIER_FAIL	                唤起移动收银台失败	    用户刷新条码后，重新扫码发起请求
     * ACQ.MOBILE_PAYMENT_SWITCH_OFF	            用户的无线支付开关关闭	用户在PC上打开无线支付开关后，再重新发起支付
     * ACQ.PAYMENT_FAIL	                            支付失败	            用户刷新条码后，重新发起请求，如果重试一次后仍未成功，更换其它方式付款
     * ACQ.BUYER_PAYMENT_AMOUNT_DAY_LIMIT_ERROR	    买家付款日限额超限	    更换买家进行支付
     * ACQ.BEYOND_PAY_RESTRICTION	                商户收款额度超限	    联系支付宝小二提高限额
     * ACQ.BEYOND_PER_RECEIPT_RESTRICTION	        商户收款金额超过月限额	联系支付宝小二提高限额
     * ACQ.BUYER_PAYMENT_AMOUNT_MONTH_LIMIT_ERROR   买家付款月额度超限	    让买家更换账号后，重新付款或者更换其它付款方式
     * ACQ.SELLER_BEEN_BLOCKED	                    商家账号被冻结	    联系支付宝小二，解冻账号
     * ACQ.ERROR_BUYER_CERTIFY_LEVEL_LIMIT	        买家未通过人行认证	    让用户联系支付宝小二并更换其它付款方式
     * ACQ.PAYMENT_REQUEST_HAS_RISK	                支付有风险	        更换其它付款方式
     * ACQ.NO_PAYMENT_INSTRUMENTS_AVAILABLE	        没用可用的支付工具	    更换其它付款方式
     * ACQ.USER_FACE_PAYMENT_SWITCH_OFF	            用户当面付付款开关关闭	让用户在手机上打开当面付付款开关
     * ACQ.INVALID_STORE_ID	                        商户门店编号无效	    检查传入的门店编号是否有效
     */

    /**
     * 支付宝交易号
     * 必填
     */
    private String trade_no;

    public java.lang.String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(java.lang.String trade_no) {
        this.trade_no = trade_no;
    }

    /**
     * 商户订单号
     * 64个字符以内、只能包含字母、数字、下划线；需保证在商户端不重复
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
     * 买家支付宝账号
     * 选填
     */
    private String buyer_logon_id;

    public String getBuyer_logon_id() {
        return buyer_logon_id;
    }

    public void setBuyer_logon_id(String buyer_logon_id) {
        this.buyer_logon_id = buyer_logon_id;
    }

    /**
     * 交易金额
     * 必填
     */
    private Double total_amount;

    public Double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Double total_amount) {
        this.total_amount = total_amount;
    }

    /**
     * 实收金额
     * 必填
     */
    private Double receipt_amount;

    public Double getReceipt_amount() {
        return receipt_amount;
    }

    public void setReceipt_amount(Double receipt_amount) {
        this.receipt_amount = receipt_amount;
    }

    /**
     * 	买家付款的金额
     * 	选填
     */
    private Double buyer_pay_amount;

    public Double getBuyer_pay_amount() {
        return buyer_pay_amount;
    }

    public void setBuyer_pay_amount(Double buyer_pay_amount) {
        this.buyer_pay_amount = buyer_pay_amount;
    }

    /**
     * 使用积分宝付款的金额
     * 选填
     */
    private Double point_amount;

    public Double getPoint_amount() {
        return point_amount;
    }

    public void setPoint_amount(Double point_amount) {
        this.point_amount = point_amount;
    }

    /**
     * 交易中可给用户开具发票的金额
     * 选填
     */
    private Double invoice_amount;

    public Double getInvoice_amount() {
        return invoice_amount;
    }

    public void setInvoice_amount(Double invoice_amount) {
        this.invoice_amount = invoice_amount;
    }

    /**
     * 	交易支付时间
     * 	必填
     */
    private Date gmt_payment;

    public Date getGmt_payment() {
        return gmt_payment;
    }

    public void setGmt_payment(Date gmt_payment) {
        this.gmt_payment = gmt_payment;
    }

    /**
     * 交易支付使用的资金渠道
     * 必填
     */
    private List<TradeFundBil> fund_bill_list;

    public List<TradeFundBil> getFund_bill_list() {
        return fund_bill_list;
    }

    public void setFund_bill_list(List<TradeFundBil> fund_bill_list) {
        this.fund_bill_list = fund_bill_list;
    }

    /**
     * 支付宝卡余额
     * 选填
     */
    private Double card_balance;

    public Double getCard_balance() {
        return card_balance;
    }

    public void setCard_balance(Double card_balance) {
        this.card_balance = card_balance;
    }

    /**
     * 发生支付交易的商户门店名称
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
     * 	买家在支付宝的用户id
     * 	必填
     */
    private String buyer_user_id;

    public java.lang.String getBuyer_user_id() {
        return buyer_user_id;
    }

    public void setBuyer_user_id(java.lang.String buyer_user_id) {
        this.buyer_user_id = buyer_user_id;
    }

    /**
     * 本次交易支付所使用的单品券优惠的商品优惠信息
     * 必填
     */
    private  String discount_goods_detail;

    public java.lang.String getDiscount_goods_detail() {
        return discount_goods_detail;
    }

    public void setDiscount_goods_detail(java.lang.String discount_goods_detail) {
        this.discount_goods_detail = discount_goods_detail;
    }

    /**
     * 本交易支付时使用的所有优惠券信息
     * 选填
     */
    private List<VoucherDetail> voucher_detail_list;

    public List<VoucherDetail> getVoucher_detail_list() {
        return voucher_detail_list;
    }

    public void setVoucher_detail_list(List<VoucherDetail> voucher_detail_list) {
        this.voucher_detail_list = voucher_detail_list;
    }
}
