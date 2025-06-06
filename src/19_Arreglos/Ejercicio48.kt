package `19_Arreglos`

fun main(){
    val arreglo = IntArray(10)
    for (i in 0..arreglo.size-1){
        print("Ingrese elemento: ")
        arreglo[i] = readln().toInt()
    }
    var ordenado: Boolean = true
    for (i in 0..arreglo.size-2) {
        val n1: Int = arreglo[i+1]
        val n2: Int = arreglo[i]
        if (n1 < n2)
            ordenado = false
    }
    if (ordenado)
        print("Los elementos estan ordenados de menor a mayor")
    else
        print("Los elementos no estan ordenados de menor a mayor")
}