package `12_Concepto_de_funciones`

/*
Desarrollar un programa con dos funciones.
La primera solicite el ingreso de un entero
y muestre el cuadrado de dicho valor. La
segunda que solicite la carga de dos valores
y muestre el producto de los mismos. Llamar
desde la main a ambas funciones.
 */

fun cuadrado () {
    print("Ingrese un valor numerico entero: ")
    val num = readln().toInt()
    val cuad = num * num
    println("El cuadrado de $num es $cuad")
}
//*******************************************************************
fun sepa() {
    println("***************************************************")
}
//*******************************************************************
fun prod(){
    print("Digite su primer valor")
    val num1 = readln().toInt()
    print("Digite su segundo valor")
    val num2 = readln().toInt()
    val prod = num1 * num2
    println("El valor del producto de $num1 y $num2 es $prod")
}

fun main(){
    cuadrado()
    sepa()
    prod()
}