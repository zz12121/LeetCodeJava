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
        int maxLength = 1;
        String[] split = s.split("");
        if (split.length == 1) {
            return 1;
        }
        int offert = 0;
        int end = 1;
        for (int i = 1; i < split.length; i++) {
            int calculateIndex = calculateWindow(split[i], s.substring(offert, end));
            if (calculateIndex != 0) {
                offert += calculateIndex;
                end ++;
            } else {
                end ++;
                maxLength ++;
            }
        }
        return maxLength;
    }

    private static int calculateWindow(String s, String substring) {
        String[] split = substring.split("");
        for (int i = 0; i < split.length; i++) {
            if (s.equals(split[i])) {
                return 1;
            }
        }
        return 0;
    }
}
