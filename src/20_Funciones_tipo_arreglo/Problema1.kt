package `20_Funciones_tipo_arreglo`

/*
Desarrollar un programa que permita ingresar un arreglo de n elementos, ingresar n por teclado.
Elaborar dos funciones una donde se lo cree y cargue al arreglo y otra que sume todos sus elementos
y retorne dicho valor a la main donde se lo imprima.

 */

fun crearCargar() : IntArray{
    print("Cuantos elementos quiere cargar?: ")
    val cantidad = readln().toInt()
    val elementos = IntArray(cantidad)
    for (i in elementos.indices){
        print("Ingrese elemento: ")
        elementos[i] = readln().toInt()
    }
    return elementos
}

fun suma(elementos : IntArray) : Int {
    var sumaelementos = 0
    for (elementos in elementos.indices){
        var sumaelementos = sumaelementos + elementos
        println(sumaelementos)
    }
    return sumaelementos
}

fun main(){
    val elementos = crearCargar()
    val sumaelementos = suma(elementos)

    println("El valor de la suma de todos los elementos es $sumaelementos.")
}