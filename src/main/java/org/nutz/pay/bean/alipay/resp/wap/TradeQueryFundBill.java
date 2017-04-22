package org.nutz.pay.bean.alipay.resp.wap;

/**
 * 交易支付使用的资金渠道
 * Created by Jianghao on 2017/4/22
 *
 * @howechiang
 */
public class TradeQueryFundBill {

    /**
     * 交易使用的资金渠道
     * 详见 支付渠道列表
     * 必填
     * 支付渠道代码	    支付渠道
     * COUPON	        支付宝红包
     * ALIPAYACCOUNT	支付宝账户
     * POINT	        集分宝
     * DISCOUNT	        折扣券
     * PCARD	        预付卡
     * MCARD	        商家储值卡
     * MDISCOUNT	    商户优惠券
     * MCOUPON	        商户红包
     * PCREDIT	        蚂蚁花呗
     */
    private String fund_channel;

    public String getFund_channel() {
        return fund_channel;
    }

    public void setFund_channel(String fund_channel) {
        this.fund_channel = fund_channel;
    }

    /**
     * 该支付工具类型所使用的金额
     * 选填
     */
    private Double amount;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * 渠道实际付款金额
     * 选填
     */
    private Double real_amount;

    public Double getReal_amount() {
        return real_amount;
    }

    public void setReal_amount(Double real_amount) {
        this.real_amount = real_amount;
    }
}
