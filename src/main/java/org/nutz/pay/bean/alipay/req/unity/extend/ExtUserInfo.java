package org.nutz.pay.bean.alipay.req.unity.extend;

/**
 * 外部指定买家
 * Created by howe on 2017/4/22.
 */
public class ExtUserInfo {

    /**
     * 姓名
     * 选填
     */
    private String  name;

    /**
     * 手机号
     * 选填
     */
    private String  mobile;

    /**
     * 实名类型
     * 身份证：IDENTITY_CARD
     * 护照：PASSPORT
     * 军官证：OFFICER_CARD
     * 士兵证：SOLDIER_CARD
     * 户口本：HOKOU等。
     * 如有其它类型需要支持，请与蚂蚁金服工作人员联系。
     * 选填
     */
    private String cert_type;

    /**
     * 证件号
     * 选填
     */
    private String  cert_no;

    /**
     * 是否强制校验付款人身份信息
     * 统一接口定义，T:强制校验，F：不强制
     * 选填
     */
    private String  fix_buyer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    public String getFix_buyer() {
        return fix_buyer;
    }

    public void setFix_buyer(String fix_buyer) {
        this.fix_buyer = fix_buyer;
    }
}
