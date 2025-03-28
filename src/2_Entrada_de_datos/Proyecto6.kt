package `2_Entrada_de_datos`

fun main() {

    print("Ingrese la medida del lado del cuadrado: ")
    val lado: Int = readln().toInt()

    val perimetro: Int = lado * 4

    println("El perímetro del cuadrado es $perimetro")

}