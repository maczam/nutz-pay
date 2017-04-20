package org.nutz.pay.bean.alipay.resp.wap;

/**
 * Created by Jianghao on 2017/4/20
 *
 * @howechiang
 */
public class Base {
    /**
     * code（返回码）  msg（返回码描述）	                                           sub_code（明细返回码）             sub_msg（明细返回码描述）	          解决方案
     * 10000	       接口调用成功，调用结果请参考具体的API文档所对应的业务返回参数
     * 20000	       服务不可用                                                      isp.unknow-error                   服务暂不可用（业务系统不可用）      稍后重试
     *                                                                                 aop.unknow-error                   服务暂不可用（网关自身的未知错误）  稍后重试
     * 20001           授权权限不足                                                    aop.invalid-auth-token             无效的访问令牌                      请刷新授权令牌或重新授权获取新的令牌
     *                                                                                 aop.auth-token-time-out            访问令牌已过期                      请刷新授权令牌或重新授权获取新的令牌
     *                                                                                 aop.invalid-app-auth-token         无效的应用授权令牌                  请刷新应用授权令牌或重新授权获取新的令牌
     *                                                                                 aop.invalid-app-auth-token-no-api  商户未授权当前接口                  请重新授权获取新的应用授权令牌
     *                                                                                 aop.app-auth-token-time-out        应用授权令牌已过期                  请刷新应用授权令牌或重新授权获取新的令牌
     *                                                                                 aop.no-product-reg-by-partner      商户未签约任何产品                  ISV代理调用的场景，请上线商户的服务窗
     * 40001           缺少必选参数                                                    isv.missing-method                 缺少方法名参数                      请求参数里面必须要有method参数
     *                                                                                 isv.missing-signature              缺少签名参数                        检查请求参数，缺少sign参数
     *                                                                                 isv.missing-signature-type         缺少签名类型参数                    检查请求参数，缺少sign_type参数
     *                                                                                 isv.missing-signature-key          缺少签名配置                        未上传公钥配置
     *                                                                                 isv.missing-app-id                 缺少appId参数                       检查请求参数，缺少app_id参数
     *                                                                                 isv.missing-timestamp              缺少时间戳参数                      检查请求参数，缺少timestamp参数
     *                                                                                 isv.missing-version                缺少版本参数                        检查请求参数，缺少version参数
     *                                                                                 isv.decryption-error-missing-encrypt-type  解密出错, 未指定加密算法    检查参数，缺少encrypt_type参数
     * 40002           非法的参数                                                      isv.invalid-parameter              参数无效                            检查参数，格式不对、非法值、越界等
     *                                                                                 isv.upload-fail                    文件上传失败                        文件写入失败，重试
     *                                                                                 isv.invalid-file-extension         文件扩展名无效                      检查传入的文件扩展名称，目前支持格式：csv,txt,zip,rar,gz,doc,docx,xls,xlsx,pdf,bmp,gif,jpg,jpeg,png
     *                                                                                 isv.invalid-file-size              文件大小无效                        检查文件大小，目前支持最大为：50MB
     *                                                                                 isv.invalid-method                 不存在的方法名                      检查入参method是否正确
     *                                                                                 isv.invalid-format                 无效的数据格式                      检查入参format，目前只支持json和xml 2种格式
     *                                                                                 isv.invalid-signature-type         无效的签名类型                      检查入参sign_type,目前只支持RSA,RSA2,HMAC_SHA1
     *                                                                                 isv.invalid-signature              无效签名                            1.公私钥是否是一对; 2.检查公钥上传是否与私钥匹配; 3.存在中文需要做urlencode; 4.签名算法是否无误
     */

    /**
     * 网关返回码,详见文档
     * 必填
     */
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private String String;

    public java.lang.String getString() {
        return String;
    }

    public void setString(java.lang.String string) {
        String = string;
    }

    private String sub_code;

    public java.lang.String getSub_code() {
        return sub_code;
    }

    public void setSub_code(java.lang.String sub_code) {
        this.sub_code = sub_code;
    }

    private String sub_msg;

    public java.lang.String getSub_msg() {
        return sub_msg;
    }

    public void setSub_msg(java.lang.String sub_msg) {
        this.sub_msg = sub_msg;
    }

    private String sign;

    public java.lang.String getSign() {
        return sign;
    }

    public void setSign(java.lang.String sign) {
        this.sign = sign;
    }
}
