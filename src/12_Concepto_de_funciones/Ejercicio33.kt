package `12_Concepto_de_funciones`

fun Sumacarga(){
    print("Ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("Ingrese el primer valor: ")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de los dos valores es: $suma")
}
fun separacion(){
    println("*********************************************")
}
fun main(){
    for (i in 1..5) {
        Sumacarga()
        separacion()
    }
}