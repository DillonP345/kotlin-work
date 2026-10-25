fun main(args: Array<String>) {
    val x = listOf("wasd","wasddd","cool oclwasd fawwongaeofeaosidwjfnaoiwfnas")
    for (s in x) {
        println("$s -> ${s.isTooLong}")
    }
}