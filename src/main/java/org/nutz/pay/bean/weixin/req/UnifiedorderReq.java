package org.nutz.pay.bean.weixin.req;

/**
 * <a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=9_1">统一下单</a>
 * Created by Howe on 2017/4/17.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class UnifiedorderReq extends Base {

    /**
     * 设备号
     * 自定义参数，可以为终端设备号(门店号或收银设备ID)，PC网页或公众号内支付可以传"WEB"
     * 选填
     */
    private String device_info;

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    /**
     * 商品描述
     * 商品简单描述，该字段请按照规范传递，具体请见<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_2">参数规定</a>
     * 必填
     */
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * 商品详情
     * 单品优惠字段(暂未上线)
     * 选填
     */
    private String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * 附加数据
     * 附加数据，在查询API和支付通知中原样返回，可作为自定义参数使用。
     * 选填
     */
    private String attach;

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    /**
     * 商户订单号
     * 商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。 详见<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_2">商户订单号</a>
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
     * 标价币种
     * 符合ISO 4217标准的三位字母代码，默认人民币：CNY，详细列表请参见<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_2">货币类型</a>
     * 选填
     */
    private String fee_type;

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    /**
     * 标价金额
     * 订单总金额，单位为分，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_2">支付金额</a>
     * 必填
     */
    private Integer total_fee;

    public Integer getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(Integer total_fee) {
        this.total_fee = total_fee;
    }

    /**
     * 终端IP
     * APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP。
     * 必填
     */
    private String spbill_create_ip;

    public String getSpbill_create_ip() {
        return spbill_create_ip;
    }

    public void setSpbill_create_ip(String spbill_create_ip) {
        this.spbill_create_ip = spbill_create_ip;
    }

    /**
     * 交易起始时间
     * 订单生成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。其他详见<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_2">时间规则</a>
     * 选填
     */
    private String time_start;

    public String getTime_start() {
        return time_start;
    }

    public void setTime_start(String time_start) {
        this.time_start = time_start;
    }

    /**
     * 交易结束时间
     * 订单失效时间，格式为yyyyMMddHHmmss，如2009年12月27日9点10分10秒表示为20091227091010。其他详见<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_2">时间规则</a>
     * <strong>注意：最短失效时间间隔必须大于5分钟</strong>
     * 选填
     */
    private String time_expire;

    public String getTime_expire() {
        return time_expire;
    }

    public void setTime_expire(String time_expire) {
        this.time_expire = time_expire;
    }

    /**
     * 商品标记
     * 商品标记，使用代金券或立减优惠功能时需要的参数，说明详见<a href="https://pay.weixin.qq.com/wiki/doc/api/tools/sp_coupon.php?chapter=12_1">代金券或立减优惠</a>
     * 选填
     */
    private String goods_tag;

    public String getGoods_tag() {
        return goods_tag;
    }

    public void setGoods_tag(String goods_tag) {
        this.goods_tag = goods_tag;
    }

    /**
     * 通知地址
     * 异步接收微信支付结果通知的回调地址，通知url必须为外网可访问的url，不能携带参数。
     * 必填
     */
    private String notify_url;

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    /**
     * 交易类型
     * 取值如下：JSAPI，NATIVE，APP等，说明详见<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_2">参数规定</a>
     * 必填
     */
    private String trade_type;

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    /**
     * 商品ID
     * trade_type=NATIVE时（即扫码支付），此参数必传。此参数为二维码中包含的商品ID，商户自行定义。
     * 选填
     */
    private String product_id;

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    /**
     * 指定支付方式
     * 上传此参数no_credit--可限制用户不能使用信用卡支付
     * 选填
     */
    private String limit_pay;

    public String getLimit_pay() {
        return limit_pay;
    }

    public void setLimit_pay(String limit_pay) {
        this.limit_pay = limit_pay;
    }

    /**
     * 用户标识
     * trade_type=JSAPI时（即公众号支付），此参数必传，此参数为微信用户在商户对应appid下的唯一标识。
     * openid如何获取，可参考【<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_4">获取openid</a>】。
     * 企业号请使用【<a href="http://qydev.weixin.qq.com/wiki/index.php?title=OAuth%E9%AA%8C%E8%AF%81%E6%8E%A5%E5%8F%A3">企业号OAuth2.0接口</a>】获取企业号内成员userid，
     * 再调用【<a href="http://qydev.weixin.qq.com/wiki/index.php?title=Userid%E4%B8%8Eopenid%E4%BA%92%E6%8D%A2%E6%8E%A5%E5%8F%A3">企业号userid转openid接口</a>】进行转换
     * 选填
     */
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

}
