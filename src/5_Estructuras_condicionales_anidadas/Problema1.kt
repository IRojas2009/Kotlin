package `5_Estructuras_condicionales_anidadas`

/*
Se ingresa por teclado un valor entero,
 mostrar una leyenda que indique si el
 número es positivo, nulo(cero) o negativo.
 */

fun main() {

    print("Ingrese un numero: ")
    val num = readln().toInt()
    val desnum = if (num == 0) "cero"
    else if (num > 0) "positivo" else "negativo"

    print("Su numero es $desnum")

}