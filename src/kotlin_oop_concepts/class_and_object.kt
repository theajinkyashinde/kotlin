package kotlin_oop_concepts

/* INFORMATION:

Object-Oriented Programming : Paradigm or model, which allows us to solve problem with help of different objects.

    * Class             :   Class is user-defined data type, which consist data members and member methods
    * Object            :   Object is an instance of class
    * Memory Allocation :   When we create an object, then only it allocates memory according to the class properties.
                            Object name is used to locate the property and method.

    * syntax            :   class ClassName (/* data members */) {
                                /* class body - member methods */
                            }
 */

class Person(val name: String, val age: Int) {

    fun personName() {
        println("Name : $name")
    }

    fun personAge() {
        println("Age : $age")
    }
}

fun main() {
    // person is an object of Person class
    val person = Person("Ajinkya", 36)

    // access class property
    println("Person Name : ${person.name}")
    println("Person Age : ${person.age}")

    // access class method
    person.personName()
    person.personAge()
}