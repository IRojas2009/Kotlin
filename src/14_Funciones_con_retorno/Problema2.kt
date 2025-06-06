package `14_Funciones_con_retorno`

/*
Confeccionar una función que calcule la superficie
de un rectángulo y la retorna, la función recibe
como parámetros los valores de dos de sus lados:
	fun retornarSuperficie(lado1: Int,lado2: Int): Int
 */
fun retornarSuperficie(lado1: Int,lado2: Int): Int{
    val superf = (lado1 * lado2)
    val superfi = return superf
}

fun main(){
    print("Ingrese un lado: ")
    val lado1 = readln().toInt()
    print("Ingrese otro lado: ")
    val lado2 = readln().toInt()

    val superfi = retornarSuperficie(lado1, lado2)
    println("La superficie es de $superfi")
}