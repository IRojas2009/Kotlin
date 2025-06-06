package `13_Funciones_Parametros`

fun mostrarmayor(v1: Int, v2: Int, v3: Int) {
    print("Mayor: ")
    if (v1 > v2 && v1 > v3) {
        println(v1)
    }else {
        if (v2 > v3) {
            println(v2)
        } else {
            println(v3)
        }
    }
}

fun main (){
    print("Ingrese el primer valor: ")
    val v1 = readln().toInt()
    print("Ingrese el segundo valor: ")
    val v2 = readln().toInt()
    print("Ingrese el tercer valor: ")
    val v3 = readln().toInt()
    mostrarmayor(v1, v2, v3)
}