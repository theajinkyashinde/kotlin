fun main() {
    toImproveReadability()
    range()
}

fun toImproveReadability() {

    // to improve readability

    /* val animal = "Dog"

    if(animal == "Dog")
        println("Animal is Dog")
    else if(animal == "Cat")
        println("Animal is Cat")
    else if(animal == "Horse")
        println("Animal is Horse")
    else
        println("Animal is not found") */

    val animal = "Dog"

    // as statement

    when(animal) {
        "Dog" -> println("Animal is Dog")
        "Cat" -> println("Animal is Cat")
        "Horse" -> println("Animal is Horse")
        else -> println("Animal is not found")
    }

    // as expression

    val result = when(animal) {
        "Dog" -> "Animal is Dog"
        "Cat" -> "Animal is Cat"
        "Horse" -> "Animal is Horse"
        else -> "Animal is not found"
    }

    println(result)
}

fun range() {
    val number = 5

    // upper bound included
    val resultWithUpperBound = number in 1..5 // 1,2,3,4,5
    println("resultWithUpperBound: $resultWithUpperBound")

    // upper bound not included
    val resultWithoutUpperBound = number in 1 until 5  // 1,2,3,4
    println("resultWithoutUpperBound : $resultWithoutUpperBound")
}