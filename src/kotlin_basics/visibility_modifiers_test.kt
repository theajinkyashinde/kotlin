package kotlin_basics

fun fn() {

    // Access Public
    var topLevel = TopLevel()
    topLevelFunction()
    println("Value of a : $a")
    println("Value of b : not accessible as private b")

    // Without any modifier class is by default public
    val a = A()

}