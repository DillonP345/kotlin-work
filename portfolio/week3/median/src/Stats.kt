// Task 7.7.1: statistics functions
fun median(values: List<Float>): Float {
    require(values.isNotEmpty()) { "Can't take the median of an empty list" }
    val sorted = values.sorted()
    val mid = sorted.size / 2
    return if (sorted.size % 2 == 1) {
        sorted[mid]                              // odd: e.g. size 5 -> index 2
    } else {
        (sorted[mid - 1] + sorted[mid]) / 2      // even: e.g. size 4 -> indices 1 and 2
    }
}