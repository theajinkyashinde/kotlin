package kotlin_basics

/* INFORMATION:

Named Arguments:
Value of properties can be passed with name and in any sequence of order

 */

fun main () {
    val result1 = add(2, 2) // arguments
    println("Result 1 : $result1 \n")

    val result2 = add(5,10)
    println("Result 2 : $result2 \n")

    val result3 = sum(1,1)
    println("Result 3 : $result3 \n")

    // with argument
    printMessage(5)

    // without argument
    printMessage()

    println("--- Function as an Expression ---")

    // function as an expression (USAGE: function can send as a parameter)
    val fn: (num1: Int, num2: Int) -> Int = ::add   // (parameter 1 : DataType, parameter 2: DataType) -> ReturnType
    println("Function as Expression : ${fn(1 , 1)}")

    println("--- Named Arguments ---")

    println("Named Arguments 1 : ${add( num1 = 2, num2 = 2)}")
    println("Named Arguments 2 : ${sum( num2 = 2, num1 = 5)}")
}

/*
fun functionName ((val)parameterName 1: Datatype, (val)parameterName 2: Datatype) : ReturnType {

    block of code

    return Result --> if ReturnType is not mentioned, then it will be Unit by default
}
*/

// function
fun add (num1: Int, num2: Int) : Int {
    val sum = num1 + num2
    return sum
}

// one line function
fun sum(num1: Int, num2: Int) = num1 + num2

// default argument function
fun printMessage (count : Int = 2) {
    // if argument is not passed via function call, then default argument will be used
    for(i in 1..count) {
        println("Count : $i")
    }

    println()
}



