package `22_POO_Constructor`

class Triangulo2 (var lado1: Int, var lado2: Int, var lado3: Int){

constructor() : this(0,0,0){
    print("Ingrese lado 1: ")
    lado1 = readln().toInt()
    print("Ingrese lado 2: ")
    lado2 = readln().toInt()
    print("Ingrese lado 3: ")
    lado3 = readln().toInt()
}

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
    val triangulo1 = Triangulo2()
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()

    val triangulo2 = Triangulo2(6,6,6)
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()
}