package org.example.test001;

import java.util.Arrays;

public class test0003 {
    /**
     * 无重复字符的最长串
     * 给定一个字符串S
     * 找出其中不含重复字符的最长子串的长度
     *
     * 例：
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     */

    public static void main(String[] args) {
        String s ="abcabcbb";
        System.out.println(noSameLength(s));
    }

    private static int noSameLength(String s) {
        int maxLength = 0;
        String[] split = s.split("");
        if (split.length == 1) {
            return 1;
        }
        int offert = 0;
        int end = 1;
        for (int i = 1; i < split.length; i++) {
            if (checkWindow(split[i], s.substring(offert, end))) {
                offert ++;
                end ++;
            } else {
                end ++;
                maxLength ++;
            }
        }
        return maxLength;
    }

    private static boolean checkWindow(String s, String substring) {
        return Arrays.asList(substring.split("")).contains(s);
    }
}
