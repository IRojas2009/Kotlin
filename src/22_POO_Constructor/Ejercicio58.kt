package `22_POO_Constructor`

class Triangulo (var lado1: Int, var lado2: Int, var lado3: Int){


    fun ladoMayor() {
        print("Lado mayor: ")
        when {
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }

    fun esEquilatero(){
        if (lado1 == lado2 && lado1 == lado3)
            print("Es un triangulo equilatero")
        else
            println("No es un triangulo equitalero")
    }
}


fun main(){
    val triangulo1 = Triangulo(12,45,24)
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()
}