package kotlin_oop_concepts.inheritance_and_polymorphism

/* INFORMATION

Polymorphism:
Polymorphism is used for implementing inheritance.

There are two types of polymorphism.
1. Run-Time Polymorphism
2. Compile-Time Polymorphism

1.  Run-Time Polymorphism
    -   Parent can hold a reference to its child.
    -   Parent can call methods of child classes

    -   So we create an object using parent class reference, but we are storing its child object in it.
        e.g. val objName : ParentClass (as Reference) = ChildClass(childProperty)

    -   In run-time polymorphism, the compiler resolves a call to overridden methods at runtime.
        We can achieve run-time polymorphism using method overriding.
    -   It decides on rum-time, which object will be called.

    -   Advantages of Polymorphism:
        a.  Code can be maintainable and extendable.
        b.  Helps in interacting with objects via common interface ???

    -   Disadvantages of Polymorphism:
        a.  Run time polymorphism can lead to the performance issue as machine needs to decide which method or variable
            to invoke so it basically degrades the performances as decisions are taken at run time.
        b.  Polymorphism reduces the readability of the program. One needs to identify the runtime behavior of the program to identify actual execution time.

 */

open class Shape {
    open fun area() : Double {
        return 0.0
    }
}

class Circle(val radius : Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val side : Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

class Triangle(val base : Double, val height : Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}

fun calculateAreas(shapes : Array<Shape>) {
    for(shape in shapes) {
        println("Calculate Areas : ${shape.area()}")
    }
}

fun main () {
    // Create object for circle and square class
    val circle : Circle = Circle(4.0)
    val square : Square = Square(4.0)

    println("Circle : ${circle.area()}")
    println("Square : ${square.area()}")

    // Polymorphism
    val polymorphismCircle : Shape = Circle(4.0)
    val polymorphismSquare : Shape = Square(4.0)

    println("Polymorphism Circle : ${polymorphismCircle.area()}")
    println("Polymorphism Square : ${polymorphismSquare.area()}")

    // Advantage of Polymorphism
    val shapes1 = arrayOf(Circle(3.0), Circle(4.0), Square(4.0))
    calculateAreas(shapes1)
    val shapes2 = arrayOf(Circle(3.0), Circle(4.0), Triangle(4.0, 5.0))
    calculateAreas(shapes2)
}