package org.example.test002;

public class test0004 {
    /**
     * 给定一个字符串数组strs
     * 返回字符串数组中的最长公共前缀。如果不存在，返回空字符串
     *
     * 例：
     * 输入：strs = ["flower","flow","flight"]
     * 输出："fl"
     */

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(maxLengthStr(strs));
    }

    private static String maxLengthStr(String[] strs) {
        String[][] filter = new String[strs.length][];
        for (int i = 0; i < strs.length; i++) {
            filter[i] = strs[i].split("");
        }
        for (int i = 0; i < filter[0].length; i++) {
            String a = filter[0][i];
            for (int j = 0; j < filter.length; j++) {
                if (!a.equals(filter[j][i])) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return "";
    }
}
