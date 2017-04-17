package org.nutz.pay.util;

import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.repo.Base64;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 加密工具类
 * Created by howe on 2017/4/17.
 */
public class CryptoUtil {

    /**
     * MD5加密
     *
     * @param s 待加密字符串
     * @return 加密后字符串
     */
    public static String md5(String s) {

        if (Strings.isEmpty(s)) {
            return null;
        } else {
            return Lang.md5(s);
        }
    }

    /**
     * Base64加密
     *
     * @param s 待加密字符串
     * @return 加密后字符串
     */
    public static String encodeBase64(String s) {

        if (Strings.isEmpty(s)) {
            return null;
        } else {
            return Base64.encodeToString(s.getBytes(), true);
        }
    }

    /**
     * Base64解密
     *
     * @param s 待解密字符串
     * @return 解密后字符串
     */
    public static String decodeBase64(String s) {

        if (Strings.isEmpty(s)) {
            return null;
        } else {
            return new String(Base64.decode(s.getBytes()));
        }
    }

    /**
     * URL编码
     *
     * @param s 待编码字符串
     * @return 编码后字符串
     */
    public static String encodeUrl(String s) {

        try {
            if (Strings.isEmpty(s)) {
                return null;
            } else {
                return URLEncoder.encode(s, "UTF-8");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * URL解码
     * @param s 待解码的字符串
     * @return 解码后的字符串
     */
    public static String decodeUrl(String s) {

        try {

            if (Strings.isEmpty(s)) {
                return null;
            } else {
                return URLDecoder.decode(s, "UTF-8");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
