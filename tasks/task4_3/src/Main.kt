// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String> {
    if (args.size != 3){
        println("Error: 3 arguments need to be passed in")
        exitProcess(1)
    }
    else{
        val avg = ((args[0] + args[1] + args[2])/ 3).roundToInt
        val grade = when(avg){
            in 0..39 -> "Fail"

        }
    }
}