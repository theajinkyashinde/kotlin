/* NOTE:

OOP - Object-Oriented Programming

* Paradigm or model, which allows us to solve problem with help of different objects

    - Class     : class is user defined data type, which consist different data members and member methods
                  1. Data Members -
                    - Property
                    - Attribute
                    - Class variable
                    - Field

                  2. Member Methods - which performs action on data member

                  EXAMPLE :

                  class Class_Name (val dataMember1 : DataType, val dataMember2: DataType) {

                        fun methodName () {
                            // block of code, which performs an action on data members of class
                        }
                  }

    - Object    : Object is an instance of a class, which is real world entity

* Memory Allocation: When we create an object, then it allocates memory for all data members and then
object name is used to locate the data member.

e.g. val audiQ3 = Car("Q3 TDI", "Diesel", 5000)

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

