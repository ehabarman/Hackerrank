//Date 26-7-2018
package Mathematics.Fundamentals.easy

import java.util.*

fun main(args:Array <String>){

    fun gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b, a % b)
    val s = Scanner(System.`in`)
    var t = s.nextInt()
    while( t-->0){
        val a = s.nextInt()
        val b = s.nextInt()
        val result = gcd(a,b)
        println("${(a*b)/(result*result)}")
    }


    s.close()
}