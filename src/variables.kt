fun main() {

    /* INFO: VARIABLE

    - Simple box that holds the data
    - Each variable has a name to access its data

     */
    dataReAssignment()
    dataTypes()
}

fun dataReAssignment() {

    // var can be reassigned
    var intVar = 10
    intVar = 11

    // val can't be reassigned
    val message = "abc"

    println("var : $intVar")
    println("val : $message")
}


// DATA TYPES
fun dataTypes () {

    // INTEGER
    var byteType : Byte = 127                           // 1 byte : Range from -127 to 127
    var shortType : Short = 32767                       // Range from -32768 to 32767
    var intType : Int = 2147483647                      // Range from -2147483648 to 2147483647
    var longType : Long = 9223372036854775807           // Range from -9223372036854775808 to 9223372036854775807

    // FLOATING POINT
    var floatType: Float = 10.123456F                   // 32-bits with 6 decimal point precision
    var doubleType : Double = 10.12345678901234         // 64-bits with 14 digits decimal point precision

    // BOOLEAN
    var booleanType : Boolean = true

    // CHARACTERS
    var charType : Char = 'A'                           // Store single character with single quote
    var stringType : String = "Hello Kotlin !"          // Store sequence of characters (text)
}


/*

INFO: During compile time following two concepts check:

TYPE INFERENCE : Variable type recognised as per assigned value
TYPE CHECK : Variable type cannot be changed, once assigned

*/