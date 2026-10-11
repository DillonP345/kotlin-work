// Task 4.7: finding the longest line in a file
import kotlin.system.exitProcess
import kotlin.io.path.*

fun main(args: Array<String>) {
    if (args.size != 1){
        println("ERROR: 1 command line argument needed")
        exitProcess(1)
    }
    else{
        val path = Path(args[0].toString())
        path.useLines{
            for (lines in it){
                println(lines)


                }
            }
        }

    }