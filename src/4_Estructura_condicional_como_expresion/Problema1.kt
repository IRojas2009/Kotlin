package `4_Estructura_condicional_como_expresion`

import kotlin.math.abs

/*
Problema 1: Determinar el número con mayor valor absoluto
Enunciado:
Solicita al usuario ingresar dos números enteros (pueden ser negativos).
Luego, determina cuál de los dos tiene mayor valor absoluto y muestra
ese número en pantalla.
 */

fun main() {

    print("Ingrese un numero: ")
    val num1 = readln().toDouble()
    print("Ingrese otro numero: ")
    val num2 = readln().toDouble()

    val valabs1 = Math.sqrt(num1 * num1)
    val valabs2 = Math.sqrt(num2 * num2)

    val valmay = if (valabs1 > valabs2) valabs1 else valabs2
    val valmen = if (valmay == valabs1) valabs2 else valabs1

    val valgra = if (valabs1 > valabs2) num1 else num2
    val valpeq = if (valgra == num1) num2 else num1

    print("El numero que tiene mayor valor absoluto entre $num1 y $num2 es $valgra , ya que tiene $valmay en comparacion de $valpeq que tiene $valmen ")


}