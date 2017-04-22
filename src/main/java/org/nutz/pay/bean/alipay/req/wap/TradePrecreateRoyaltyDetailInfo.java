package org.nutz.pay.bean.alipay.req.wap;

/**
 * 分账明细的信息，可以描述多条分账指令，json数组。
 * Created by Jianghao on 2017/4/21
 *
 * @howechiang
 */
public class TradePrecreateRoyaltyDetailInfo {

    /**
     * 分账序列号，表示分账执行的顺序，必须为正整数
     * 选填
     */
    private Integer serial_no;

    public Integer getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(Integer serial_no) {
        this.serial_no = serial_no;
    }

    /**
     * 接受分账金额的账户类型：
     * userId：支付宝账号对应的支付宝唯一用户号。
     * bankIndex：分账到银行账户的银行编号。目前暂时只支持分账到一个银行编号。
     * storeId：分账到门店对应的银行卡编号。
     * 默认值为userId。
     * 选填
     */
    private String trans_in_type;

    public String getTrans_in_type() {
        return trans_in_type;
    }

    public void setTrans_in_type(String trans_in_type) {
        this.trans_in_type = trans_in_type;
    }

    /**
     * 分账批次号
     * 目前需要和转入账号类型为bankIndex配合使用。
     * 必填
     */
    private String batch_no;

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    /**
     * 商户分账的外部关联号，用于关联到每一笔分账信息，商户需保证其唯一性。
     * 如果为空，该值则默认为“商户网站唯一订单号+分账序列号”
     * 选填
     */
    private String out_relation_id;

    public String getOut_relation_id() {
        return out_relation_id;
    }

    public void setOut_relation_id(String out_relation_id) {
        this.out_relation_id = out_relation_id;
    }

    /**
     * 要分账的账户类型。
     * 目前只支持userId：支付宝账号对应的支付宝唯一用户号。
     * 默认值为userId。
     * 必填
     */
    private String trans_out_type;

    public String getTrans_out_type() {
        return trans_out_type;
    }

    public void setTrans_out_type(String trans_out_type) {
        this.trans_out_type = trans_out_type;
    }

    /**
     * 如果转出账号类型为userId，
     * 本参数为要分账的支付宝账号对应的支付宝唯一用户号。
     * 以2088开头的纯16位数字。
     * 必填
     */
    private String  trans_out;

    public String getTrans_out() {
        return trans_out;
    }

    public void setTrans_out(String trans_out) {
        this.trans_out = trans_out;
    }

    /**
     * 如果转入账号类型为userId，本参数为接受分账金额的支付宝账号对应的支付宝唯一用户号。
     * 以2088开头的纯16位数字。
     * 如果转入账号类型为bankIndex，本参数为28位的银行编号（商户和支付宝签约时确定）。
     * 如果转入账号类型为storeId，本参数为商户的门店ID。
     * 必填
     */
    private String trans_in;

    public String getTrans_in() {
        return trans_in;
    }

    public void setTrans_in(String trans_in) {
        this.trans_in = trans_in;
    }

    /**
     * 分账的金额，单位为元
     * 必填
     */
    private Double amount;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * 分账描述信息
     * 选填
     */
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 分账的比例，
     * 值为20代表按20%的比例分账
     * 选填
     */
    private String amount_percentage;

    public String getAmount_percentage() {
        return amount_percentage;
    }

    public void setAmount_percentage(String amount_percentage) {
        this.amount_percentage = amount_percentage;
    }
}
