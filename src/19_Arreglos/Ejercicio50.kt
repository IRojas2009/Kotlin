package `19_Arreglos`

fun main() {
    val arreglo = IntArray(10)
    for (i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
    for (elemento in arreglo) {
        println(elemento)
        //*************************************************
        //Iterando con metodo withindex
        for ((indice, elemento) in arreglo.withIndex())
            println(
                "En el indice $indice se almacena" +
                        " el elemento $elemento" +
                        ""
            )
    }
    //***************************************************************
    //Clase generica Array
    val sueldos = arrayOf<Double>(1200.0, 1700.50, 6000.0)
    for (i in sueldos.indices){
        print("${sueldos[i]}")
    }
    //***************************************************************
    //funcion arrayOfNulls
    val alturas = arrayOfNulls<Float>(3)
    alturas[0] = 1.72f
    alturas[1] = 1.79f
    alturas[2] = 1.67f
    for (indice in 0..alturas.size - 1){
        print("${alturas[indice]}")
    }
}