package `26_POO_Metodos__set_y_get`

class Persona {
    var nombre: String = ""
        set(valor){
            field= valor.uppercase()
        }
        get(){
            return "("+ field +")"
        }

    var edad: Int = 0
        set(valor) {
            if (valor >= 0)
                field = valor
            else
                field = 0
        }
        get(){
            return field
        }
}

fun main(){
    val persona1 = Persona()
    persona1.nombre = "Juan"
    persona1.edad = 23
    println(persona1.nombre)
    println(persona1.edad)
    persona1.edad = -50
    println(persona1.edad)
}