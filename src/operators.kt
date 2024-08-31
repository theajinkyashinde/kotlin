fun main () {

    arithmeticOperators()
    relationalOperators()
    incrementOperator()
}

fun arithmeticOperators() {
    val a = 5
    val b = 2

    println(a + b)              // Sum
    println(a - b)              // Subtract
    println(a * b)              // Multiply

    // Division
    println(a / b)              // to get quotient  (divisor)
    println(a % b)              // to get remainder (modulus)
    println(a.toFloat() / b)    // to get output in float

    println()
}

fun relationalOperators() {
    val x = 10
    val y = 5

    println(x > y)              // greater than
    println(x < y)              // less than
    println(x >= y)             // greater than or equal to
    println(x <= y)             // less than or equal to

    println(x == y)             // equals
    println(x != y)             // not equals


    println()
}

fun incrementOperator() {
    var incrementVariable1 = 10

    // post-increment
    incrementVariable1++        // first use the value and then increment it in memory location by 1

    // pre-increment
    ++incrementVariable1        // first increment the value in memory location by 1 and then use it further

    var incrementVariable2 = 5
    println("pre- and post-increment : " + (incrementVariable2++ + ++incrementVariable2)) // 5 + 7 = 12


    println()
}