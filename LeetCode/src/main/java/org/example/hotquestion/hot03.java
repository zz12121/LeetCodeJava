package org.example.hotquestion;

/*
* ## 题干

给你两个按 **非递减顺序** 排列的整数数组 `nums1` 和 `nums2`，以及两个整数 `m` 和 `n`，分别表示 `nums1` 和 `nums2` 中的元素数目。

请你将 `nums2` 合并到 `nums1` 中，使合并后的数组同样按 **非递减顺序** 排列。

### 示例

```
输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
输出：[1,2,2,3,5,6]
```

* **/

import java.util.Arrays;

public class hot03 {

    public static void main(String[] args) {
        int [] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int [] nums2 = new int []{2,5,6};
        int n = 3;
        System.out.println(Arrays.toString(getResultNumArray(nums1, m, nums2, n)));
    }

    private static int[] getResultNumArray (int [] a, int alength, int[] b, int blength) {
        int maxLength = alength + blength -1;
        int al = alength -1;
        int bl = blength -1;

        while (al >= 0 && bl >= 0) {
            if (a[al] > b[bl]) {
                a [maxLength] = a[al];
                al --;
            } else {
                a [maxLength] = b [bl];
                bl --;
            }
            maxLength --;
        }
        while(bl >= 0) {
            a [maxLength] = b [bl];
            maxLength --;
            bl --;
        }
        return a;
    }
}
