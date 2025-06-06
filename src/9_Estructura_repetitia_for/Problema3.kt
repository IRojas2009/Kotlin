package `9_Estructura_repetitia_for`
/*
Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5 al 50)

 */
fun main(){
val num = 5
    var i = 0
    for (i in 1..10) {
var res = i * num
        println("$num * $i = $res")
    }
}