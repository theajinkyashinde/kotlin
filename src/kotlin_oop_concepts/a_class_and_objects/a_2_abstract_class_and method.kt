package kotlin_oop_concepts.a_class_and_objects

/* ABSTRACT CLASS AND METHODS:

Information:
-   An abstract class can not instantiate means we can not create object for the abstract class.
-   It may contain both abstract methods (methods without a body) and concrete methods (methods with a body).
-   An abstract member function doesn’t have a body, and it must be implemented in the child/derived class.
-   You don't need to annotate abstract classes or functions with open.
-   All the properties and methods of an abstract class are by default non-abstract.
    So, if we want to override these members in the child class, then we need to use 'override' keyword.

Advantages of using abstract classes in Kotlin:
-   Abstraction: Abstract classes provide a way to define a common contract between different classes without
    specifying the implementation details. This enables you to create abstractions
    that improve the modularity and maintainability of your code.

Disadvantages of using abstract classes in Kotlin:
-   Limited Instantiation: Abstract classes cannot be instantiated, so they provide limited instantiation details.

Reference : https://www.geeksforgeeks.org/kotlin-abstract-class/
 */

abstract class Shape {

    // abstract methods
    abstract fun area(): Double
    abstract fun display()

    // non-abstract method
    fun calculateDiameter() : Int {
        return 0
    }
}

class Circle (private val radius : Double) : Shape() {

    override fun area() : Double {
        return Math.PI * radius * radius
    }

    override fun display() {
        println("Circle shape is getting displayed !")
    }
}

fun main() {

    // to access abstract class and method
    val circleShape = Circle(5.0)
    println("Area of Shape : ${circleShape.area()}")
    circleShape.display()

    // to access non-abstract method
    circleShape.calculateDiameter()

}