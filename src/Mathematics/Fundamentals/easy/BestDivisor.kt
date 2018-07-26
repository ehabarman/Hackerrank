package Mathematics.Fundamentals.easy

//Date 26-7-2018
import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n: Int = scan.nextInt()
    var sum = 1
    var value = 1
    for(i in 2..n) {
        if ( n%i != 0)
            continue
        else{
            var temp = i
            var currentSum = 0
            while(temp > 0){
                currentSum+= temp%10
                temp/=10
            }
            if(currentSum > sum) {
                sum = currentSum
                value = i
            }
        }
    }
    println("$value")
    scan.close()
}