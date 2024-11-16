package kotlin_oop_concepts.a_class_and_objects.a_4_object

/* OBJECT EXPRESSION:

-   We can create object without specific name, so we call this anonymous object.
-   Follows all object declaration steps

 */

open class Person(val name: String) {
    open fun fullName() = println("Full Name: $name")
}

interface Cloneable {
    fun clone()
}

fun main() {

    // Object as an expression
    val objExpression = object {
        val x: Int = 10
        fun method() {
            println("I am object Expression")
        }
    }

    println(objExpression.method())

    println("---")

    val objClass = object : Person("Ajinkya") {
        override fun fullName() {
            super.fullName()
            println("I am anonymous : $name")
        }
    }

    objClass.fullName()

    println("---")

    // Object as an expression with interface
    val objInterface = object : Cloneable {
        override fun clone() {
            println("I am clone")
        }
    }

    objInterface.clone()

    println("---")
}