package `20_Funciones_tipo_arreglo`

/*
Cargar un arreglo de n elementos.
Imprimir el menor elemento y un
mensaje si se repite dentro del arreglo.
 */

fun cargarArreglo(): IntArray {
    print("Ingrese la cantidad de elementos del arreglo: ")
    val cantidad = readln().toInt()
    val arreglo = IntArray (cantidad)
    for (i in 0 .. cantidad) {
        print("Elemento ${i + 1}: ")
        arreglo[i] = readln().toInt()
    }
    return arreglo
}

fun menor(arreglo: IntArray) {
    val menor = arreglo.min()
    val repeticiones = arreglo.count { it == menor }

    println("El menor elemento es: $menor")
    if (repeticiones > 1) {
        println("El menor elemento se repite $repeticiones veces.")
    }
}

fun main() {
    val arreglo = cargarArreglo()
    menor(arreglo)
}