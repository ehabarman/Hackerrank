package TheHackerRankInterviewPreparationKit.Arrays
//Date 1-8-2018
import java.util.*
fun main (args: Array<String>){
    val s = Scanner(System.`in`)
    val t = s.nextInt()
    for ( testcase in 1 .. t){
        val n = s.nextInt()
        val arr = IntArray(n)
        for(i in 0 until n)
            arr[i]=s.nextInt()
        var counter = 0
        var isChaotic = false
        for ( i in n-1 downTo 0)
        {
            if(arr[i]- (i+1) >2)
            {
                isChaotic=true
            }
            for ( j in Math.max(0,arr[i]-2) .. i)
                if (arr[j] > arr[i])
                    counter++
        }
        if(isChaotic)
            println("Too chaotic")
        else
            println(counter)
    }
    s.close()
}