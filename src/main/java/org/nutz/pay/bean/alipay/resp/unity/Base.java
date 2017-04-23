package org.nutz.pay.bean.alipay.resp.unity;

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
     *                                                                                 isv.invalid-encrypt-type           无效的加密类型                      检查入参encrypt_type，目前只支持AES
     *                                                                                 isv.invalid-encrypt                解密异常                            重试
     *                                                                                 isv.invalid-app-id                 无效的appId参数                     检查入参app_id，app_id不存在，或者未上线
     *                                                                                 isv.invalid-timestamp              非法的时间戳参数                    时间戳参数timestamp非法，请检查格式需要为"yyyy-MM-dd HH:mm:ss"
     *                                                                                 isv.invalid-charset                字符集错误                          请求参数charset错误，目前支持格式：GBK,UTF-8
     *                                                                                 isv.invalid-digest                 摘要错误                            检查请求参数，文件摘要参数必填
     *                                                                                 isv.decryption-error-not-valid-encrypt-type 解密出错，不支持的加密算法  检查入参encrypt_type，目前只支持AES
     *                                                                                 sv.decryption-error-not-valid-encrypt-key  解密出错, 未配置加密密钥或加密密钥格式错误  没有配置加密密钥
     *                                                                                 isv.decryption-error-unknown       解密出错，未知异常                  重试
     *                                                                                 isv.missing-signature-config       验签出错, 未配置对应签名算法的公钥或者证书  没有配置应用公钥
     *                                                                                 v.not-support-app-auth             本接口不支持第三方代理调用          本接口不支持第三方代理调用
     *  40004           业务处理失败      对应业务错误码，明细错误码和解决方案请参见具体的API接口文档
     *  40006	        权限不足                                                       isv.insufficient-isv-permissions	   ISV权限不足	                      请检查配置的账户是否有当前接口权限
     *                                                                                 isv.insufficient-user-permissions   用户权限不足	                      代理的商户没有当前接口权限
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

    /**
     * 网关返回码描述,详见文档
     * 必填
     */
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 业务返回码,详见文档
     * 选填
     */
    private String sub_code;

    public java.lang.String getSub_code() {
        return sub_code;
    }

    public void setSub_code(java.lang.String sub_code) {
        this.sub_code = sub_code;
    }

    /**
     * 业务返回码描述,详见文档
     * 选填
     */
    private String sub_msg;

    public java.lang.String getSub_msg() {
        return sub_msg;
    }

    public void setSub_msg(java.lang.String sub_msg) {
        this.sub_msg = sub_msg;
    }

    /**
     * 签名,<a href="https://doc.open.alipay.com/docs/doc.htm?treeId=291&articleId=106074&docType=1">详见文档</a>
     * 必填
     */
    private String sign;

    public java.lang.String getSign() {
        return sign;
    }

    public void setSign(java.lang.String sign) {
        this.sign = sign;
    }
}
