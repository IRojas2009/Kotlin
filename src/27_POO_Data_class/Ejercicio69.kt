package `27_POO_Data_class`

data class Circulo(val x: Int, val y: Int, val radio: Int)

fun main(){
    val circulo1 = Circulo(10,3,40)
    val (centrox, centroy) = circulo1
    println("Punto central del circulo ($centrox, $centroy)")
}