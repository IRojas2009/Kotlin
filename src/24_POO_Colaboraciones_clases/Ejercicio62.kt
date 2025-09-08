package `24_POO_Colaboraciones_clases`

import kotlin.random.Random

class Dado(var valor: Int) {

    fun tirar(){
        this.valor = Random.nextInt(1,7).toInt()
        imprimir()
    }

    fun imprimir(){
        println("Valor del dado: $valor")
    }
}

class JuegoDeDados() {
    val dado1 = Dado(1)
    val dado2 = Dado(1)
    val dado3 = Dado(1)

    fun jugar(){
        dado1.tirar()
        dado2.tirar()
        dado3.tirar()
        if (dado1.valor == dado2.valor && dado1.valor == dado3.valor){
            println("Gano")
        }else{
            println("Perdio")
        }
    }
}

fun main(){
    val juego1: JuegoDeDados
}