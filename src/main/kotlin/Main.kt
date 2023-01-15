val likes = 121
val lastFigure = likes%10
val lastTwoFigure = likes%100

fun main() {

    if (lastFigure == 1 && lastTwoFigure != 11) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}