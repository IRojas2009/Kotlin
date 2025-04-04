package `4_Estructura_condicional_como_expresion`

/*
Problema 2: Clasificar edad
Enunciado:
Solicita al usuario que ingrese su edad. Almacena una descripción en una variable usando una expresión if:
Si es menor de 13, asigna "Niño".
Si está entre 13 y 17 inclusive, asigna "Adolescente".
Si es 18 o más, asigna "Adulto".

 */

fun main() {

    print("Ingrese una edad")
    val edad = readln().toInt()

    val desedad = if (edad < 13) {
        val desedad = "Niño"

    } else {
        if (edad < 17) {
            val desedad = "Adolecente"

        } else {
            if (edad < 17) {
                val desedad = "Adulto"

            } else {
                print("La edad que usted digito debe de ser un numero positivo")
            }
        }
    }

    print("La edad de la persona que usted digito indica que es un $desedad ")
}