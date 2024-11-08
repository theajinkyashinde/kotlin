package kotlin_oop_concepts.c_polymorphism

/* INHERITANCE AND POLYMORPHISM:

2. Dynamic Polymorphism : Run-Time

    -   Dynamic polymorphism is achieved through function overriding and inheritance.
        Function overriding allows a subclass to provide a specific implementation for a method that is already
        defined in its superclass. At runtime, the correct method is determined based on the actual type of the object,
        and the overridden method in the subclass is called.
        (Reference: https://medium.com/@basdoganahmetcaner/using-polymorphism-in-kotlin-f380b0689b40)

    -   Parent can hold a reference to its child.
    -   Parent can call methods of child classes

    -   So we create an object using parent class reference, but with storing its child object in it.
        e.g. val objName : ParentClass (as Reference) = ChildClass(childProperty)

    -   In run-time polymorphism, the compiler resolves a call to overridden methods at runtime.
        We can achieve run-time polymorphism using method overriding.
    -   It decides on rum-time, which object will be called.
    -   Method Calling: Compiler will check method first in child class.
        If not available, then it will check in parent class, otherwise check in Any superclass.
        e.g. So, check area() method in below example first start with Square Class ->  Shape Class  ->  Any Class

Advantages of Polymorphism:
    -   Code can be maintainable and extendable.
    -   Helps in interacting with objects via common interface ???

Disadvantages of Polymorphism:
    -   Run time polymorphism can lead to the performance issue as machine needs to decide which method or variable
        to invoke so it basically degrades the performances as decisions are taken at run time.
    -   Polymorphism reduces the readability of the program. One needs to identify the runtime behavior of the program to identify actual execution time.

 */

/* M
 */

// Parent class with open keyword
open class Shape {
    open fun area() : Double {
        return 0.0
    }
}

// Child class with override keyword for parent's method
class Circle(val radius : Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

// Child class with override keyword for parent's method
class Square(val side : Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

// Child class with override keyword for parent's method
class Triangle(val base : Double, val height : Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}

// Example 1: of dynamic polymorphism, where same method behaves differently based on the objects
fun calculateAreas(shapes : Array<Shape>) {
    for(shape in shapes) {
        println("Calculate Areas : ${shape.area()}")
    }
}

// Example 2: Where we expect parent class object, there we can pass child class object as well.
fun printArea1(shape: Shape) {
    println(shape.area())
}

// Example 3: If we expect child class object, and we pass parent class object, then it will not work.
fun printArea2(shape: Square) {
    println(shape.area())
}

fun main () {
    // Create object for circle and square class
    val circle : Circle = Circle(4.0)
    val square : Square = Square(4.0)

    println("Circle : ${circle.area()}")
    println("Square : ${square.area()}")

    println("---")

    // Polymorphism
    val polymorphismCircle : Shape = Circle(4.0)
    val polymorphismSquare : Shape = Square(4.0)

    println("Polymorphism Circle : ${polymorphismCircle.area()}")
    println("Polymorphism Square : ${polymorphismSquare.area()}")

    println("---")

    // Example 1
    val shapes1 = arrayOf(Circle(3.0), Circle(4.0), Square(4.0))
    calculateAreas(shapes1)
    val shapes2 = arrayOf(Circle(3.0), Circle(4.0), Triangle(4.0, 5.0))
    calculateAreas(shapes2)

    println("---")

    // Example 2
    val shape1 = Shape()
    printArea1(shape1)

    val squareObj = Square(4.0)
    printArea1(squareObj)

    println("---")

    // Example 3
    val shape2 = Shape()

    // Shape object will not accept, as it is expecting square object
    printArea2(squareObj)//shape2

}


