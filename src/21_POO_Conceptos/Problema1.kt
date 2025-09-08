package `21_POO_Conceptos`

/*
Implementar una clase llamada Alumno que tenga como propiedades
su nombre y su nota. Definir los métodos para inicializar sus
propiedades por teclado, imprimirlos y mostrar un mensaje si está
aprobado (nota mayor o igual a 7)
Definir dos objetos de la clase Alumno.

 */

class Alumno{
    var nombre: String = ""
    var nota: Int = 0

    fun inicializar(){
        print("Ingrese el nombre del estudiante: ")
        nombre = readln().toString()
        print("Ingrese la nota de $nombre: ")
        nota = readln().toInt()
    }

    fun imprimir(){
        println("Nombre: $nombre, Nota: $nota")
    }

    fun aprobado(){
        if (nota >= 7)
            print("$nombre ha aprobado")
        else
            println("$nombre ha reprobado")
    }
}

fun main(){
    val alumno1 = Alumno()
    alumno1.inicializar()
    alumno1.imprimir()
    alumno1.aprobado()

    val alumno2 = Alumno()
    alumno2.inicializar()
    alumno2.imprimir()
    alumno2.aprobado()
}