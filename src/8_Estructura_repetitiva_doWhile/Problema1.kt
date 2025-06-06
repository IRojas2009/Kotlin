package `8_Estructura_repetitiva_doWhile`

class Problema1 {
}
/*
    Realizar un programa que acumule (sume) valores ingresados por
    teclado hasta ingresar el 9999 (no sumar dicho valor, indica
    que ha finalizado la carga). Imprimir el valor acumulado e
    informar si dicho valor es cero, mayor a cero o menor a cero.
     */
fun main(){
    var suma = 0
    do {
        print("Ingrese un valor numerico: ")
        val numing = readln().toInt()
        var suma = suma + numing
    }while (numing != 9999)
    if (suma < 0)
        print("La suma total de los numeros digitados es $suma, la cual es menor que cero")
    else
        if (suma == 0)
            print("La suma total de los numeros digitados es $suma, la cual es igual a cero")
    else
            if (suma > 0)
                print("La suma total de los numeros digitados es $suma, la cual es mayor que cero")

}