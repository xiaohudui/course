package com.little.tiger.course.crypt;

import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5 {
    /**
     * 计算32位MD5
     *
     * @param input
     * @return
     */
    public static String md5(String input) {
        // 首先从Java Security 包获取
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        byte[] bytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));
        return Hex.encodeHexString(bytes);
    }
}
