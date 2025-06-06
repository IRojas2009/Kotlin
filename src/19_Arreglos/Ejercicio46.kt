package `19_Arreglos`

fun main() {
    val sueldos: IntArray //Arreglo o lista de tipo Int (Entero)
    //Se define 5 espacios del 0 al 4
    sueldos = IntArray(5)

    //Carga de sus elementos por teclado
    for (i in 0..4) {
        print("Ingrese sueldo: ")
        sueldos[i] = readln().toInt()
    }

//Impresion de sus elementos
    for (i in 0..4) {
        println("$"+sueldos[i])
    }
}