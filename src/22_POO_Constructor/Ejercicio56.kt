package `22_POO_Constructor`

class Persona2 (var nombre: String, var edad: Int) {

    fun imprimir(){
        println("Nombre: $nombre, Edad: $edad ")
    }

    fun esMayorEdad(){
        if (edad >= 18)
            println("$nombre es mayor de edad")
        else
            println("$nombre es menor de edad")
    }
}


fun main(){
    val persona1 = Persona2 ("Juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()
}