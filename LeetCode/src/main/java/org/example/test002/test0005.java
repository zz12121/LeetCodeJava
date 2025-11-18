package org.example.test002;

import java.util.Arrays;
import java.util.List;

public class test0005 {
    /**
     * 三数之和
     * 给定一个整数数组nums,
     * 判断nums是否存在3个元素a,b,c。满足a+b+c==0.要求找出所有符合要求的不重复三元组。
     * <p>
     * 例：
     * 输入：nums = [-1,0,1,2,-1,-4]
     * 输出：[[-1,-1,2],[-1,0,1]]
     */

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4, 4};
        System.out.println(threeSum(nums));
    }

    private static List threeSum(int[] nums) {
        int[] sort = Arrays.stream(nums).sorted().toArray();
        for (int i = 0; i < sort.length; i++) {
            int before = i + 1;
            int end = sort.length - 1;
            if (i>0 && sort[i] == sort[i-1]) {
                continue;
            }
            for (int j = i; j < sort.length; j++) {

                if (end > before) {
                    if ((sort[i] + sort[before] + sort[end]) == 0) {
                        System.out.println(sort[i] + "," + sort[before] + "," + sort[end]);

                        end--;
                        before++;
                    } else if ((sort[i] + sort[before] + sort[end]) > 0) {
                        end--;
                    } else {
                        before++;
                    }
                }
            }
        }
        return null;
    }
}
