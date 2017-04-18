package org.nutz.pay.util.crypto;

import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.pay.util.CryptoUtil;

import javax.crypto.Cipher;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;

/**
 * DSA加解密
 * Created by Howe on 2017/4/18.
 *
 * @author Howe(howechiang@gmail.com)
 */
public class DSA {

    private static final Log log = Logs.get();

    public static final String KEY_ALGORITHM = "DSA";
    public static final String SIGN_ALGORITHMS = "SHA1WithDSA";

    /**
     * 加密
     *
     * @param s 待加密字符串
     * @param k 用户私钥
     * @return 加密后的字符串
     */
    public static String encode(String s, String k) {

        try {
            PKCS8EncodedKeySpec priPKCS8 = new PKCS8EncodedKeySpec(CryptoUtil.decodeBase64Byte(k));
            KeyFactory keyf = KeyFactory.getInstance(KEY_ALGORITHM);
            PrivateKey priKey = keyf.generatePrivate(priPKCS8);
            java.security.Signature signature = java.security.Signature
                    .getInstance(SIGN_ALGORITHMS);
            signature.initSign(priKey);
            signature.update(s.getBytes("UTF-8"));
            byte[] signed = signature.sign();
            return CryptoUtil.encodeBase64(signed);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    /**
     * 解密
     *
     * @param s 待解密字符串
     * @param k 用户私钥
     * @return 解密后的字符串
     */
    public static String decode(String s, String k) {

        try {
            PrivateKey prikey = getPrivateKey(k);
            Cipher cipher = Cipher.getInstance(KEY_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, prikey);

            InputStream ins = new ByteArrayInputStream(CryptoUtil.decodeBase64Byte(s));
            ByteArrayOutputStream writer = new ByteArrayOutputStream();
            //dsa解密的字节大小最多是128，将需要解密的内容，按128位拆开解密
            byte[] buf = new byte[128];
            int bufl;
            while ((bufl = ins.read(buf)) != -1) {
                byte[] block = null;
                if (buf.length == bufl) {
                    block = buf;
                } else {
                    block = new byte[bufl];
                    for (int i = 0; i < bufl; i++) {
                        block[i] = buf[i];
                    }
                }
                writer.write(cipher.doFinal(block));
            }
            return new String(writer.toByteArray(), "UTF-8");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }


    /**
     * 得到私钥
     *
     * @param key 密钥字符串（经过base64编码）
     * @throws Exception
     */
    private static PrivateKey getPrivateKey(String key) {

        try {
            byte[] keyBytes;
            keyBytes = CryptoUtil.decodeBase64Byte(key);
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
            PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
            return privateKey;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }
}
