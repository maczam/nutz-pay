package org.nutz.pay.bean.alipay.req.wap;

/**
 * 二级商户信息,当前只对特殊银行机构特定场景下使用此字段
 * Created by Jianghao on 2017/4/21
 *
 * @howechiang
 */
public class TradePrecreateSubMerchan {

    /**
     * 二级商户的支付宝id
     * 必填
     */
    private String merchant_id;

    public String getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
    }
}
