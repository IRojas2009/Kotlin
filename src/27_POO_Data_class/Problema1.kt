package `27_POO_Data_class`

import kotlin.random.Random

/*Un pequeño cine quiere llevar el registro de las butacas que ya fueron vendidas para cada función.
Cada butaca solo necesita guardar su número (1…N) y si está ocupada (true/false)
Tarea para los estudiantes
Declarar un data class llamado Butaca con dos propiedades:
numero: Int
ocupada: Boolean
En main() construir una lista con 5 butacas (números 1..5) inicialmente libres (ocupada = false).
Simular la venta de 2 butacas: elegir al azar dos números distintos y marcarlas como ocupadas (ocupada = true).
Pista: usar random y un simple bucle para buscar el número.
Imprimir la lista completa de butacas usando println() y observar cómo se ve la salida por defecto del data class.
Volver a imprimir, pero ahora recorriendo la lista con un for y desestructurando las propiedades (número, ocupada) para mostrar un mensaje amigable:
“Butaca 3 → libre” o “Butaca 3 → ocupada”.
Hacer una copia de la lista antes de vender y comparar ambas listas con == para verificar que son distintas referencias.
Sobreescribir toString() para que devuelva “Butaca #X” seguido de “(libre)” o “(ocupada)”.
*/

data class Butaca (var numero: Int, var ocupada: Boolean)

fun main(){
    val butaca1 = Butaca(1, false)
    val butaca2 = Butaca(2, false)
    val butaca3 = Butaca(3, false)
    val butaca4 = Butaca(4, false)
    val butaca5 = Butaca(5, false)


    for (i in 1..2){
        var azarnumero: Int = Random.nextInt(1,5).toInt()
        when (azarnumero){
            1 ->
                if (butaca1.ocupada == false){
                butaca1.ocupada = true
                    println("Se ocupo la butaca ${butaca1.numero}")
            }
            2 ->
                if (butaca1.ocupada == false){
                    butaca1.ocupada = true
                    println("Se ocupo la butaca ${butaca2.numero}")
                }
            3 ->
                if (butaca1.ocupada == false){
                    butaca1.ocupada = true
                    println("Se ocupo la butaca ${butaca3.numero}")
                }
            4 ->
                if (butaca1.ocupada == false){
                    butaca1.ocupada = true
                    println("Se ocupo la butaca ${butaca4.numero}")
                }
            5 ->
                if (butaca1.ocupada == false){
                    butaca1.ocupada = true
                    println("Se ocupo la butaca ${butaca5.numero}")
                }
        }
    }
    println("Butaca 1 Ocupada?:${butaca1.ocupada}")
    println("Butaca 2 Ocupada?:${butaca2.ocupada}")
    println("Butaca 3 Ocupada?:${butaca3.ocupada}")
    println("Butaca 4 Ocupada?:${butaca4.ocupada}")
    println("Butaca 5 Ocupada?:${butaca5.ocupada}")

}