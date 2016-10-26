package net.shangzhibo.vcloud.util;

import java.security.MessageDigest;

/**
 * Created by xiaoming(a)wallaw.cn on 16/8/24.
 * 网易视频云 API token校验 接口授权
 * 接口通过请求头中的公共参数进行鉴权。用户通过在用户中心->安全中心获取到的一对安全凭证进行SHA1(AppSecret+Nonce+CurTime)计算。
 * 重要提示: 本文档中提供的所有接口均面向开发者服务器端调用，用于计算CheckSum的AppSecret开发者应妥善保管,
 * 可在应用的服务器端存储和使用，但不应存储或传递到客户端，也不应在网页等前端代码中嵌入。
 */
public class CheckSumBuilder {

    /**
     * 授权接口验证 CheckSum计算
     * @param appSecret
     * @param nonce
     * @param curTime
     * @return
     */
    public static String getCheckSum(String appSecret, String nonce, String curTime) {
        return encode("sha1", appSecret + nonce + curTime);
    }

    /**
     * 加密处理
     * @param algorithm 加密方式
     * @param value 加密内容
     * @return
     */
    private static String encode(String algorithm, String value) {
        if (value == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.update(value.getBytes());
            return getFormattedText(messageDigest.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String getFormattedText(byte[] bytes) {
        int len = bytes.length;
        StringBuilder buf = new StringBuilder(len * 2);
        for (int j = 0; j < len; j++) {
            buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
            buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
        }
        return buf.toString();
    }

    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
}
