package com.little.tiger.course.codec;

import cn.hutool.crypto.digest.DigestUtil;
import com.little.tiger.course.crypt.Md5;
import org.junit.Assert;
import org.junit.Test;

/**
 * @description:
 * @author: Little Tiger
 * @date: 2023-06-17 16:03:31
 **/
public class Md5Test {
    @Test
    public void testMd5() {
        String input = "abc";
        Assert.assertEquals(DigestUtil.md5Hex(input), Md5.md5(input));
    }
}
