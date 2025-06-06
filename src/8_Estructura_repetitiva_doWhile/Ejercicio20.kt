package `8_Estructura_repetitiva_doWhile`

fun main(){

    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    do {
        print("Ingrese el peso de la pieza (Kilogramos)(0 para finalizar)")
        val peso = readln().toDouble()
        if (peso > 10.2)
            cant1++
        else
            if (peso >= 9.8)
                cant2++
        else
            if (peso < 9.8)
                cant3++

    } while (peso != 0.0)
    println("Piezas aptas: $cant2")
    println("Piezas pesadas: $cant1")
    println("Piezas livianas: $cant3")
    val suma = (cant1 + cant2 + cant3)
    println("Cantidad total de piezas: $suma")
}