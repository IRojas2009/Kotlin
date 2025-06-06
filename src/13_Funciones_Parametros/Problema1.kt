package `13_Funciones_Parametros`

/*
Desarrolla un programa en Kotlin que le pide al
usuario ingresar una clave dos veces. El programa
debe verificar si ambas entradas son iguales y
mostrar un mensaje en consecuencia.

El programa consta de dos partes principales:
Una función llamada verificarClaves que recibe
dos textos (las claves) y verifica si son iguales.


Una función principal main que pide al usuario
que ingrese dos veces una clave y luego llama
a verificarClaves para comprobar si ambas coinciden.
 */

fun verificarClaves (c1: String, c2: String) {
    val difoigu: String = if (c1 == c2) "Iguales" else "Diferentes"
}


fun main(){
    print("Ingrese una clave: ")
    val c1ave = readln().toString()
    print("Ingrese otra vez la clave")
    val c2ave = readln().toString()
    println("****************************************")
    verificarClaves(c1ave, c2ave)
    println("****************************************")
    print("Gracias por usar este programa ;)")
}