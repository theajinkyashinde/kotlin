package kotlin_oop_concepts.constructor

/*
Primary Constructor: Please see constructor definition in 1_default_constructor file.
Also, primary constructor always takes place in round brackets after class name, and it contains
properties or parameters.

It can't contain any runnable code.
Runnable code can write into init block or body of the class

 */

/*

In this class name and age are the properties of the class, and declared it in primary
c'tor. Whereas, canVote is parameter like normal function, which can be used further in evaluated expression.

 */
class PrimaryPerson (val name : String, val age: Int, canVote: Boolean) {

    val primaryPersonCanVote = canVote

    fun primaryPersonName() {
        println("Name : $name")
    }

    fun primaryPersonCanVote() {
        println("Can primary person vote? : $primaryPersonCanVote")
    }

}

fun main () {
    val primaryPerson = PrimaryPerson("Ajinkya", 36, true)
}