//date 26-7-2018
package Mathematics.Fundamentals.easy

import java.util.*

fun main(args:Array<String>){
    val scan = Scanner(System.`in`)
    val L = scan.nextInt()
    fun getFastAndSlow(a:Int , b:Int) = if(a>b) Pair(a,b) else Pair(b,a)
    val (fast, slow) = getFastAndSlow(scan.nextInt(), scan.nextInt())
    var q = scan.nextInt()
    while(q-->0){
        val x = Math.sqrt(scan.nextLong()*2.0)
        val time = (x-L*Math.sqrt(2.0))/(slow-fast)
        if(time <= 0)
            println("0.0000")
        else
            println("$time")
    }
    scan.close()
}