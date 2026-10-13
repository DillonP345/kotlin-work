// Task 5.2.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size !=1){
        println("ERROR: 1 command line argument needed to be passed into script")
        exitProcess(1)
    }
    else{
        var x = args[0].toDouble()
        println("%.4f".format(circleArea(x)))
        println("%.4f".format(circlePerimeter(x)))
    }
}