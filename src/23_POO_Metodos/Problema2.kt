package `23_POO_Metodos`

/*
Diseñar una clase Temperaturas que contenga un arreglo con las temperaturas registradas durante 7 días.
Implementar un métod-o cargarDatos() que permita ingresar las 7 temperaturas desde teclado.

Desde ese mét-odo, llamar a:

mostrarMaxima() → imprime la temperatura más alta.

mostrarMinima() → imprime la más baja.
 */

class Temperaturas {
    val temperaturas = DoubleArray(7)

    fun cargarDatos() {
        println("Ingrese las temperaturas registradas durante 7 días:")
        for (i in temperaturas.indices) {
            print("Día ${i + 1}: ")
            val input = readLine()?.toDoubleOrNull()

        }

        mostrarMaxima()
        mostrarMinima()
    }

    fun mostrarMaxima() {
        val max = temperaturas.maxOrNull()
        println("Temperatura máxima registrada: ${max}°C")
    }

    fun mostrarMinima() {
        val min = temperaturas.minOrNull()
        println("Temperatura mínima registrada: ${min}°C")
    }
}

fun main() {
    val t1 = Temperaturas()
    t1.cargarDatos()
}
