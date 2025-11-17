package org.example.test001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class test0001 {
    /**
     * 两数之和
     * 给定一个整数数组nums[]和一个目标整数target
     * 在该数组中找出和为target的两个整数，并输出这2个整数的下标。
     *
     * 例：
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     */
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 18;
        System.out.println(twoSum(nums, target));
        }

    private static List twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsHashMap = new HashMap<>();
        for (int i=0; i< nums.length; i++) {
            numsHashMap.put(nums[i], i);
        }
        for (int i=0; i< nums.length; i++) {
            int result = target - nums[i];
            if (numsHashMap.get(result) != null && numsHashMap.get(result) != i) {
                return Arrays.asList(i, numsHashMap.get(result));
            }
        }
        return new ArrayList();
    }
}
