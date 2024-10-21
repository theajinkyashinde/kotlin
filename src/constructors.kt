fun main () {

    // ----- CONSTRUCTOR -----

    // --- Primary Constructor ---
    // Option 2 : Object cannot pass default values to the class parameters or initialize the value of the properties during object creation
    val emptyConstructorObject1 = EmptyConstructorClass()
    println(emptyConstructorObject1.param1)
    println(emptyConstructorObject1.param2)

    val emptyConstructorObject2 = EmptyConstructorClass()
    println(emptyConstructorObject2.param1)
    println(emptyConstructorObject2.param2)

    // Option 3 : Can pass the default values during creating instance of class, which is Object
    val person = Person("Ajinkya", 36)
    println("Name : ${person.nameParam}")
    println("Age : ${person.ageParam}")

    // Option 4 :
    val car = Automobile("Porsche", 2024, true)

    // --- Secondary Constructor ---
    // Class of secondary c'tor can use to crate object in a both way, either by calling primary or secondary c'tor

    // it will call directly with the primary c'tor
    var audi1 = GermanCar("Audi1", 4, 5, "Petrol")
    var porsche1 = GermanCar("Porsche1", 4, 5, "Petrol")

    // it will call first secondary c'tor and then primary c'tor
    // primary c'tor
    var audi2 = GermanCar("Audi2", "Petrol")
    var porsche2 = GermanCar("Porsche2", "Petrol")


    // ----- INITIALIZER -----
    val init = InitDemoClass("start")

}

// ----- CONSTRUCTOR -----
// C'tor is like a function but part of the class

// --- Primary Constructor ---

// Option 1 : There is no class header and body
class EmptyClass

// Option 2: Empty constructor, in which primary c'tor is empty and declared inside the class body and
class EmptyConstructorClass (/* primary constructor */) {

    val param1 : String = "Default Value"
    var param2 : Int = 0
}

// Option 3: Class with primary constructor having properties
class Person (val nameParam : String, val ageParam : Int) {
    // block of code
}

// Option 4: Class with primary constructor having properties and parameters
//           - in primary constructor, val and var is used to define property
//           - whereas, without any specification it is parameter of the class
//           and can be used in evaluated expression in the class body.
//           - airbag is property
class Automobile (val name : String, val year : Int, hasAirbags: Boolean) {
    var airbag = hasAirbags
}

// --- Secondary Constructor ---
// If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor,
// either directly or indirectly through another secondary constructor(s).
//
// Delegation to another constructor of the same class is done using this keyword
//
// Meaning of delegate : the act of empowering to act for another. the delegation of responsibilities.
class GermanCar (val name : String, val tyres : Int, val maxSeating: Int, val engineType: String) {

    //
    constructor(nameParam: String, engineParam: String) :
            this(nameParam, 4, 5, engineParam)
}


// ----- INITIALIZER -----
// If constructor needs to execute something, then this can be done in init block.
// As primary constructors or class header can't contain any runnable code and have only properties and parameters.
// There can be multiple init blocks, which executes in same order as they appear in the class body.
//
// The code in all initializer blocks and property initializers is executed before the body of the secondary constructor.
class InitDemoClass(val name : String) {
    init {
        println("this is first initializer")
    }
    init {
        println("this is second initializer")
    }
}