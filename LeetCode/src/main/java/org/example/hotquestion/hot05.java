package org.example.hotquestion;

/*
* ## 题干

给定一个整数数组 `nums` 和一个整数 `k`，判断是否存在两个**不同的下标** `i` 和 `j`，满足 `nums[i] == nums[j]` 且 `abs(i - j) <= k`。

### 示例

```
输入：nums = [1,2,3,1], k = 3
输出：true

输入：nums = [1,0,1,1], k = 1
输出：true
*
* **/

import java.util.HashMap;

public class hot05 {

    public static void main(String[] args) {
        int [] nums = new int[]{1,0,1,1};
        int k = 1;
        System.out.println(getResult(nums, k));
    }

    private static boolean getResult(int[] a, int k) {
        HashMap<Integer, Integer> paramHashMap = new HashMap<>();
        for(int i =0; i< a.length; i++) {
            if (paramHashMap.containsKey(a[i])) {
                if (Math.abs(i - paramHashMap.get(a[i])) <= k) {
                    return true;
                }
            } else {
                paramHashMap.put(a[i], i);
            }
        }
        return false;
    }
}
