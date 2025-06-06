@file:Suppress("UNREACHABLE_CODE")

package `13_Funciones_Parametros`

/*
Confeccionar una función que reciba tres enteros y
los muestre ordenados de menor a mayor. En la función
main solicitar la carga de 3 enteros por teclado y
proceder a llamar a la función ordenadrMayorMenor.
El algoritmo evalúa distintas combinaciones mediante
estructuras condicionales when y if/else, comparando
los valores entre sí. Se trata de un ejemplo práctico
para reforzar:
La entrada de datos desde consola.

Conversión de String a Int usando .toInt().

El uso combinado de when y if para resolver condiciones
múltiples.

La impresión ordenada de los resultados.

 */

fun ordenarMayorMenor(v1: Int,v2: Int,v3: Int) {
    when {
        v1 <= v2 -> {
            if (v2 <= v3) {
                println("$v3")
                println("$v2")
                println("$v1")
            } else {
                println("$v2")
                println("$v3")
                println("$v1")
            }
        }

                                                         v1 >= v2 -> {
            if (v2 >= v3) {
                println("$v1")
                println("$v2")
                println("$v3")
            } else {
                println("$v1")
                println("$v3")
                println("$v2")
            }
        }


    }
}

fun main() {
    print("Ingrese el primer valor: ")
    val v1: Int = readln().toInt()
    print("Ingrese el segundo valor: ")
    val v2: Int = readln().toInt()
    print("Ingrese el tercer valor: ")
    val v3: Int = readln().toInt()
    ordenarMayorMenor(v1, v2, v3)
}