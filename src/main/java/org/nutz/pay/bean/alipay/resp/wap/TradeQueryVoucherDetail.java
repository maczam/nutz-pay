package org.nutz.pay.bean.alipay.resp.wap;

/**
 * 本交易支付时使用的所有优惠券信息
 * Created by Jianghao on 2017/4/22
 *
 * @howechiang
 */
public class TradeQueryVoucherDetail {

    /**
     * 券id
     * 必填
     */
    private String  id;

    /**
     * 券名称
     * 必填
     */
    private String name;

    /**
     * 当前有三种类型
     * ALIPAY_FIX_VOUCHER - 全场代金券
     * ALIPAY_DISCOUNT_VOUCHER - 折扣券
     * ALIPAY_ITEM_VOUCHER - 单品优惠
     * 注：不排除将来新增其他类型的可能，商家接入时注意兼容性避免硬编码
     * 必填
     */
    private String type;

    /**
     * 优惠券面额，它应该会等于商家出资加上其他出资方出资
     * 必填
     */
    private Double amount;

    /**
     * 商家出资（特指发起交易的商家出资金额）
     * 选填
     */
    private Double merchant_contribute;

    /**
     * 其他出资方出资金额
     * 可能是支付宝，可能是品牌商，或者其他方，也可能是他们的一起出资
     * 选填
     */
    private Double other_contribute;

    /**
     * 优惠券备注信息
     * 选填
     */
    private String memo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getMerchant_contribute() {
        return merchant_contribute;
    }

    public void setMerchant_contribute(Double merchant_contribute) {
        this.merchant_contribute = merchant_contribute;
    }

    public Double getOther_contribute() {
        return other_contribute;
    }

    public void setOther_contribute(Double other_contribute) {
        this.other_contribute = other_contribute;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
