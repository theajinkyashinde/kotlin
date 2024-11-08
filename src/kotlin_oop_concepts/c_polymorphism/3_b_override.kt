package kotlin_oop_concepts.c_polymorphism

/* INFORMATION:

Overriding:
-   Child class can override the parent's property or method as per own requirement.
-   Use 'open' keyword in parent's class property or method, and 'override' keyword in child class property or method.
-   If we want to call first parent's method first and then own specification, then super.methodName is used in override
    method.

Override Getter and Setter: ???

Any:
-   Every Kotlin class has 'Any' as a super class / parent class.

 */
open class Mobile(val type : String) {
    open val name : String = ""
    open val size : Int = 5

    fun makeCall() = println("Calling From Mobile")
    fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")
}

class Apple(typeParam : String) : Mobile(typeParam) {
    override val name : String = "Apple"
    override val size : Int = 6

    override fun display() {
        super.display()
        println("Apple Retina Display")
    }

    override fun toString(): String {
        return "Mobile Name - $name & Size - $size"
    }
}

fun main () {

    // Apple class will override the mobile class display method
    val apple = Apple("SmartPhone")
    apple.display()

    // Mobile class display method remain same
    val nokia = Mobile("General")
    nokia.display()

    // Override parent class any's method
    println(apple.toString())

}