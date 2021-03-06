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


    /**
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

    示例 1:

    输入: [1,2,3,4,5,6,7] 和 k = 3
    输出: [5,6,7,1,2,3,4]
    解释:
    向右旋转 1 步: [7,1,2,3,4,5,6]
    向右旋转 2 步: [6,7,1,2,3,4,5]
    向右旋转 3 步: [5,6,7,1,2,3,4]
    示例 2:

    输入: [-1,-100,3,99] 和 k = 2
    输出: [3,99,-1,-100]
    解释:
    向右旋转 1 步: [99,-1,-100,3]
    向右旋转 2 步: [3,99,-1,-100]
    说明:

    尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
    要求使用空间复杂度为 O(1) 的原地算法。
     */
    fun rotate(nums: IntArray, k: Int): Unit {
        for (i in 1..k) {
            for (j in 0 until nums.size) {
                var num = 0
                num = nums[nums.size - 1]
                nums[nums.size - 1] = nums[j]
                nums[j] = num

            }
        }
    }


    /**
     * 给定一个整数数组，判断是否存在重复元素。

    如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。

    示例 1:

    输入: [1,2,3,1]
    输出: true
    示例 2:

    输入: [1,2,3,4]
    输出: false
    示例 3:

    输入: [1,1,1,3,3,4,3,2,4,2]
    输出: true
     */
    fun containsDuplicate(nums: IntArray): Boolean {
        for (i in 0 until nums.size) {
            val num = nums[i]
            for (j in (i + 1) until nums.size) {
                val num2 = nums[j]
                if (num == num2) {
                    return true
                }
            }
        }
        return false
    }


    /**
     *
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

    说明：

    你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

    示例 1:

    输入: [2,2,1]
    输出: 1
    示例 2:

    输入: [4,1,2,1,2]
    输出: 4
     */

    fun singleNumber(nums: IntArray): Int {

        var single = 0

        for (i in 0 until nums.size) {
            single = single xor nums[i]
        }
        return single
    }


    /**
     * 给定两个数组，编写一个函数来计算它们的交集。

    示例 1:

    输入: nums1 = [1,2,2,1], nums2 = [2,2]
    输出: [2,2]
    示例 2:

    输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    输出: [4,9]
    说明：

    输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
    我们可以不考虑输出结果的顺序。
    进阶:

    如果给定的数组已经排好序呢？你将如何优化你的算法？
    如果 nums1 的大小比 nums2 小很多，哪种方法更优？
    如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
     */
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        var map1 = kotlin.collections.HashMap<Int, Int>()
        var map2 = kotlin.collections.HashMap<Int, Int>()

        for (i in 0 until nums1.size) {
            val num = map1[nums1[i]]
            if (num == null) {
                map1[nums1[i]] = 1
            } else {
                map1[nums1[i]] = num + 1
            }

        }

        var arraySize = 0
        for (i in 0 until nums2.size) {
            val j = map1[nums2[i]]
            if (j != null) {
                var k = map2[nums2[i]]
                if (k == null) {
                    map2[nums2[i]] = 1
                    arraySize += 1
                } else if (k + 1 > j) {
                    map2[nums2[i]] = j
                } else {
                    map2[nums2[i]] = k + 1
                    arraySize += 1
                }
            }

        }


        var array = IntArray(arraySize)
        var size = 0
        map2.forEach {
            val value = it.value
            for (i in 0 until value) {
                array[size] = it.key
                size++
            }
        }

        return array
    }


    /**
     * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

    你可以假设除了整数 0 之外，这个整数不会以零开头。

    示例 1:

    输入: [1,2,3]
    输出: [1,2,4]
    解释: 输入数组表示数字 123。
    示例 2:

    输入: [4,3,2,1]
    输出: [4,3,2,2]
    解释: 输入数组表示数字 4321。
     */

    fun plusOne(digits: IntArray): IntArray {
        val size = digits.size
        var num = digits[size - 1]
        if (num == 9) {
            digits[size - 1] = 0
            if (size - 2 < 0) {
                var array = IntArray(size + 1)
                array[0] = 1
                array[1] = 0
                return array
            } else {
                for (i in size - 2 downTo 0) {
                    var num2 = digits[i]
                    if (num2 == 9) {
                        if (i == 0) {
                            digits[i] = 0
                            var array = IntArray(size + 1)
                            array[0] = 1
                            for (k in 0 until size) {
                                array[k + 1] = digits[k]
                            }
                            return array

                        } else {
                            digits[i] = 0
                        }
                    } else {
                        digits[i] = num2 + 1
                        break
                    }
                }
            }

        } else {
            digits[size - 1] = num + 1
        }
        return digits
    }


    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

    示例:

    输入: [0,1,0,3,12]
    输出: [1,3,12,0,0]
    说明:

    必须在原数组上操作，不能拷贝额外的数组。
    尽量减少操作次数。
     */

    fun moveZeroes(nums: IntArray): Unit {
        if (nums == null || nums.size === 0) {
            return
        }
        //记录非o元素开始位置
        var k = 0
        for (i in 0 until nums.size) {
            if (nums[i] !== 0) {
                nums[k++] = nums[i]
            }
        }
        while (k < nums.size) {
            nums[k] = 0
            k++
        }
    }


    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

    你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

    示例:

    给定 nums = [2, 7, 11, 15], target = 9

    因为 nums[0] + nums[1] = 2 + 7 = 9
    所以返回 [0, 1]
     */

    fun twoSum(nums: IntArray, target: Int): IntArray {

//        var array = IntArray(2)
//
//        for (i in 0 until nums.size) {
//            array[0] = i
//            for (k in i + 1 until nums.size) {
//                if (nums[i] + nums[k]==target) {
//                    array[1]=k
//                    return array
//                }
//            }
//        }
//        return array


        var map = hashMapOf<Int, Int>()

        for (i in 0 until nums.size) {
            if (map.contains(nums[i])) {
                return intArrayOf(map[target - nums[i]]!!,i)
            }
            map[target - nums[i]] = i
        }
        return intArrayOf()
    }


}
