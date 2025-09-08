package `23_POO_Metodos`

/*
Desarrollar una clase Numeros que contenga una lista de 6 números enteros.
Crear un méto-do leerNumeros() que permita ingresar los números por teclado.


Desde ese méto-do, llamar a:

contarPositivos() → muestra cuántos números son positivos.

contarNegativos() → muestra cuántos son negativos.

 */

class Numeros {
    val lista = mutableListOf<Int>(6)

    fun leerNumeros() {
        println("Ingrese 6 números enteros:")
        while (lista.size <= 6) {
            print("Número ${lista.size + 1}: ")
            val input = readLine()?.toIntOrNull()
        }

        contarPositivos()
        contarNegativos()
    }

    fun contarPositivos() {
        val positivos = lista.count { it > 0 }
        println("Números positivos: $positivos")
    }

    fun contarNegativos() {
        val negativos = lista.count { it < 0 }
        println("Números negativos: $negativos")
    }
}
fun main() {
    val numeros1 = Numeros()
    numeros1.leerNumeros()
}