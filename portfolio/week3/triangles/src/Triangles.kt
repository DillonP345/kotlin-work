// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
    if (triangle.first + triangle.second > triangle.third &&
        triangle.first + triangle.third > triangle.second &&
        triangle.second + triangle.third > triangle.first) {
        return true
    }
    return false
}

fun triangleArea(triangle: Triangle): Double {
    if (!isValidTriangle(triangle)){
        throw IllegalArgumentException()
    }
    val semiPerimiter = (triangle.first + triangle.second + triangle.third)/2
    val x = semiPerimiter * (semiPerimiter - triangle.first)*(semiPerimiter - triangle.second)*(semiPerimiter - triangle.third)
    return (sqrt(x))
}
