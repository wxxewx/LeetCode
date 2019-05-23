package com.example.leetcode


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
}
