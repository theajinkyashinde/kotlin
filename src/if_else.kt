fun main() {
    conditionBased()
    checkMultipleConditions()
    asExpression()
}

fun conditionBased() {
    val condition = true

    if(condition)
        println("Condition is true")
    else
        println("Condition is false")
}

fun checkMultipleConditions() {
    val x = 4
    val y = 5

    if(x > y)
        println("x is greater than y")
    else if(x == y)
        println("x is equal to y")
    else
        println("x is smaller than y")
}

fun asExpression() {
    val number = 10
    val result = if(number % 2 == 0) "Number is even" else "Number is odd"
    println(result)

    // TIP: there is no ternary operator in Kotlin like other languages have
}
