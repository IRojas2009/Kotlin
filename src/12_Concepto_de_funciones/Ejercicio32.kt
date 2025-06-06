package `12_Concepto_de_funciones`

fun presentacion() {
    println("Programa que permite cargar dos valores por teclado.")
    println("Efectua la suma de dos valores.")
    println("Muestra el resultado de la suma.")
    println("****************************************************")
}
fun sumacarga(){
    print("Ingrese el primer valor: ")
    val valor1= readln().toInt()
    print("Ingrese el segundo valor: ")
    val valor2 = readln().toInt()
    val suma = valor2 + valor1
    println("La suma de los dos valores es $suma")
}
fun finalizacion(){
    println("****************************************************")
    print("Gracias por utilizar este programa.")
}
fun main (){
    presentacion()
    sumacarga()
    finalizacion()
}