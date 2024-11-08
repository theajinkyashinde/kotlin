package kotlin_oop_concepts.b_constructor

/* INFORMATION:

Constructor :   Constructors are methods that are automatically executed every time you create an object.
                The purpose of a constructor is to construct an object and assign values to the object's members.
                A constructor takes the same name as the class to which it belongs, and does not return any values.
 */

/* Default or Empty Primary Constructor :   A default constructor is a constructor that either has no parameters,
                                            or if it has parameters, all the parameters have default values.
 */
class EmptyPerson() {

}

class DefaultPerson(var name: String = "Ajinkya", var age: Int = 36) {

}

fun main() {

    // empty constructor
    val emptyPerson = EmptyPerson()

    // empty arguments will executes default values of properties
    val defaultPerson1 = DefaultPerson()
    println("Person 1 Name : ${defaultPerson1.name}, Person 1 Age : ${defaultPerson1.age}")

    // new arguments will overrides default values of constructor
    val defaultPerson2 = DefaultPerson("Jui", 33)
    println("Person 2 Name : ${defaultPerson2.name}, Person 2 Age : ${defaultPerson2.age}")

}