package org.nutz.pay.bean.qpay.resp;

/**
 * 基础返回
 * Created by Howe on 2017/4/17.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class Base {

    /**
     * 返回状态码
     * SUCCESS/FAIL
     * 此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断
     * 必填
     */
    private String return_code;

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    /**
     * 返回信息
     * 选填
     */
    private String return_msg;

    public String getReturn_msg() {
        return return_msg;
    }

    public void setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
    }

    /**
     * 手Q CGI原始错误码
     * 原始错误码
     * 必填
     */
    private String retcode;

    public String getRetcode() {
        return retcode;
    }

    public void setRetcode(String retcode) {
        this.retcode = retcode;
    }

    /**
     * 手Q CGI原始错误信息
     * 原始错误信息
     * 必填
     */
    private String retmsg;

    public String getRetmsg() {
        return retmsg;
    }

    public void setRetmsg(String retmsg) {
        this.retmsg = retmsg;
    }

    /**
     * 应用ID
     * 腾讯开放平台审核通过的应用APPID
     * 选填
     */
    private String appid;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 商户号
     * QQ钱包分配的商户号
     * 必填
     */
    private String mch_id;

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    /**
     * 商户签名算法规则
     * 商户签名，详见商户签名<a href="https://qpay.qq.com/qpaywiki/showdocument.php?pid=38&docid=57">算法规则</a>
     * 必填
     */
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 业务结果
     * SUCCESS/FAIL
     * 必填
     */
    private String result_code;

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    /**
     * 错误代码
     * 详情见错误代码
     * 错误码                描述                原因                                解决方案
     * LACK_PARAMS           缺少参数            缺少必要的请求参数                  请检查参数是否齐全
     * NOAUTH                商户无此接口权限    商户未开通此接口权限                请商户前往申请此接口权限
     * NOTENOUGH             余额不足            用户的账户额度或者是QQ钱包余额不足  请收银员提示用户更换当前支付的卡，然后请收银员重新扫码。
     * ******************************************************************************建议：商户系统返回给收银台的提示为“用户余额不足提示用户换卡支付”
     * ******************************************************************************用户帐号余额不足，请用户充值或更换支付卡后再支付
     * ORDERCLOSED           订单已关闭          该订单已经被关闭                    订单已经被关闭，请重新下单支付，不需要重复调用关单接口
     * ORDERNOTEXIST         此交易订单号不存在  查询系统中不存在此交易订单号        请商户检查需要查询的订单号是否正确 , 根据实际的情况判断，是否要关闭订单，禁止用户进行支付。
     * ORDERPAID             订单已支付          订单已支付                          订单已支付，不能发起关单，请当作已支付的正常交易，请勿重复发起支付请求。
     * OUT_TRADE_NO_USED     商户订单号重复      同一笔交易不能多次提交              请核实商户订单号是否重复提交
     * PARAM_ERROR           参数错误            请求参数未按指引进行填写            请根据接口返回的详细信息检查您的程序
     * POST_DATA_EMPTY       post数据为空        post数据不能为空                    请检查post数据是否为空。
     * REQUIRE_POST_METHOD   请使用post方法      未使用post传递参数                  请检查请求参数是否通过post方法提交，不要使用GET
     * SIGNERROR             签名错误            参数签名结果不正确                  请检查签名参数和方法是否都符合签名算法要求
     * SYSTEMERROR           系统错误            系统错误                            系统异常，请参数不变，重新调用该API
     * XML_FORMAT_ERROR      XML格式错误         XML格式错误                         请检查XML参数格式是否正确
     * USER_ACCOUNT_ABNORMAL 退款请求失败        用户帐号注销                        此状态代表退款申请失败，商户可自行处理退款。
     * NOTENOUGH             余额不足            商户可用退款余额不足                此状态代表退款申请失败，商户可根据具体的错误提示做相应的处理。
     * INVALID_TRANSACTIONID 无效transaction_id  请求参数未按指引进行填写            请求参数错误，检查原交易号是否存在或发起支付交易接口返回失败
     * APPID_NOT_EXIST       APPID不存在         参数中缺少APPID                     请检查APPID是否正确
     * MCHID_NOT_EXIST       MCHID不存在         参数中缺少MCHID                     请检查MCHID是否正确
     * APPID_MCHID_NOT_MATCH appid和mch_id不匹配 appid和mch_id不匹配                 请确认appid和mch_id是否匹配
     * 选填
     */
    private String err_code;

    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    /**
     * 错误代码描述
     * 错误返回的信息描述
     * 选填
     */
    private String err_code_desc;

    public String getErr_code_desc() {
        return err_code_desc;
    }

    public void setErr_code_desc(String err_code_desc) {
        this.err_code_desc = err_code_desc;
    }

    /**
     * 随机字符串
     * 随机字符串，不长于32位
     * 必填
     */
    private String nonce_str;

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }
}
