package org.nutz.pay.bean.alipay.req;

/**
 * 支付宝通知校验接口
 * Created by howe on 2017/4/18.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class NotifyVerifyReq {

    /**
     * 接口名称
     * 接口名称
     * 不可空
     */
    private String service;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    /**
     * 合作者身份ID
     * 签约的支付宝账号对应的支付宝唯一用户号。
     * 不可空
     */
    private String partner;

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }


    /**
     * 通知校验ID
     * 支付宝通知校验ID，商户可以用这个流水号询问支付宝该条通知的合法性。
     * 不可空
     */
    private String notify_id;

    public String getNotify_id() {
        return notify_id;
    }

    public void setNotify_id(String notify_id) {
        this.notify_id = notify_id;
    }
}
