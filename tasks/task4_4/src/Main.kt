// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if (args.size !=3){
        println("Error: 3 arguments were not passed into the script ")
        exitProcess(1)
    }
    else{
        val x = args[0].toFloat()
        val y = args[1].toFloat()
        val z = args[2].toFloat()
        var temp = x
        var fahrenheit = 0.0
        println("your minimum value is $x, your maximum value is $y, and it increments by $z ")
        println("%7s  %10s".format("Celsius", "Fahrenheit"))
        while (temp <= y){
            temp += z
            fahrenheit = (temp * 1.8) + 32
            println("%7.1f  %10.1f".format(temp, fahrenheit))
        }
    }
}
