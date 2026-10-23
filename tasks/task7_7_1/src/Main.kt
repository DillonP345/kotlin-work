// Task 7.7.1: program to compute stats for a numeric dataset
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Usage: provide the name of a data file")
        return
    }
    val data = readData(args[0])
    displayStats(data)
}