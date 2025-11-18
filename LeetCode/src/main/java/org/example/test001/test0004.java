package org.example.test001;

public class test0004 {
    /**
     * 寻找两个正序数组的中位数
     * 给定两个正序数组 nums1,nums2
     * 找出并返回这两个正序数组的中位数
     *
     * 例：
     * 输入：nums1 = [1,2], nums2 = [3,4]
     * 输出：2.50000
     * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
     */

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(calculateMiddle(nums1,nums2));
    }

    private static float calculateMiddle(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int k;
        if (totalLength % 2 == 0) {
            k = totalLength/2;
        } else {
            k = totalLength/2 + 1;
        }
        
        return 0;
    }
}
