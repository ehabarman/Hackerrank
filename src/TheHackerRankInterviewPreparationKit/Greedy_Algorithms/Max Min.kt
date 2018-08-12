package TheHackerRankInterviewPreparationKit.Greedy_Algorithms
//Date 12-8-2018
import java.util.*

fun main(args : Array<String>){

    val s = Scanner(System.`in`)
    val n = s.nextInt()
    val k = s.nextInt()
    val arr = IntArray(n)

    for( i in 0 until n)
        arr[i] = s.nextInt()

    Arrays.sort(arr)

    var min = arr[k-1]-arr[0]
    var current: Int

    for( i in 1 until n-k+1)
    {
        current = arr[i+k-1]-arr[i]
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