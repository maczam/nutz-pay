package org.nutz.pay.bean.weixin.resp;

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
     * 返回信息，如非空，为错误原因
     * 选填
     */
    private String return_msg;

    /**
     * 公众账号ID
     * 调用接口提交的公众账号ID
     * 必填
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
     * 调用接口提交的商户号
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
     * 随机字符串
     * 微信返回的随机字符串
     * 必填
     */
    private String nonce_str;

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    /**
     * 签名
     * 微信返回的签名值，详见<a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_3">签名算法</a>
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
     * 详细参见下文错误列表
     * 名称	                  描述	               原因	                         解决方案
     * NOAUTH	              商户无此接口权限     商户未开通此接口权限	         请商户前往申请此接口权限
     * NOTENOUGH	          余额不足	           用户帐号余额不足	             用户帐号余额不足，请用户充值或更换支付卡后再支付
     * ORDERPAID	          商户订单已支付       商户订单已支付，无需重复操作	 商户订单已支付，无需更多操作
     * ORDERCLOSED	          订单已关闭	       当前订单已关闭，无法支付	     当前订单已关闭，请重新下单
     * SYSTEMERROR	          系统错误	           系统超时	系统异常，           请用相同参数重新调用
     * APPID_NOT_EXIST	      APPID不存在	       参数中缺少APPID	             请检查APPID是否正确
     * MCHID_NOT_EXIST	      MCHID不存在	       参数中缺少MCHID	             请检查MCHID是否正确
     * APPID_MCHID_NOT_MATCH  APPID和MCH_ID不匹配  APPID和MCH_ID不匹配	         请确认APPID和MCH_ID是否匹配
     * LACK_PARAMS	          缺少参数	           缺少必要的请求参数	         请检查参数是否齐全
     * OUT_TRADE_NO_USED	  商户订单号重复	   同一笔交易不能多次提交	     请核实商户订单号是否重复提交
     * SIGNERROR	          签名错误	           参数签名结果不正确	         请检查签名参数和方法是否都符合签名算法要求
     * XML_FORMAT_ERROR	      XML格式错误	       XML格式错误	                 请检查XML参数格式是否正确
     * REQUIRE_POST_METHOD	  请使用POST方法	   未使用POST传递参数 	         请检查请求参数是否通过POST方法提交
     * POST_DATA_EMPTY	      POST数据为空	       POST数据不能为空	             请检查POST数据是否为空
     * NOT_UTF8	              编码格式错误	       未使用指定编码格式	         请使用UTF-8编码格式
     * ORDERNOTEXIST	      此交易订单号不存在   查询系统中不存在此交易订单号	 该API只能查提交支付交易返回成功的订单，请商户检查需要查询的订单号是否正确
     * SYSTEMERROR	          系统错误	           后台系统返回错误	             系统异常，请再调用发起查询
     * ORDERPAID	          订单已支付	       订单已支付，不能发起关单	     订单已支付，不能发起关单，请当作已支付的正常交易
     * SYSTEMERROR	          系统错误	           系统错误	                     系统异常，请重新调用该API
     * ORDERCLOSED	          订单已关闭	       订单已关闭，无法重复关闭	     订单已关闭，无需继续调用
     * SIGNERROR	          签名错误	           参数签名结果不正确	         请检查签名参数和方法是否都符合签名算法要求
     * REQUIRE_POST_METHOD	  请使用post方法	   未使用post传递参数 	         请检查请求参数是否通过post方法提交
     * XML_FORMAT_ERROR	      XML格式错误	       XML格式错误	                 请检查XML参数格式是否正确
     * SYSTEMERROR	          下载失败	           系统超时	                     请尝试再次查询。
     * invalid bill_type	  参数错误	           请求参数未按指引进行填写	     参数错误，请重新检查
     * data format error
     * missing parameter
     * SIGN ERROR
     * NO Bill Exist	      账单不存在	       当前商户号没有已成交的订单，不生成对账单	    请检查当前商户号在指定日期内是否有成功的交易。
     * Bill Creating	      账单未生成	       当前商户号没有已成交的订单或对账单尚未生成	请先检查当前商户号在指定日期内是否有成功的交易，如指定日期有交易则表示账单正在生成中，请在上午10点以后再下载。
     * CompressGZip Error	  账单压缩失败	       账单压缩失败，请稍后重试	                    账单压缩失败，请稍后重试
     * UnCompressGZip Error   账单解压失败	       账单解压失败，请稍后重试	                    账单解压失败，请稍后重试
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
     * 错误信息描述
     */
    private String err_code_des;

    public String getErr_code_des() {
        return err_code_des;
    }

    public void setErr_code_des(String err_code_des) {
        this.err_code_des = err_code_des;
    }
}
