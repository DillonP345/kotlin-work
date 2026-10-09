// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>){
    if (args.size != 3){
        println("Error: 3 arguments need to be passed in")
        exitProcess(1)
    }
    else{
        var x = ((args[0].toFloat() + args[1].toFloat() + args[2].toFloat())/ 3)
        val grade = when(x){
            in 0.0..39.9 -> "Fail"
            in 40.0..69.9 -> "Pass"
            in 70.0..100.0 -> "Distinction"
            else -> "not applicaible"

        }
        println("you got a $grade with a score of $x")
    }
}