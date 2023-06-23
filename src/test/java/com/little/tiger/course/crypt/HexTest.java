package com.little.tiger.course.crypt;

import com.little.tiger.course.codec.Hex;
import org.junit.Assert;
import org.junit.Test;

/**
 * @description:
 * @author: Little Tiger
 * @date: 2023-06-17 16:02:53
 **/
public class HexTest {
    @Test
    public void testHexString() {
        byte[] bytes = new byte[] {1, 127, 34};
        Assert.assertEquals(org.apache.commons.codec.binary.Hex.encodeHexString(bytes), Hex.encodeHex(bytes));
    }
}
