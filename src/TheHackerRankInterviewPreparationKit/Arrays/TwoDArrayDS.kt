package TheHackerRankInterviewPreparationKit.Arrays
//Date 29-7-2018

import java.util.*

fun main(args: Array<String>){
    val n = 6
    val array = Array(n, {IntArray(n)})
    val s = Scanner(System.`in`)

    for ( i in 0.. (n-1))
        for( j in 0.. (n-1))
            array[i][j]=s.nextInt()

        var maxSum = -1000
    for ( i in 1..4)
        for( j in 1..4){
            val upperPartSum = array[i-1][j-1]+array[i-1][j]+array[i-1][j+1]
            val lowerPartSum = array[i+1][j-1]+array[i+1][j]+array[i+1][j+1]
            val totalSum = upperPartSum + lowerPartSum + array[i][j]
            if(totalSum > maxSum)
                maxSum=totalSum
        }

    println("$maxSum")
    s.close()
}