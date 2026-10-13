// Task 5.1.2: main program
import kotlin.system.exitProcess
import kotlin.random.Random

fun main(args: Array<String>) {
    if(args.size !=1){
        println("ERROR: command line arg needed to be passed into script")
        exitProcess(1)
    }
    else{
        val x = args[0].toInt()
        rollDie()
    }
}