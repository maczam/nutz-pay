package org.nutz.pay.util.alipay.pc;

import org.nutz.lang.Strings;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.pay.util.CryptoUtil;
import org.nutz.pay.util.crypto.DSA;
import org.nutz.pay.util.crypto.RSA;

/**
 * Created by Howe on 2017/4/18.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class Signature {

    private static final Log log = Logs.get();

    /**
     * MD5签名
     *
     * @param s 参数字符串
     * @param k 密钥
     * @return MD5加密后的签名
     */
    public static String md5Sign(String s, String k) {

        if (Strings.isEmpty(s) || Strings.isEmpty(k)) {
            log.error("Alipay md5Sign 参数缺失.");
            return null;
        } else {
            return CryptoUtil.md5(s + k);
        }
    }

    /**
     * RSA签名
     *
     * @param s 参数字符串
     * @param k 用户私钥
     * @return RSA加密后的签名
     */
    public static String rsaSign(String s, String k) {

        if (Strings.isEmpty(s) || Strings.isEmpty(k)) {
            log.error("Alipay rsaSign 参数缺失.");
            return null;
        } else {
            return RSA.encode(s, k);
        }
    }

    /**
     * DSA签名
     *
     * @param s 参数字符串
     * @param k 用户私钥
     * @return RSA加密后的签名
     */
    public static String dsaSign(String s, String k) {

        if (Strings.isEmpty(s) || Strings.isEmpty(k)) {
            log.error("Alipay rsaSign 参数缺失.");
            return null;
        } else {
            return DSA.encode(s, k);
        }
    }

    /**
     * 签名
     *
     * @param s 参数字符串
     * @param k 用户私钥
     * @param t 加密类型
     * @return 加密后的签名
     */
    public static String sign(String s, String k, String t) {

        if (Strings.isEmpty(s) || Strings.isEmpty(k) || Strings.isEmpty(t)) {
            log.error("Alipay sign 参数缺失.");
            return null;
        } else {

            if (Strings.equalsIgnoreCase(t, "MD5")) {
                return md5Sign(s, k);
            } else if (Strings.equalsIgnoreCase(t, "RSA")) {
                return rsaSign(s, k);
            } else if (Strings.equalsIgnoreCase(t, "DSA")) {
                return dsaSign(s, k);
            } else {
                log.error("Alipay sign 加密方式错误, 只支持MD5、RSA、DSA.");
                return null;
            }
        }
    }

    /**
     * MD5签名校验
     *
     * @param p 参数字符串
     * @param s 原签名
     * @param k 密钥
     * @return 校验结果
     */
    public static boolean md5Verify(String p, String s, String k) {
        if (Strings.equals(md5Sign(p, k), s)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * RSA签名校验
     *
     * @param p 参数字符串
     * @param s 原签名
     * @param k 支付宝公钥
     * @return 校验结果
     */
    public static boolean rsaVerify(String p, String s, String k) {
        if (Strings.equals(rsaSign(p, k), s)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * DSA签名校验
     *
     * @param p 参数字符串
     * @param s 原签名
     * @param k 支付宝公钥
     * @return 校验结果
     */
    public static boolean dsaVerify(String p, String s, String k) {
        if (Strings.equals(dsaSign(p, k), s)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 签名校验
     *
     * @param p 参数字符串
     * @param s 原签名
     * @param k 支付宝公钥
     * @param t 加密类型
     * @return 校验结果
     */
    public static boolean verify(String p, String s, String k, String t) {
        if (Strings.isEmpty(s) || Strings.isEmpty(k) || Strings.isEmpty(t) || Strings.isEmpty(p)) {
            return false;
        } else {
            if (Strings.equalsIgnoreCase(t, "MD5")) {
                return md5Verify(p, s, k);
            } else if (Strings.equalsIgnoreCase(t, "RSA")) {
                return rsaVerify(p, s, k);
            } else if (Strings.equalsIgnoreCase(t, "DSA")) {
                return dsaVerify(p, s, k);
            } else {
                log.error("Alipay verify 加密方式错误, 只支持MD5、RSA、DSA.");
                return false;
            }
        }
    }
}