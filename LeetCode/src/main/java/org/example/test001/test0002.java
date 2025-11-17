package org.example.test001;

import java.util.ArrayList;
import java.util.List;

public class test0002 {
    /**
     * 两数相加
     * 给定两个非空的链表l1和l2。分别表示2个非负整数，每位数字按照逆序的方式存储，每个节点存储一位数字
     * 要求计算两个非负整数的和，并逆序返回和的链表
     *
     * 例：
     * 输入：l1 = [2,4,3], l2 = [5,6,4]
     * 输出：[7,0,8]
     * 解释：342 + 465 = 807.
     */
    public static void main(String[] args) {
        int[] nums1 = new int[]{2,4,3,7};
        int nums2[] = {5,6,6};
        System.out.println(twoAdd(nums1, nums2));
    }

    private static List twoAdd(int[] nums1, int[] nums2) {
        int[] filterNums = nums2.length > nums1.length ? nums2 : nums1;
        List<Integer> resultNums = new ArrayList<>(filterNums.length + 1);
        int up = 0;
        for (int i=0; i< filterNums.length; i++) {
            int add = up;
            int a = 0;
            int b = 0;
            if (nums1.length > i) {
                a = nums1[i];
            }
            if (nums2.length > i) {
                b = nums2[i];
            }
            if (a+b == 10) {
                up = 1;
            } else {
                add += a+b;
                up=0;
                if (add == 10) {
                    add = 0;
                    up = 1;
                }
            }
            resultNums.add(add);
        }
        if (up == 1) {
            resultNums.add(up);
        }
        return resultNums;
    }
}
