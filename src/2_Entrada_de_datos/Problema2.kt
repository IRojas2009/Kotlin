package `2_Entrada_de_datos`

fun main() {

    print("Ingrese el primer valor numerico a almacenar")
    val vanumuno: Int = readln().toInt()
    print("Ingrese el segundo valor numerico a almacenar")
    val vanumdos: Int = readln().toInt()
    print("Ingrese el tercer valor numerico a almacenar")
    val vanumtre: Int = readln().toInt()
    print("Ingrese el cuarto valor numerico a almacenar")
    val vanumcua: Int = readln().toInt()

    val promedio: Int = (vanumuno + vanumdos + vanumtre + vanumcua) / 4
    val suma: Int = vanumuno + vanumdos + vanumtre + vanumcua

    println("El valor de la suma de todos los valores es $suma")
    println("El valor del promedio de todos los valores es $promedio")

}