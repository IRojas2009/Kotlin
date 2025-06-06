package `11_Estructura_condicional_when_argumento`

fun main () {
    print("Ingrese un valor entero entre 1 y 5: ")
    val valor = readln().toInt()
    when (valor) {
        1 -> print("uno")
        2 -> print("dos")
        3 -> print("tres")
        4 -> print("cuatro")
        5 -> print("cinco")
        else -> print("Valor fuera de rango")
    }

}