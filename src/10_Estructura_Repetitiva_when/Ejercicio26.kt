package `10_Estructura_Repetitiva_when`

fun main(){
    print("Ingrese cordenada x del punto: ")
    val x = readln().toInt()
    print("Ingrese coordenada y del punto: ")
    val y = readln().toInt()
    when {
        x > 0 && y > 0 -> println("Primer cuadrante")
        x < 0 && y > 0 -> println("Segundo cuadrante")
        x < 0 && y < 0 -> println("Tercer cuadrante")
        x > 0 && y < 0 -> println("Cuarto cuadrante")
        else -> println("El punto se encuentra en un eje")
    }
}