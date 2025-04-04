package `5_Estructuras_condicionales_anidadas`

/*
Confeccionar un programa que permita cargar un número
entero positivo de hasta tres cifras y muestre un mensaje
indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje
de error si el número de cifras es mayor.
 */

fun main() {

    print("Ingrese un numero de 3 cifras o menos: ")
    val num = readln().toInt()

    val desnum = if (num <= 9) "tiene 1 cifra"
    else if (num <= 99) "tiene 2 cifras"
    else if ( num <= 999) "tiene 3 cifras" else "tiene ms de 3 cifras (ERROR)"

    print("Su numero $desnum.")

}