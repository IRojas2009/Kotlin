package `9_Estructura_repetitia_for`

fun main(){
    var cant = 0
    print("Cuantos valores ingresara para finalizar: ")
    val cantidad = readln().toInt()
    for (i in 1..cantidad) {
        print("Ingrese valor: ")
        val valor = readln().toInt()
        if (valor % 2 == 0)
            cant++
    }
    println("Cantidad de pares: $cant.")
}