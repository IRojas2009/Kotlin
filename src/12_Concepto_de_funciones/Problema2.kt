package `12_Concepto_de_funciones`
/*
Desarrollar una función que solicite
la carga de tres valores y muestre
el menor. Desde la función main del
programa llamar 2 veces a dicha
función (sin utilizar una estructura
repetitiva)
 */

fun cargavalores(){
    print("Ingrese el primer valor: ")
    val v1 = readln().toInt()
    print("Ingrese el segundo valor: ")
    val v2 = readln().toInt()
    print("Ingrese el tercer valor: ")
    val v3 = readln().toInt()
    when {
        v1 < v2 && v1 < v3 -> println("El menor es $v1")
        v2 < v1 && v1 < v3 -> println("El menor es $v2")
        v3 < v2 && v3 < v1 -> println("El menor es $v3")
    }
}

fun main(){
    cargavalores()
    cargavalores()
}