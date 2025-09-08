package `22_POO_Constructor`

/*
Problema 2
Diseñar una clase llamada Libro que reciba en el constructor principal el título, el autor y la cantidad de páginas.
Implementar un segundo constructor (secundario) que permita ingresar estos datos desde teclado (readln()).
Agregar un mét odo leer(paginasLeidas: Int) que indique cuántas páginas quedan por leer.
Agregar un mét odo infoLibro() que muestre toda la información del libro.

 */

class Libro constructor(var titulo: String = "",var autor: String = "",var pags: Int){
    constructor() : this("","",0){
        print("Ingrese el nombre de la obra: ")
        titulo = readln().toString()
        print("Ingrese el nombre del autor: ")
        autor = readln().toString()
        print("Ingrese el numero de paginas: ")
        pags = readln().toInt()
    }

    fun leer(pags: Int){
        print("Cuantas paginas has leido?: ")
        val paginasLeidas = readln().toInt()
        val paginas_que_faltan_por_leer = pags - paginasLeidas
        println("Te faltan $paginas_que_faltan_por_leer paginas para terminar el libro, buena suerte.")
    }

    fun infoLibro(){
        println("Titulo del libro: $titulo")
        println("Autor del libro: $autor")
        println("Paginas que contiene el libro: $pags")
    }
}

fun main(){
    val libro1 = Libro()
    libro1.leer(0)
    libro1.infoLibro()
}