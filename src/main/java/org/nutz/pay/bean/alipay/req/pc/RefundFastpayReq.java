package org.nutz.pay.bean.alipay.req.pc;

/**
 * 即时到账有密退款请求参数
 * Created by Howe on 2017/4/18.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class RefundFastpayReq extends Base {

    /**
     * 卖家支付宝账号
     * seller_user_id是以2088开头的纯16位数字。
     */
    private String seller_email;

    public String getSeller_email() {
        return seller_email;
    }

    public void setSeller_email(String seller_email) {
        this.seller_email = seller_email;
    }

    /**
     * 卖家用户ID
     * seller_email是支付宝登录账号，格式一般是邮箱或手机号。
     * 登录时，seller_email和seller_user_id两者必填一个。如果两者都填，以seller_user_id为准。
     */
    private String seller_user_id;

    public String getSeller_user_id() {
        return seller_user_id;
    }

    public void setSeller_user_id(String seller_user_id) {
        this.seller_user_id = seller_user_id;
    }

    /**
     * 退款请求时间
     * 退款请求的当前时间。
     * 格式为：yyyy-MM-dd HH:mm:ss。
     * 不可空
     */
    private String refund_date;

    public String getRefund_date() {
        return refund_date;
    }

    public void setRefund_date(String refund_date) {
        this.refund_date = refund_date;
    }

    /**
     * 退款批次号
     * 每进行一次即时到账批量退款，都需要提供一个批次号，通过该批次号可以查询这一批次的退款交易记录，对于每一个合作伙伴，传递的每一个批次号都必须保证唯一性。
     * 格式为：退款日期（8位）+流水号（3～24位）。
     * 不可重复，且退款日期必须是当天日期。流水号可以接受数字或英文字符，建议使用数字，但不可接受“000”。
     * 不可空
     */
    private String batch_no;

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    /**
     * 总笔数
     * 即参数detail_data的值中，“#”字符出现的数量加1，最大支持1000笔（即“#”字符出现的最大数量为999个）
     * 不可空
     */
    private String batch_num;

    public String getBatch_num() {
        return batch_num;
    }

    public void setBatch_num(String batch_num) {
        this.batch_num = batch_num;
    }

    /**
     * 单笔数据集
     * 退款请求的明细数据。
     * 格式详情参见下面的“单笔数据集参数说明”。
     * 单笔数据集格式为：第一笔交易退款数据集#第二笔交易退款数据集#第三笔交易退款数据集…#第N笔交易退款数据集；
     * 交易退款数据集的格式为：原付款支付宝交易号^退款总金额^退款理由；
     * 不支持退分润功能。
     * detail_data中的退款笔数总和要等于参数batch_num的值；
     * “退款理由”长度不能大于256字节，“退款理由”中不能有“^”、“|”、“$”、“#”等影响detail_data格式的特殊字符；
     * detail_data中退款总金额不能大于交易总金额；
     * 一笔交易可以多次退款，退款次数最多不能超过99次，需要遵守多次退款的总金额不超过该笔交易付款金额的原则。
     * 不可空
     */
    private String detail_data;

    public String getDetail_data() {
        return detail_data;
    }

    public void setDetail_data(String detail_data) {
        this.detail_data = detail_data;
    }
}
