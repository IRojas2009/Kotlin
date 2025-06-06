package `10_Estructura_Repetitiva_when`

fun main() {
    var can1 = 0
    var can2 = 0
    var can3 = 0
    do {
        print("Ingrese el peso de la pieza (0 para finalizar): ")
        val peso = readln().toDouble()
        when {
            peso > 10.2 -> can1++
            peso >= 9.8 -> can2++
            peso > 0 -> can3++
        }
    } while (peso != 0.0)
    println("Piezas aptas: $can2")
    println("Piezas con peso superior a 10.2: $can1")
    println("Piezas con un peso menor a 9.8: $can3")
}