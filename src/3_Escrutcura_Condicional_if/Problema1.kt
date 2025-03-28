package `3_Escrutcura_Condicional_if`

/*
Se ingresan tres notas de un alumno, si el promedio
 es mayor o igual a siete mostrar un mensaje "Promocionado"
 */

fun main(){

    print("Digite la primera nota, para calcular el promedio")
    val nota1 = readln().toDouble()
    print("Digite la segunda nota")
    val nota2 = readln().toDouble()
    print("Digite la tercera nota")
    val nota3 = readln().toDouble()

    val prom = nota1 + nota2 + nota3

    if (prom > 7)
        print("Promocionado")

}