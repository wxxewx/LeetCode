package com.example.leetcode

import org.junit.Test

public class ACMArrayTest {

    val acmArray = ACMArray()

    @Test
    fun deleteDuplicatesFromSortedArrays_test() {
        val intArrayOf = intArrayOf(1, 1, 2, 2, 3, 4)
        assert(acmArray.deleteDuplicatesFromSortedArrays(intArrayOf) == 4)
        assert(intArrayOf[0] == 1)
        assert(intArrayOf[1] == 2)
        assert(intArrayOf[2] == 3)
        assert(intArrayOf[3] == 4)

        val intArrayOf2 = intArrayOf(1, 1, 2, 2, 3, 4, 4)
        assert(acmArray.deleteDuplicatesFromSortedArrays(intArrayOf2) == 4)
        assert(intArrayOf2[0] == 1)
        assert(intArrayOf2[1] == 2)
        assert(intArrayOf2[2] == 3)
        assert(intArrayOf2[3] == 4)


        val intArrayOf3 = intArrayOf(0, 1, 1, 2, 2, 3, 4)
        assert(acmArray.deleteDuplicatesFromSortedArrays(intArrayOf3) == 5)
        assert(intArrayOf3[0] == 0)
        assert(intArrayOf3[1] == 1)
        assert(intArrayOf3[2] == 2)
        assert(intArrayOf3[3] == 3)
        assert(intArrayOf3[4] == 4)


        val intArrayOf4 = intArrayOf(0)
        assert(acmArray.deleteDuplicatesFromSortedArrays(intArrayOf4) == 1)
        assert(intArrayOf4[0] == 0)


        val intArrayOf5 = intArrayOf()
        assert(acmArray.deleteDuplicatesFromSortedArrays(intArrayOf5) == 0)

    }


    @Test
    fun maxProfit_test() {
        var array1 = intArrayOf(7, 1, 5, 3, 6, 4)
        var array2 = intArrayOf(1, 2, 3, 4, 5)
        var array3 = intArrayOf(7, 6, 4, 3, 1)

        assert(acmArray.maxProfit(array1) == 7)
        assert(acmArray.maxProfit(array2) == 4)
        assert(acmArray.maxProfit(array3) == 0)
    }


    @Test
    fun plusOne_test(){
        var array1 = intArrayOf(9,9,9)
        assert(acmArray.plusOne(array1) == intArrayOf(1,0,0,0))
    }
}