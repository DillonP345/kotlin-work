// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    val semiPerimiter = (args[0].toDouble() + args[1].toDouble() + args[2].toDouble())/2
    val x =semiPerimiter * (semiPerimiter - args[0].toDouble())*(semiPerimiter - args[1].toDouble())*(semiPerimiter - args[2].toDouble())
    val area = "%.5f".format(sqrt(x))
    println("Area = $area")

}