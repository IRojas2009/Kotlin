package `4_Estructura_condicional_como_expresion`

/*
Solicita al usuario que ingrese tres valores enteros positivos que representan
 los lados de un triángulo. Valida primero que puedan formar un triángulo (la
 suma de dos lados debe ser mayor al tercero).
Si es válido, guarda en una variable el tipo de triángulo usando una expresión if:
"Equilátero" si los tres lados son iguales.
"Isósceles" si dos lados son iguales.
"Escaleno" si todos los lados son distintos.
 Imprime el tipo de triángulo o un mensaje de error si no forman uno válido.

 */
fun main () {
    print("Ingrese un lado de un triangulo : ")
    val lado1 = readln().toInt()
    print("Ingrese otro lado de un triangulo : ")
    val lado2 = readln().toInt()
    print("Ingrese el ultimo lado de un triangulo (Base) : ")
    val lado3 = readln().toInt()

    val suma12: Int = (lado1 + lado2)

    var tipotrian: String

    if (lado1 + lado2 <= lado3) {
        print("Los datos fueron mal ingresados, recuerde que debe ingresar valores numerales positivos sin decimales")
    } else {
        (if (lado1 == lado3) {
            if (lado2 == lado3) {
                val tipotrian = "Equilatero"
            } else {
                val tipotrian = "Isoceles"
            }
        } else {
            if (lado1 != lado3) {
                if (lado2 != lado3) {
                    val tipotrian = "Escaleno"
                } else {
                    val tipotrian = "Isoceles"
                }
            } else {
                val tipotrian = "Isoceles"
            }
        })
    }
    
}