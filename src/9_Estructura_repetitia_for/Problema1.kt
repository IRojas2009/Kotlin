package `9_Estructura_repetitia_for`
/*
Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de
la base y la altura de un triángulo. El programa deberá informar:

a) De cada triángulo la medida de su base, sualtura y su superficie (la superficie se calcula
multiplicando la base por la altura y dividiendopor dos).
b) La cantidad de triángulos cuya superficie esmayor a 12.
*/

fun main() {
    var base = 0
    var alt = 0
    var supe = 0
    var trimay = 0
    print("Cuantos triangulos desea calcular su superficie: ")
    var tri = readln().toInt()

    for (i in 1..tri) {
                print("Digite la base: ")
        var base = readln().toInt()
        print("Digite la altura: ")
        var alt = readln().toInt()
        var supe = (base * alt) / 2
        println("La base de su triangulo numero $i es $base.")
        println("La altura de este es $alt.")
        println("Finalmente, la superficie es $supe")
        println("")
        if (supe > 12)
            trimay++
    }
        print("Numero de triangulos con superficie mayor a 12: $trimay")
}