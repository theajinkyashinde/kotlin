package kotlin_oop_concepts.a_class_and_objects.a_4_object

/* COMPANION OBJECT:

-   Generally companion means a friend, who is close enough, and we can share his belongings
    without asking his or her permission.
-   Companion object's property or method can call directly using class name without referring companion object
-   One companion object is allowed per class
-   Using @JvmStatic annotation at companion object's method, we can tell to the JVM that
    please use the companion object like java's static methods

-   Factory Pattern ???

 */

class MyClass {
    // Singleton object associated with class, instance is only once created
    object MyObject {
        fun f() {
            println("Hello I am F from object")
        }
    }

    object MyAnotherObject {
        fun g() {
            println("Hello I am G from object")
        }
    }

    // Singleton companion object associated with class, instance is only once created
    companion object MyCompanionObject {
        fun cf() {
            println("Hello I am CF from companion object")
        }

        @JvmStatic
        fun jvmStaticMethod() {
            println("Hello I am JVM Static Method")
        }
    }
}

fun main() {
    // Class with Object
    MyClass.MyObject.f()
    MyClass.MyAnotherObject.g()

    // Class with Companion Object
    MyClass.cf()
}