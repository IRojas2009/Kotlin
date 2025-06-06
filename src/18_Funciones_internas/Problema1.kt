package `18_Funciones_internas`

import java.lang.Error

/*Confeccionar una función que permita cargar
dos enteros y nos muestre el mayor de ellos.
Realizar esta actividad con 5 pares de valores.
Implementar una función interna que retorne el
mayor de dos enteros.
*/

fun decidir() {
    var v1 = 0
    var v2 = 0
    fun pedirdatos() {
        print("Digite el valor numero uno: ")
        val v1 = readln().toInt()
        print("Digite el valor numero dos: ")
        val v2 = readln().toInt()
    }
    val numayor: Any = when {
        v1 > v2 -> v1
        v1 == v2 -> v2
        v1 < v2 -> v2
        else -> "Error"
    }
}
fun main(){
    decidir()
}