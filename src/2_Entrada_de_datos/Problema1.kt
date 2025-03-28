package `2_Entrada_de_datos`

fun main() {

    print("Digite el valor de la primer variable: ")
    val varuno: Int = readln().toInt()
    print("Digite el valor de la segunda variable: ")
    val vardos: Int = readln().toInt()
    print("Digite el valor de la tercera variable: ")
    val vartre: Int = readln().toInt()
    print("Digite el valor de la cuarta variable: ")
    val varcua: Int = readln().toInt()

    val suma : Int = varuno + vardos
    val produ: Int = vartre * varcua

    println("El valor de la suma de $varuno y $vardos es $suma .")
    println("El valor de la multiplicacion de $vartre y $varcua es $produ .")

}