fun main() {

    // NOTE: array is variable, which stores multiple values of same data type

    // int type array
    val intArray = arrayOf(1, 2, 3)

    // string type array
    val stringArray = arrayOf("Hello", "Kotlin", "!")

    // explicit type declaration
    val explicitTypeDeclaredIntArray : Array<Int> = arrayOf(4, 5, 6)
    val explicitTypeDeclaredArray = arrayOf<String>("Hello", "Kotlin")

    // get array value at specific index

    println("---Get and Set Array Value")
    // 1. get using []
    println("Get using [] : ${intArray[0]}")
    // 2. get using get()
    println("Get using get method : ${intArray.get(0)}")
    // 3. set using []
    intArray[0] = 5
    println("Set using [] : ${intArray[0]}")
    // 4. set using set()
    intArray.set(0, 6) // set(index, value)
    println("Set using set method : $intArray[0]")
    // 5. get array size
    println("Array Size : ${intArray.size}")

    // iterate array with for loop to get index and value
    println("---Iterate Array Value with Index")
    for ((i, e) in stringArray.withIndex()) {
        println("Index[$i] : $e")
    }

    // NOTE: if get or set array value out of defined index, then at runtime it shows ArrayIndexOutOfBoundException error

}