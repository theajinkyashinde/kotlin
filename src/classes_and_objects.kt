/* NOTE:

OOP - Object-Oriented Programming

* Paradigm or model, which allows us to solve problem with help of different objects

    - Class     : class is user defined data type, which consist different data members and member methods
                  1. Data Members - Object knows

                    - Property : is a broad concept used to denote a particular characteristic of a class,
                    encompassing both its attributes and its relationships to other classes.

                    - Attribute : denotes a part of an aggregate object,
                    and so is used during analysis as well as design to express a singular property of the class.

                    - Class variable : is an attribute defined in a class of which a single copy exists,
                    regardless of how many instances of the class exist. So all instances of that class share
                    its value as well as its declaration.

                    - Field : is a language-specific term for instance variable, that is,
                    an attribute whose value is specific to each object.

                  2. Member Methods - Object does

                  EXAMPLE :

                  class Class_Name (val dataMember1 : DataType, val dataMember2: DataType) {

                        fun methodName () {
                            // block of code
                        }
                  }

    - Object    : Object is an instance of a class, which is real world entity

*/

fun main () {

    // Objects
    val audiQ3 = Car("Q3 TDI", "Diesel", 5000)
    val audiA5 = Car("A5 TFSI", "Petrol", 2000)
    val audiQ3e = Car("Q3 TFSIe", "Hybrid", 4000)
    val audiA3e = Car("A3 TFSIe","Hybrid", 2300)

    // Dot operator to access class property
    println("Car Model : ${audiQ3.name}")
    println("Engine Type : ${audiQ3.type}")

    // Dot operator to access class method
    audiQ3e.driveCar()
    audiQ3e.totalKmRan()

}

class Car (val name: String, val type: String, var kmRan: Int) { // Properties

    fun driveCar() { // Methods
        println("$name is driving")
    }

    fun totalKmRan() {
        println("Total KM for $name : $kmRan Km")
    }
}

