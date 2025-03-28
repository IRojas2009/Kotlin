package `3_Escrutcura_Condicional_if`

/*
Se ingresa por teclado un número entero comprendido entre 1 y 99,
 mostrar un mensaje indicando si el número tiene uno o dos dígitos.
(Tener en cuenta que condición debe cumplirse para tener dos dígitos
, un número entero)

 */

fun main() {

    print("Ingrese un número entre el 1 y el 99: ")
    val num = readln().toInt()

    if (num >= 10)
        print("El número que usted difitó es de 2 digitos")
    else
        print("El número que usted digitó es de 1 digito")

}