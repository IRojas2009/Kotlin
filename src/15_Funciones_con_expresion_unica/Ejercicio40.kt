package `15_Funciones_con_expresion_unica`

fun retornarSuperficie(lado: Int): Int = lado * lado

fun main(){
    print("Ingrese el valor de uno de los lados del cuadrado: ")
    val lado = readln().toInt()
    print("La superficie del cuadrado es ${retornarSuperficie(lado)}")
}