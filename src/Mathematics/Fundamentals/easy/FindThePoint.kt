package Mathematics.Fundamentals.easy

import java.util.*
fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    var t = scan.nextInt()
    while(t-->0){
        val px = scan.nextInt()
        val py = scan.nextInt()
        val qx = scan.nextInt()
        val qy = scan.nextInt()
        println("${2*qx - px} ${2*qy - py}")
    }
    scan.close()
}