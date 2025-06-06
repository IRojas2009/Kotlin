package `8_Estructura_repetitiva_doWhile`

/*
Desarrolla un programa en Kotlin que simule una calculadora básica.
 El programa debe mostrar un menú con las siguientes operaciones:

Sumar dos números
Restar dos números
Multiplicar dos números
Dividir dos números
Salir
El programa debe ejecutarse en un bucle do-while hasta que el usuario
seleccione la opción de salir. Después de realizar cada operación,
el resultado debe mostrarse en consola y luego el menú debe volver a
mostrarse. Si el usuario introduce una opción no válida, el programa
 debe indicarlo y volver a mostrar el menú.
Condiciones:

No utilices funciones (todo el código debe estar en main).
El programa debe controlar la división por cero.
Usa solo estructuras básicas (variables, condicionales, bucles, readln()).

 */

fun main(){
    do {
        println("Seleccione una de las siguientes funciones:")
        println("1 para suma, 2 para resta, 3 para multiplicacion, 4 para division y 0 para salir:")
        val sele = readln().toInt()
        println("Digite su primer numero a procesar")
        val pridig = readln().toInt()
        println("Digite su segundo numero a procesar")
        val segdig = readln().toInt()
            if (sele == 1) {
                val proceso = pridig + segdig
            } else {
                if (sele == 2) {
                    val proceso = pridig - segdig
                } else {
                    if (sele == 3) {
                        val proceso = pridig * segdig
                    } else {
                        if (sele == 4) {
                            if (pridig == 0) {
                                print("Su numero es 0, no se puede dividir entre 0")
                            } else {
                                if (segdig == 0) {
                                    print("Su numero es 0, no se puede dividir entre 0")
                                } else {
                                    val proceso = pridig / segdig
                                }
                            }
                        } else {

                        }
                    }
                }
            }
    }while (sele != 0)
    print("El resultado de su operacion es $ proceso")
}