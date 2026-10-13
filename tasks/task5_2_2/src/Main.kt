// Task 5.2.2: conversion of marks into grades, using a function
import kotlin.system.exitProcess

fun grade(mark: Int): String {
    when (mark) {
        in 0..39   -> return "Fail"
        in 40..69  -> return "Pass"
        in 70..100 -> return "Distinction"
        else       -> return "?"
    }
}

fun main(args: Array<String>) {
    if (args.size < 1){
        println("ERROR: needs atleast one argument passed into script")
        exitProcess(1)
    }
    else{
        for (n in args.indices){
            var x = args[n].toInt()
            var y = grade(x)
            println("$x is a $y")

        }
    }

}