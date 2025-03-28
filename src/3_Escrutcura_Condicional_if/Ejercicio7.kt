package `3_Escrutcura_Condicional_if`

fun main() {

    print("Ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor: ")
    val valor2 = readln().toInt()

    if (valor1 < valor2){
        val suma = valor1 + valor2
        val resta = valor1 - valor2
        println("La suma de los dos valores es: $suma")
        println("La resta de los dos valores es: $resta")
    }   else {
        val pro = valor1 * valor2
        val div = valor1 / valor2
        println("El valor de la multiplicacion de los dos valores es $pro")
        println("El valor de la division de los dos valores es $div")
    }


}