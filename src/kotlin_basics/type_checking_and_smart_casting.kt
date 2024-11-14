package kotlin_basics

fun main() {
    val obj : Any = "This is String"

    // Type checking using is or !is operator
    if(obj is String) {
        println("String Length : ${obj.length}")
    } else {
        println("Object is not string")
    }

    // Smart Casting : To perform a runtime check that identifies whether an object conforms to a given type,
    // use the is operator or its negated form !is
    val str1 = "Kotlin"
    var str2: String? = null

    if(str1 is String) {
        // Smart casting: str1 shows string related functions automatically.
        println("length of String ${str1.length}")
    }
    else {
        println("String is null")
    }
}