// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDice(dice: Int = 1 ,sides: Int = 6) {
    var temp: Int = 0
    var result: Int = 0
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a $dice d$sides...")
        for (n in 1..dice) {
            temp = Random.nextInt(1, sides + 1)
            result += temp
            println("your result is $result")
        }
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}