package `4_Estructura_condicional_como_expresion`

fun main() {
    
    print("Ingrese un valor entero: ")
    val valor = readln().toInt()
    val resultado = if (valor % 2 == 0) {
        print("Cuadrado: ")
        valor * valor
    } else {
        print("Cubo: ")
        valor * valor * valor
    }
    print(resultado)
}