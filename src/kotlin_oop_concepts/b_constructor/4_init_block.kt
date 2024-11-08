package kotlin_oop_concepts.b_constructor

/*

Init (Initializer) Block:
If constructor needs to execute something, then this can be done in init block.
As primary constructors or class header can't contain any runnable code and can have only properties and parameters.

There can be multiple init blocks, which executes in same order as they appear in the class body.
The code in all init blocks and property initializers is executed before execution of the secondary constructor.

 */

class InitDemoClass (val initProperty : String, val anotherProperty: Int) {

    fun demoMethod () {
        println("Demo method !")
    }

    init {
        println("First initializer")
    }

    constructor(initParam : String) :
            this(initParam, 1) {
                println("Secondary c'tor")
            }

    init {
        println("Second initializer")
    }
}


fun main () {
    // object with primary c'tor
    val initDemo1 = InitDemoClass("Start1", 1)

    println("---")

    // object with secondary c'tor
    val initDemo2 = InitDemoClass("Start2")
}