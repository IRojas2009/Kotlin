package `14_Funciones_con_retorno`

fun retornarMayor(v1: Int, v2: Int): Int{
    if (v1 > v2)
        return v1
    else
        return v2
}

fun main(){
    print("Ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor: ")
    val valor2 = readln().toInt()
    val mayor = retornarMayor(valor1, valor2)
    println("El mayor entre $valor1 y $valor2 es ${retornarMayor(valor1, valor2)}")
}