package `22_POO_Constructor`

/*
Problema 3
Desarrollar una clase Rectangulo con propiedades base y altura (ambas de tipo Int).
Crear el constructor principal con estas propiedades y un bloque init que valide que ningún valor sea menor o igual a 0, y si lo es, se le asigna 1 por defecto.
Agregar los métodos:
area(): que calcule y retorne el área.

esCuadrado(): que retorna un mensaje indicando si es un cuadrado (base y altura iguales) o un rectángulo común.

Objetivo didáctico: Reforzar el uso del constructor principal junto al bloque init y lógica condicional en métodos.

 */
//******************************************************************
class Rectangulo {
    var base: Int = 0
    var altura: Int = 0

    constructor() {
        print("Ingrese la base: ")
        base = readln().toInt()
        print("Ingrese la altura: ")
        altura = readln().toInt()
        if (base == altura){
            val esCuadrado : Boolean= true
        }
    }

    init {
        if (base < 0)
            base = 1
    }

    init {
        if (altura < 0)
            altura = 1
    }

    fun area() {
        var area = (base * altura)
    }

    fun esCuadrado(): Boolean {
        if (base == altura) {
            val esCuadrado: Boolean = true
        } else {
            val esCuadrado : Boolean = false        }
        return esCuadrado()
    }

    fun mostrarCuadrado() {
        if (esCuadrado() == true) {
            println("Es cuadrado, ya que base y altura son $base")
        } else {
            println("Es rectangular, ya que base y altura son diferentes")
        }
    }
}

fun main(){
    val rec1 = Rectangulo()
    rec1.area()
    val esCuadrado = rec1.esCuadrado()
    rec1.mostrarCuadrado()
}
