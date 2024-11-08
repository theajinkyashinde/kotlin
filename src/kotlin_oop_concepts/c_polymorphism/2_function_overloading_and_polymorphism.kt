package kotlin_oop_concepts.c_polymorphism

/* FUNCTION OVERLOADING AND POLYMORPHISM:

1.  Static Polymorphism : Compile-Time
    -   Static polymorphism is achieved through function overloading.
    -   Function overloading allows multiple functions to have the same name but with different parameter lists,
        different data types and different return type
    -   The appropriate function to be called is determined at compile time based on the number
        and types of arguments passed.

 */

fun main () {
    println("Addition with Int                      : ${addition(2, 2)}")
    println("Addition with Different Return Type    : ${addition(2.0, 2.0)}")
    println("Addition with More Parameters          : ${addition(2, 2, 2)}")
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


