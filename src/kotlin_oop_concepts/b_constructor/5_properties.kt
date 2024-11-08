package kotlin_oop_concepts.b_constructor

/*

---> Property:

    The full syntax for declaring a property is as follows:

        var <propertyName>[: <PropertyType>] [= <property_initializer>]
            [<getter>]
            [<setter>]

        - The initializer, getter, and setter are optional.
        - The property type is optional if it can be inferred from the initializer or the getter's return type

    The full syntax of a mutable property declaration:
    e.g.    var initialized = 1     // has type Int, default getter and setter
            var allByDefault        // ERROR: explicit initializer required, default getter and setter implied

    The full syntax of a read-only property declaration differs from a mutable one in two ways:
    it starts with val instead of var and does not allow a setter:
     e.g.   val simple: Int?        // has type Int, default getter, must be initialized in constructor
            val inferredType = 1    // has type Int and a default getter

 */

class Calculator(val num1: Int, val num2: Int) {

    // val property with custom getter and no setter allowed
    val sum // property type is optional since it can be inferred from the getter's return type
        get() = this.num1 + this.num2

    val multiply: Int
        get() = this.num1 * this.num2

    // var property with default getter and setter syntax
    var result : Int = 10
        get() = field
        set(value) {
            field = value
        }

    // var property with custom getter and setter
    var subtract:Int = this.num1 - this.num2
        get() = field.dec()
        set(value) {
            if (value > 0)
                field = value
            else
                println("Subtraction is having negative value")
        }
}

class LateInitDemo () {
    /*    This modifier can be used on var properties declared inside the body of a class,
          as well as for top-level properties and local variables.
          (Not in the primary constructor, and only when the property does not have a custom getter or setter),

          The type of the property or variable must be non-nullable, and it must not be a primitive type.

          Accessing a lateinit property before it has been initialized
          throws a special exception that clearly identifies the property being accessed and
          the fact that it hasn't been initialized.

          Reference: https://kotlinlang.org/docs/properties.html#late-initialized-properties-and-variables
    */
    lateinit var firstProperty: String
}

fun main() {

    val calculator = Calculator(10, 4)

    println("Sum : ${calculator.sum}")
    println("Multiply : ${calculator.multiply}")
    println("Subtract : ${calculator.subtract}")

    // new value will override the default value of result property
    calculator.result = 5
    println("Result : ${calculator.result}")

    println("---")

    val lateInitDemo = LateInitDemo()
    lateInitDemo.firstProperty = "Initialized"
    println("LateInit Value : ${lateInitDemo.firstProperty}")
}