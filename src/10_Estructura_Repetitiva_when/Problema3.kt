package `10_Estructura_Repetitiva_when`

/*
Realizar un programa que lea los lados de n triángulos, e informar:
a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres
lados iguales), isósceles (dos lados iguales), o escaleno (ningún lado igual)
b) Cantidad de triángulos de cada tipo.

 */

fun main () {
    print("Triangulos que quiere calcular:")
    val limite = readln().toInt()
    var esca = 0
    var isoc = 0
    var equi = 0
    for (i in 1..limite) {
        print("Digite su primer lado: ")
        var prila = readln().toInt()
        print("Digite su segundo lado: ")
        var segla = readln().toInt()
        print("Digite su tercer lado: ")
        var terla = readln().toInt()
        when {
            prila != segla && segla != terla -> esca += 1
            prila != segla && segla == terla -> isoc += 1
            prila == segla && segla != terla -> isoc += 1
            prila == segla && segla == terla -> equi += 1
            else -> {
                print("Watafak bro")
            }
        }
    }
    println("Cantidad de triangulos Escalenos: $esca")
    println("Cantidad de triangulos Isoceles: $isoc")
    println("Cantidad de triangulos Equilateros: $equi")
}