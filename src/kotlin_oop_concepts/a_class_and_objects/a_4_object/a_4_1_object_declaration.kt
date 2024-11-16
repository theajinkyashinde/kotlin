package kotlin_oop_concepts.a_class_and_objects.a_4_object

/* OBJECT DECLARATION:

-   Creating object without declaring class and initiated at only once.
-   Singleton pattern: A class, and it's object is created only at once.
    Example: Logger object is created once and all features or modules use only that particular logger object.
    Please follow a_4_2_singleton_object.kt more information
-   No Constructors are allowed, as it can not be used to create multiple objects.
-   Though init block is allowed.
-   You can inherit class or interface

 */

// Object Declaration
object A {
    var num: Int = 10
}

object B {
    val p: Int = 20
    fun test() {
        println("I am Object B")
    }
}

fun main() {

    A.num = 11
    println("Object B.p : ${B.p}")
    B.test()
}