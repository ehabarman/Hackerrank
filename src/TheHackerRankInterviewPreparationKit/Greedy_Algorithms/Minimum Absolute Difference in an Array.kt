package TheHackerRankInterviewPreparationKit.Greedy_Algorithms
//Date 12-8-2018
import java.util.*

fun main(args : Array<String>){

    val s = Scanner(System.`in`)
    val n = s.nextInt()
    val arr = IntArray(n)

    for( i in 0 until n)
        arr[i] = s.nextInt()

    Arrays.sort(arr)

    var min = Math.abs(arr[0]-arr[1])
    var current: Int

    for( i in 0 until n-1)
    {
        current = Math.abs(arr[i]-arr[i+1])
        if( current < min)
        {
            min = current
            if( min == 0)
                break
        }
    }
    println(min)
    s.close()
}