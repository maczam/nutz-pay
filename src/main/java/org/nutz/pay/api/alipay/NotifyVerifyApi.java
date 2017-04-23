package org.nutz.pay.api.alipay;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.pay.bean.alipay.req.pc.NotifyVerifyReq;
import org.nutz.pay.util.Util;

/**
 * <a href="https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.wbCSOb&treeId=62&articleId=104747&docType=1">通知验证接口</a>
 * notify_verify
 * Created by howe on 2017/4/18.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class NotifyVerifyApi {

    private static final Log log = Logs.get();

    /**
     * 校验支付宝通知合法性
     *
     * @param req 参数
     * @return 校验结果
     */
    public static boolean notifyVerify(NotifyVerifyReq req) {
        try {
            String result = checkParams(req);
            if (Strings.isEmpty(result)) {
                String resp = "https://mapi.alipay.com/gateway.do?" + Util.buildParmas(Lang.obj2nutmap(req));
                if (Strings.equalsIgnoreCase(resp, "true")) {
                    return true;
                } else {
                    return false;
                }
            } else {
                log.error("支付宝通知验证接口参数校验异常: " + result);
                return false;
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return false;
        }

    }

    /**
     * 校验参数
     *
     * @param req 参数
     * @return 校验结果
     */
    public static String checkParams(NotifyVerifyReq req) {
        if (Strings.isEmpty(req.getService())) {
            return "接口名称不能为空";
        } else if (!Strings.equalsIgnoreCase("notify_verify", req.getService())) {
            return "接口名称错误，应该为notify_verify";
        } else if (Strings.isEmpty(req.getPartner())) {
            return "合作者身份ID不能为空";
        } else if (Strings.isEmpty(req.getNotify_id())) {
            return "通知校验ID不能为空";
        } else {
            return "";
        }
    }
}
