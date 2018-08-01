package TheHackerRankInterviewPreparationKit.Arrays
//Date 1-8-2018
import java.util.*

fun main ( args: Array<String>){
    val s = Scanner(System.`in`)
    val n = s.nextInt()
    val d: Int = s.nextInt()%n
    val arr = IntArray(n)
    for( i in 1 .. n)
        arr[i-1] = s.nextInt()

    val rotatedArray = IntArray(n)

    for( i in 0 until n)
    {
        var newIndex = i-d
        if( newIndex < 0)
            newIndex+= n
        rotatedArray[newIndex]= arr[i]
    }

    for (element in rotatedArray) {
        print("$element ")
    }
    s.close()
}