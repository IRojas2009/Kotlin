package `9_Estructura_repetitia_for`

fun main(){
    var apr = 0
    var rep = 0
    for (i in 1..10) {
        print("Ingrese nota: ")
        val nota = readln().toInt()
        if (nota >= 7)
            apr++
        else
            rep++
    }
    println("Cantidad de alumnos con notas mayores o iguales a 7: $apr.")
    println("Cantidad de alumnos con notas menores a 7: $rep.")
}