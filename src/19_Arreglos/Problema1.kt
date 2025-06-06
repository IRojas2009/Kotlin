package `19_Arreglos`

/*
Desarrollar un programa que permita ingresar un
arreglo de 8 elementos enteros, e informe:
El valor acumulado de todos los elementos.
El valor acumulado de los elementos que sean
mayores a 36.
Cantidad de valores mayores a 50.
(Definir dos for, en el primero realizar la carga
y en el segundo proceder a analizar cada elemento)
 */

fun main() {
    val elementos = IntArray(8)
    var mn36 = 0
    var my36 = 0
    var my50 = 0
    for (i in elementos.indices) {
        print("Ingrese elemento: ")
        elementos[i] = readln().toInt()
    }
    for (i in elementos.indices) {
        when{
            elementos[i] >= 50 -> my50
            elementos[i] >= 36 -> my36
            elementos[i] < 36 -> mn36
        }
        }
    }