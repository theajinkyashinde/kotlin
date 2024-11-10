package kotlin_oop_concepts.a_class_and_objects

/* INTERFACES:

-   Common Terminology : Interface is a contract, which states that whoever implements that interfaces, has to
    provide the implementation / method body for the methods.
-   Interfaces are meant for behaviours
-   Classes, which exhibits that behaviour implements that interface
-   Objects can group together based on their behaviour.
-   Interfaces can have both abstract and concrete methods. By default, all property and method are abstract.
-   Interface can implement other interfaces and
-   One class can implement or have many interfaces.
    One class can have only one parent/super class.
-   Polymorphism is achieved for unrelated classes (i.e. classes which do not belong to same inheritance hierarchy)

 */

// --- Class ---

// Shape Class and Sub-Classes
abstract class Shapes : DragInterface{
    abstract fun area()
}

class Circles (val radius : Double) : Shapes() {
    // override interface property
    override val property: Int = 0

    override fun area() = println("Circle Area : ${Math.PI * radius * radius}")

    override fun drag() = println("Circle is dragging")

}

class Squares (val sides : Double) : Shapes() {

    // override interface property with get()
    override val property: Int
        get() = 0

    override fun area() = println("Square Area : ${sides * sides}")


    override fun drag() = println("Square is dragging")
}

class Triangles (val base : Double, val height : Double) : Shapes() {
    // override interface property
    override val property: Int = 0
    override fun area() = println("Triangle Area : ${0.5 * base * height}")
    override fun drag() = println("Triangle is dragging")
}

// Player Class with multiple interfaces
class Player (val name : String) : DragInterface, CloneInterface{
    // override interface property
    override val property: Int = 0

    fun getPlayerName() = println("Player name is $name")   // class specific concrete method

    override fun drag() = println("$name is dragging")
    override fun clone() = println("$name is cloning")
}

// --- Interfaces ---
interface DragInterface {

    // Declaration of abstract property
    val property: Int

    // Declaration of concrete property with default implementation
    val propertyWithImplementation: String
        get() = "Default Implementation"

    // Declaration of abstract method
    fun drag()

    // Declaration of concrete method with default implementation
    fun defaultMethod() {
        // function body - default implementation
    }
}

interface CloneInterface {
    fun clone()
}

// --- Functions ---
fun main() {
    // call dragObjects using subclasses of shapes
    dragObjects(arrayOf(Circles(4.0), Squares(5.0), Triangles(4.0, 5.0)))

    println("---")

    // call dragObjects using subclasses of shapes and player class using interface
    dragObjects(arrayOf(Circles(4.0), Squares(5.0), Triangles(4.0, 5.0), Player("Smiley")))

    println("---")
    cloneObjects(arrayOf(Player("Smiley")))
}

fun dragObjects(objects: Array<DragInterface>) {
    for(obj in objects) {
        obj.drag()
    }
}

fun cloneObjects(objects: Array<CloneInterface>) {
    for(obj in objects) {
        obj.clone()
    }
}