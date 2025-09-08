package `20_Funciones_tipo_arreglo`

fun cargar(arreglo: IntArray){
    for (i in arreglo.indices){
        print("Ingrese elemento: ")
        arreglo[i] = readln().toInt()
    }
}

fun imprimir2(arreglo: IntArray){
    for (elemento in arreglo){
        print(elemento)
    }
}

fun main(){
    val arre = IntArray (5)
    cargar(arre)
    imprimir2(arre)
}