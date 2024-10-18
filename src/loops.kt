fun main() {
    // while loop
    var count = 0

    while(count < 5) {
        println("Count : $count")
        count++
    }

    println("Count (outside loop) : $count")

    println("---")

    // do while
    var index = 10

    do {
        println("Index : $index")
    }while(index > 20)
}