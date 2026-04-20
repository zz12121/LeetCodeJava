package org.example.hotquestion;

/*
*
*## 题目信息

| 属性 | 值 |
|------|-----|
| 题号 | #217 |
| 链接 | https://leetcode.cn/problems/contains-duplicate/ |
| 难度 | 🟢 简单 |
| 类型 | 数组 / 哈希 |

## 题干

给定一个整数数组 `nums`，判断是否存在重复元素。

如果存在一个值在数组中出现至少两次，返回 `true`；如果所有元素都不相同，返回 `false`。

### 示例

```
输入：nums = [1,2,3,1]
输出：true

输入：nums = [1,2,3,4]
输出：false

* **/

import java.util.HashSet;
import java.util.Set;

public class hot02 {

    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,1};
        int[] b = new int[] {1,2,3,4};

        System.out.println(getSameNumResult(a));
        System.out.println(getSameNumResult(b));
    }

    private static boolean getSameNumResult (int[] a) {
        if (a == null) {
            return false;
        }
        Set<Integer> numSet = new HashSet<>();
        for (int i =0; i< a.length; i++) {
            if (numSet.contains(a[i])) {
                return true;
            }
            numSet.add(a[i]);
        }
        return false;
    }
}
