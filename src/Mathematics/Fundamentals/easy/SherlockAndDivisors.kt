//Date 26-7-2018
package Mathematics.Fundamentals.easy

import java.util.*
fun main(args: Array<String>){

    val scan = Scanner(System.`in`)
    var t = scan.nextInt()
    while(t-->0){
        val n = scan.nextInt()
        val upperLimit = Math.sqrt(n.toDouble()).toInt()
        var count = 0
        for (i in 2..upperLimit){
            if( n%i==0 && i%2==0 )
                count++
            if(n%(n/i)==0 && ((n/i)!=i) && ((n/i)%2==0))
                count++
        }
        if(n%2==0)
            count++
        println(count)
    }

    scan.close()
}
