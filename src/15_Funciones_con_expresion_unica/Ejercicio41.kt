package `15_Funciones_con_expresion_unica`

fun retornarmayor(v1: Int, v2: Int): Int = if (v1 > v2) v1 else v2

fun main(){
    print("Ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor: ")
    val valor2 = readln().toInt()
    print("El mayor entre $valor1 y $valor2 es" +
            "${retornarmayor(valor1, valor2)}")
}