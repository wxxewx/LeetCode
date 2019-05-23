package com.example.leetcode

import java.nio.file.Files.size




class ACMArray {


    /**
     *
    给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
    不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。


    给定数组 nums = [1,1,2],

    函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。

    你不需要考虑数组中超出新长度后面的元素。

    解题思路

    从头开始遍历，把不重复的元素放到前面，size记录不重复的元素的下标，每次发现一个不重复的元素那么便把这个元素交换


     */
    fun deleteDuplicatesFromSortedArrays(array: IntArray): Int {
        var size = 0
        if (array.isEmpty()) {
            return 0
        }

        for (i in 0 until array.size) {
            if (array[i] != array[size]) {
                size++;
                array[size] = array[i];
            }
        }
        return size + 1;

    }


    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

    设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。

    注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。

    输入: [7,1,5,3,6,4]
    输出: 7
    解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
    随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
    示例 2:

    输入: [1,2,3,4,5]
    输出: 4
    解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
    注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。
    因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
    示例 3:

    输入: [7,6,4,3,1]
    输出: 0
    解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
     */
    fun maxProfit(prices: IntArray): Int {
        var result = 0
        for (i in 1 until prices.size) {
            if (prices[i - 1] < prices[i]) {
                result += prices[i] - prices[i - 1]
            }
        }
        return result

    }
}
