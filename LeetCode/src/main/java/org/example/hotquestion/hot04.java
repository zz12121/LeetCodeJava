package org.example.hotquestion;

/*
* ## 题干

给定一个数组 `prices`，它的第 `i` 个元素是一支给定股票第 `i` 天的价格。

如果你最多只允许完成**一笔交易**（即买入和卖出一支股票一次），请计算你能获取的最大利润。

注意：你不能在买入股票前卖出股票。

### 示例

```
输入：prices = [7,1,5,3,6,4]
输出：5
解释：在第 2 天（股票价格 = 1）买入，在第 5 天（股票价格 = 6）卖出，最大利润 = 6-1 = 5
* **/

public class hot04 {

    public static void main(String[] args) {
        int [] prices = new int[]{7,1,5,3,6,4};
        System.out.println(getMaxDiff(prices));
    }

    private static int getMaxDiff(int[] a) {
        int minPrice = a [0];
        int maxDiff = 0;
        for (int i=1; i< a.length; i++) {
            minPrice = Math.min(minPrice, a[i]);
            maxDiff = Math.max(maxDiff, a[i] - minPrice);
        }
        return maxDiff;
    }
}
