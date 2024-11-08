package kotlin_oop_concepts.c_polymorphism

/* INHERITANCE:

GENERAL:
-   Simple meaning : Characteristics or behaviours, which we received from our parents.
-   We can also say as "is a" relationship.
    e.g.    Car is a Vehicle, Truck is a Vehicle.
            Square is a Shape, Triangle is a Shape.

OOP Concept:
-   In OOP, child class will be inherited from parent class.
    It means, child can access all the properties and methods of parent class,
    along with own specific properties and methods.

    following terminology is used to represent inheritance:
        1. parent-child class
        2. super-sub class
        3. base-derived class
        4. general-specific class
-   To make a class inheritable or parent, mark it with the 'open' keyword.
-   Also, first parent constructor is created, then child class constructor. (Child is not existed without a parent)
-   Kotlin supported only single kind inheritance. So, child class having only one parent.

USE:
-   Inheritance is used to improve code reusability and readability.

 */

open class Parent {

    init {
        println("Parent's c'tor is called")
    }

    val parentName = ""

    fun parentMethod () {
        println("This is parent method")
    }
}

class Child : Parent() {

    init {
        println("Child's c'tor is called")
    }

    val childName = ""

    fun childMethod () {
        println("This is child method")
    }

}

fun main() {
    val objChild = Child()

    // Child can access parent class method as well as properties
    objChild.parentMethod()
    objChild.childMethod()

}