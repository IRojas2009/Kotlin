package `27_POO_Data_class`

data class Circulo2(val x: Int, val y: Int, val radio: Int)

fun main (){
    val circulo2=Circulo2(10,3,40)
    val centrox= circulo2.component1()
    val centroy = circulo2.component2()
    val radio = circulo2.component3()
    println("$centrox $centroy $radio")
}