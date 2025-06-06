package `14_Funciones_con_retorno`

/*
Elaborar una función que reciba tres enteros y
nos retorne el valor promedio de los mismos.
 */

fun promedio(v1: String, v2: String, v3: String,): String {
    val promedio: String = (v1 + v2 + v3)
    return promedio
}

    fun main () {
        print("Ingrese un valor: ")
        val va1 = readln()
        print("Ingrese otro valor: ")
        val va2 = readln()
        print("Ingrese un valor mas: ")
        val va3 = readln()
        val prom = promedio(
            va1,
            va2,
            va3
        )
    }