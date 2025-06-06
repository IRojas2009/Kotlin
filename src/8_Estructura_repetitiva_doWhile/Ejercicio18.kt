package `8_Estructura_repetitiva_doWhile`

fun main(){

    do {
        print("Ingrese un valor comprendido entre 0 y 999: ")
        val valor: Int = readln().toInt()
        if(valor < 10)
            println("El valor ingresado tiene un digito")
        else
            if (valor < 100)
                println("El valor ingresado tiene dos dìgitos")
        else
            println("El valor ingresado tiene tres o màs digitos")
    } while (valor != 0)

}