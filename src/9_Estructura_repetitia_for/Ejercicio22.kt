package `9_Estructura_repetitia_for`

import kotlin.concurrent.fixedRateTimer

fun main(){
    var suma = 0
    for (i in 1..10) {
        print("Ingrese un valor: ")
        val valor = readln().toInt()
        suma+= valor
    }
    println("La suma de los valores ingresados es $suma.")
    val promedio = suma / 10
    println("Su promedio es igual a $promedio.")
}