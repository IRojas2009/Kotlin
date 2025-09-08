package `25_POO_Modificadores_private_y_public`

class Dado{
    private var valor: Int = 1

    fun tirar(){
        valor = ((Math.random() * 6) + 1).toInt()
    }

    fun imprimir(){
        separador()
        println("Valor del dado: $valor")
        separador()
    }

    private fun separador() = println("*************************************************************")
}

fun main(){
    val dado1 = Dado().also {
        it.tirar()
        it.imprimir()
    }
}