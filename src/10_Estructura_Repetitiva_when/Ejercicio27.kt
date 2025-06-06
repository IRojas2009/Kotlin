package `10_Estructura_Repetitiva_when`

fun main(){
    print("Ingrese primer nota: ")
    val n1 = readln().toInt()
    print("Ingrese segunda nota: ")
    val n2 = readln().toInt()
    print("Ingrese tercer nota: ")
    val n3 = readln().toInt()
    val pro = (n1 + n2 + n3)/3
    when{
        pro >= 7 -> println("Aprobado")
        pro >= 4 -> println("Regular")
        else -> println("Reprobado")
    }

}