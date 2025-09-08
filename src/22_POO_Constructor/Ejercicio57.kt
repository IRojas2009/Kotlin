package `22_POO_Constructor`

class Persona3 (var nombre: String, var edad: Int){

    init {
        if (edad < 0)
            edad = 0
    }

    fun imprimir(){
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    fun esMayorEdad(){
        if (edad >= 18)
            println("$nombre es mayor de edad")
        else
            println("$nombre es menor de edad")
    }
}


fun main(){
    val persona1 = Persona3 ("Juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()
}