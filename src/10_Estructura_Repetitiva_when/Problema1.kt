package `10_Estructura_Repetitiva_when`


/*
Se ingresa por teclado un valor entero, mostrar una leyenda por
pantalla que indique si el número es positivo, nulo o negativo.
 */
fun main(){
    print("Ingrese un valor entero: ")
    val num = readln().toInt()
    when {
        num > 0 -> println("Su numero es positivo")
        num == 0 -> println("Su numero es nulo (0)")
        num < 0 -> println("Su numero es negativo")
    }

}