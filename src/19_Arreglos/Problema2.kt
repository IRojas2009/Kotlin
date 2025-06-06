package `19_Arreglos`

/*
Realizar un programa que pida la carga de dos
arreglos numéricos enteros de 4 elementos.
Obtener la suma de los dos arreglos elemento
a elemento, dicho resultado guardarlo en un
tercer arreglo del mismo tamaño.
 */

fun main () {
    val arreglo1 = IntArray(4)
    for (i in arreglo1.indices) {
        print("Ingrese elemento del indice 1: ")
        arreglo1[i] = readln().toInt()
    }
    val arreglo2 = IntArray(4)
    for (i in arreglo2.indices) {
        print("Ingrese elemento del indice 2: ")
        arreglo2[i] = readln().toInt()
    }
    val arreglo3 = IntArray(4)
    for (i in arreglo3.indices) {
        var suma = arreglo1[i] + arreglo2[i]
        println("La suma de ${arreglo1[i]} y ${arreglo2[i]} es $suma")
    }
}