package `2_Entrada_de_datos`

fun main(argumento: Array<String>) {

    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()

    val suma = valor1 + valor2
    val producto = valor1 * valor2

    println("El valor de la suma de $valor1 y $valor2 es $suma")
    println("El valor de la multiplicación de $valor1 y $valor2 es $producto")

}
