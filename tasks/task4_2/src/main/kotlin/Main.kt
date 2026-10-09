// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    print("welcome to the pizzeria. your options are; (a) Margherita, (b) Pepperoni  (c) BBQ Chicken (d) Meat lovers ")
    val choice = readln().lowercase()
    if (choice.length == 1 && choice[0] in 'a'..'d') {
        println("order accepted")
    }
    else{
        println("Invalid choice!")
    }
}
