package kotlin_oop_concepts.constructor

/*

Secondary Constructor:
If the class has a primary constructor, each secondary constructor needs to delegate or call to the primary constructor,
either directly or indirectly through another secondary constructor(s).
Delegation / call to another constructor of the same class is done using this keyword

Meaning of delegate : the act of empowering to act for another. the delegation of responsibilities.

 */

class GermanCar (val name : String, val tyres : Int, val maxSeating: Int, val engineType: String) {

    constructor(nameParam: String, engineParam: String) :
            this(nameParam, 4, 5, engineParam)
}


fun main () {

    // Class with secondary c'tor can use to crate an object in a both way,
    // either by specifying all the arguments of primary or
    // only with secondary c'tor arguments

    // object will create using primary c'tor properties
    var audi1 = GermanCar("Audi1", 4, 5, "Petrol")
    var porsche1 = GermanCar("Porsche1", 4, 5, "Petrol")

    // object will create using secondary c'tor, and secondary c'tor will call primary c'tor by default
    var audi2 = GermanCar("Audi2", "Petrol")
    var porsche2 = GermanCar("Porsche2", "Petrol")
}