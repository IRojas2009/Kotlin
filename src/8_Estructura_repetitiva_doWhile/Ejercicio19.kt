package `8_Estructura_repetitiva_doWhile`

fun main(){

    var cant = 0
    var suma = 0

    do {
        print("Ingrese un valor (0 para finalizar)")
        val valor: Int = readln().toInt()
        if (valor != 0) {
            suma += valor
            cant++
        }

    } while (valor != 0)
    if (cant != 0) {
        val prom = suma / cant
        print("El promedio de los valores ingresados es $prom")

    }

}