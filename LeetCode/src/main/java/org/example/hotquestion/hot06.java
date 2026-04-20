package org.example.hotquestion;

import java.util.HashSet;

/*
*
* *
* *## 题干

给定一个未排序的整数数组 `nums`，找出**最长连续序列**的长度。

要求时间复杂度为 O(n)。

### 示例

```
输入：nums = [100,4,200,1,3,2]
输出：4
解释：最长连续序列是 [1,2,3,4]，所以长度为 4。

* **/
public class hot06 {
    public static void main(String[] args) {
        int nums[] = new int[]{100,4,200,1,3,2};
        System.out.println(getMaxLength(nums));
    }

    private static int getMaxLength(int[] a) {
        HashSet<Integer> set = new HashSet();
        int maxLen = 1;
        for (int i=0; i<a.length; i++) {
            set.add(a[i]);
        }
        for (Integer i : set) {
            if (!set.contains(i -1)) {
                //起点
                int len = 1;
                int n = i + 1;

                while (set.contains(n)) {
                    len ++;
                    n ++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}
