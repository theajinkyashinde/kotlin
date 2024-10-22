package kotlin_oop_concepts

/* INFORMATION:

Function Overloading    :   With this feature of OOP, function / method can be defined multiple times with same name,
                            but with different no. of parameter, different data types and different return type

Named Arguments         :   Value of properties can be passed with name and in any sequence of order
 */

fun main () {
    println("Addition with Int : ${addition(2, 2)}")
    println("Addition with Double : ${addition(2.0, 2.0)}")
    println("Addition with More Parameters : ${addition(2, 2, 2)}")

    println("---")

    println("Named Arguments 1 : ${addition( num1 = 2, num2 = 2)}")
    println("Named Arguments 2 : ${addition( num2 = 2, num1 = 5)}")
}

fun addition(num1: Int, num2 : Int) : Int {
    return num1 + num2
}

fun addition(num1: Double, num2 : Double) : Double {
    return num1 + num2
}

fun addition(num1: Int, num2 : Int, num3: Int) : Int {
    return num1 + num2 + num3
}


