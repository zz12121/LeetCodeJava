package org.example.hotquestion;

/*
*
* #1 两数之和
题目信息
属性	值
题号	#1
链接	https://leetcode.cn/problems/two-sum/
难度	🟡 中等
类型	数组 / 哈希
*
题干
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出和为目标值 target 的那两个整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案，且同样的元素不能被重复利用。

示例
输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
* *
* **/

import java.util.Arrays;
import java.util.HashMap;

public class hot01 {
    public static void main(String[] args) {
        int[] a = new int[] {2,7,11,15};
        System.out.println(Arrays.toString(getIndex(a, 9)));
        System.out.println(Arrays.toString(getIndexHashMap(a, 9)));
    }

    private static int[] getIndex(int[] a, int target) {
        if (a == null) {
            return new int[0];
        }
        for (int i =0 ; i < a.length; i++) {
            int b = target - a[i];
            for (int j = i + 1; j< a.length; j++) {
                if (a[j] == b) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }

    private static int[] getIndexHashMap(int[] a, int target) {
        if (a == null) {
            return new int[0];
        }
        HashMap<Integer,Integer> targetHashMap = new HashMap();
        for (int i =0 ; i < a.length; i++) {
            if (targetHashMap.containsKey(target-a[i])) {
                return new int[] {i, targetHashMap.get(target-a[i])};
            }
            targetHashMap.put(a[i], i);
        }
        return new int[0];
    }
}
