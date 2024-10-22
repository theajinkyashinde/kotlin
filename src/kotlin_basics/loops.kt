package kotlin_basics

fun main() {
    // while loop
    println("---WHILE LOOP")
    var count = 0

    while(count < 5) {
        println("Count : $count")
        count++
    }

    println("Count (outside loop) : $count")
    println("")

    println("---DO WHILE LOOP")

    // do while
    var index = 10

    do {
        println("Index : $index")
    }while(index > 20)

    println("")

    println("---FOR LOOP")

    // for loop (range)
    println("with range")
    for (i in 1..10) {
        println(i)
    }

    // for loop (range with step)
    println("range with step")
    for (i in 1..10 step 2){
        println(i)
    }

    // for loop (range with until)
    println("range with until")
    for (i in 1 until 10){
        println(i)
    }

    // for loop (range with downTo)
    println("range with downTo")
    for (i in 10 downTo  1){
        println(i)
    }
}