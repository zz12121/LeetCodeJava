package org.example.test002;

public class test0001 {
    /**
     * 盛最多水的容器
     * 给定N个非负正整数a1、a2、...an，每个数代表坐标的一个点（i，ai）。在坐标内画n条垂直线，垂直线i的两个端点分别为（i,ai），(i,o)
     * 要求找出其中的两条线，使得它们和X轴共同构成的容器可以容纳更多的水
     *
     * 例：
     * 输入：[1,8,6,2,5,4,8,3,7]
     * 输出：49
     * 解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
     */
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxInbox(nums));
    }

    private static int maxInbox(int[] nums) {
        int before = 0;
        int end = nums.length-1;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {

            int area = (end-before) * Math.min(nums[before], nums[end]);
            result = Math.max(result, area);
            if (nums[before] < nums[end]) {
                before ++;
            } else {
                end --;
            }
        }
        return result;
    }
}
