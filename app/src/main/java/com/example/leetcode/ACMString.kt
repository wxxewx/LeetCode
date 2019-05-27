package com.example.leetcode

import kotlin.math.sign

class ACMString {

    /**
     * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。

    不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。

    你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。



    示例 1：

    输入：["h","e","l","l","o"]
    输出：["o","l","l","e","h"]
    示例 2：

    输入：["H","a","n","n","a","h"]
    输出：["h","a","n","n","a","H"]nul
     */
    fun reverseString(s: CharArray): Unit {
        var char: Char = 'a'
        for (i in 0 until s.size / 2) {
            val c = s[i]
            char = s[s.size - 1 - i]
            s[s.size - 1 - i] = c
            s[i] = char
        }
    }

    /**
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

    示例 1:

    输入: 123
    输出: 321
    示例 2:

    输入: -123
    输出: -321
    示例 3:

    输入: 120
    输出: 21
     */
    fun reverse(x: Int): Int {
        var temp = x
        var reverse = 0
        while (true) {
            val i = temp % 10
            temp /= 10
            reverse = reverse * 10 + i

            if (reverse > Int.MAX_VALUE / 10) {
                reverse = 0
                break
            }
            if (reverse < Int.MIN_VALUE / 10) {
                reverse = 0
                break
            }

            if (temp == temp % 10) {
                if (temp != 0) {
                    reverse = reverse * 10 + temp
                }
                break
            }
        }
        return reverse


    }
}