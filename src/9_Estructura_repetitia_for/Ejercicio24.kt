package `9_Estructura_repetitia_for`

fun main () {
    var i = 0
    var mul3 = 0
    var mul5 = 0
    var mul9 = 0

    for (i in 1..10000) {
        if (i % 3 == 0)
            mul3++

        if (i % 5 == 0)
            mul5++

        if (i % 9 == 0)
            mul9++

    }
    println("Cantidad de multiplos del 3: $mul3")
    println("Cantidad de multiplos del 5: $mul5")
    println("Cantidad de multiplos del 9: $mul9")
}