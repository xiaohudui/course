package com.little.tiger.course.codec;

/**
 * @description:
 * @author: Little Tiger
 * @date: 2023-06-17 15:47:01
 **/
public class Hex {
    /**
     * Used to build output as hex.
     */
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /**
     * Used to build output as hex.
     */
    private static final char[] DIGITS_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /**
     * convert bytes to hex string
     *
     * @param data
     * @return
     */
    public static String encodeHex(final byte[] data) {
        return encodeHex(data, true);
    }

    /**
     * convert bytes to hex string
     *
     * @param data
     * @return
     */
    public static String encodeHex(final byte[] data, final boolean toLowerCase) {
        return encodeHex(data, toLowerCase ? DIGITS_LOWER : DIGITS_UPPER);
    }

    private static String encodeHex(final byte[] data, final char[] toDigits) {
        final int l = data.length;
        final char[] out = new char[l << 1];
        for (int i = 0, j = 0; i < l; i++) {
            out[j++] = toDigits[(0xF0 & data[i]) >>> 4];
            out[j++] = toDigits[0x0F & data[i]];
        }
        return new String(out);
    }
}
