package org.nutz.pay.bean.alipay.resp.wap;

/**
 * Created by Jianghao on 2017/4/21
 *
 * @howechiang
 */
public class TradePrecreateResp extends Base {

    /**
     * 错误码	                                    错误描述	            解决方案
     * ACQ.SYSTEM_ERROR	                            接口返回错误	        请立即调用查询订单API，查询当前订单的状态，并根据订单状态决定下一步的操作
     * ACQ.INVALID_PARAMETER	                    参数无效	            检查请求参数，修改后重新发起请求
     * ACQ.ACCESS_FORBIDDEN	                        无权限使用接口	        联系支付宝小二签约
     * ACQ.EXIST_FORBIDDEN_WORD	                    订单信息中包含违禁词	修改订单信息后，重新发起请求
     * ACQ.PARTNER_ERROR	                        应用APP_ID填写错误	    联系支付宝小二，确认APP_ID的状态
     * ACQ.TOTAL_FEE_EXCEED	                        订单总金额超过限额	    修改订单金额再发起请求
     * ACQ.CONTEXT_INCONSISTENT	                    交易信息被篡改	        更换商家订单号后，重新发起请求
     * ACQ.TRADE_HAS_SUCCESS	                    交易已被支付	        确认该笔交易信息是否为当前买家的，如果是则认为交易付款成功，如果不是则更换商家订单号后，重新发起请求
     * ACQ.TRADE_HAS_CLOSE	                        交易已经关闭	        更换商家订单号后，重新发起请求
     * ACQ.BUYER_SELLER_EQUAL	                    买卖家不能相同	        更换买家重新付款
     * ACQ.TRADE_BUYER_NOT_MATCH	                交易买家不匹配	        更换商家订单号后，重新发起请求
     * ACQ.BUYER_ENABLE_STATUS_FORBID	            买家状态非法	        用户联系支付宝小二，确认买家状态为什么非法
     * ACQ.BUYER_PAYMENT_AMOUNT_DAY_LIMIT_ERROR	    买家付款日限额超限	    更换买家进行支付
     * ACQ.BEYOND_PAY_RESTRICTION	                商户收款额度超限	    联系支付宝小二提高限额
     * ACQ.BEYOND_PER_RECEIPT_RESTRICTION	        商户收款金额超过月限额	联系支付宝小二提高限额
     * ACQ.BUYER_PAYMENT_AMOUNT_MONTH_LIMIT_ERROR	买家付款月额度超限	    让买家更换账号后，重新付款或者更换其它付款方式
     * ACQ.SELLER_BEEN_BLOCKED	                    商家账号被冻结	        联系支付宝小二，解冻账号
     * ACQ.ERROR_BUYER_CERTIFY_LEVEL_LIMIT	        买家未通过人行认证	    让用户联系支付宝小二并更换其它付款方式
     * ACQ.INVALID_STORE_ID	                        商户门店编号无效	    检查传入的门店编号是否符合规则
     */

    /**
     * 商户的订单号
     * 必填
     */
    private String out_trade_no;

    public java.lang.String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(java.lang.String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    /**
     * 当前预下单请求生成的二维码码串，可以用二维码生成工具根据该码串值生成对应的二维码
     * 必填
     */
    private String qr_code;

    public java.lang.String getQr_code() {
        return qr_code;
    }

    public void setQr_code(java.lang.String qr_code) {
        this.qr_code = qr_code;
    }
}
