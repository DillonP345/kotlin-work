// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1){
        println(" ERROR: needs to be 1 argument passed into script from command line")
    }
    else{
        var total = 0
        val upperBound = args[0].toInt()
        if (upperBound >= 1){
            for (n in 1..upperBound step 2){
                total += 1
                println("currently on $n")
        }
        }
    println("from 1 to $upperBound there are $total nunmber for odd numbers ")
    }
}
