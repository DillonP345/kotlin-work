// Task 5.4.1: main program
fun main(args: Array<String>) {
    val x = listOf("wasd","wasddd","cool oclwasd fawwongaeofeaosidwjfnaoiwfnas")
    for (s in x) {
        println("$s -> ${s.isTooLong()}")
    }
}