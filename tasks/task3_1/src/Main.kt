// Task 3.1: command line arguments

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size !=2) {
        println("Error: filename required as two argument must be passed to script via termninal")
        exitProcess(1)
    }
    else(
        println("Two arguments passed")
    )



    // required argument available here, as args[0]
}