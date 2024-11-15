package kotlin_basics

/* VISIBILITY MODIFIERS

- There are four visibility modifiers:

        Modifiers       |       Top Level Declarations      |       Class Members
---------------------------------------------------------------------------------------------
    1. Public           |       Everywhere                  |       Everywhere
    2. Internal         |       Within a module             |       Within a module
    3. Private          |       Within file                 |       Within a class
    4. Protected        |       N/A                         |       Subclasses
---------------------------------------------------------------------------------------------

 */

// --- Top Level Declarations ---
class TopLevel
var a = 0
private var b = "Test"
fun topLevelFunction () {
    println("This is Top Level Function")
}

// --- Class Members ---

open class A {
    public var p = 10
    internal var q = 20
    private var r = 30      // Available only for this class
    protected var s = 40    // Only applies to class members, available subclass can access it.
}

class B: A() {
    fun test() {
        println(p)
        println(q)
        println(/*r*/)      // Not visible
        println(s)
    }

}

fun main() {
    val objA = A()
    val objB = B()

    objA.p = 11
    objA.q = 21

    objB.p = 12
    objB.q = 22
    objB.test()

}
