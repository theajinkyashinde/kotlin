package kotlin_oop_concepts.a_class_and_objects.a_4_object

// Singleton Pattern: Following SharingWidget is created only once,
// and it used everywhere without creating another instance of it.
object SharingWidget {
    private var twitterLikes: Int = 0
    private var fbLikes: Int = 0

    fun incrementTwitterLikes() = twitterLikes++
    fun incrementFbLikes() = fbLikes++
    fun displayLikes() = println("FB Likes : $fbLikes | Twitter Likes : $twitterLikes")
}

fun main() {
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()

    SharingWidget.incrementFbLikes()
    SharingWidget.incrementFbLikes()

    SharingWidget.displayLikes()
}