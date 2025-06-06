package `13_Funciones_Parametros`

fun mostrarmensaje(mensaje: String){
    println("***********************************************")
    println(mensaje)
    println("***********************************************")
}

fun cargarsumar(){
    print("Ingrese el primer valor: ")
    val v1 = readln().toInt()
    print("Ingrese el segundo valor: ")
    val v2 = readln().toInt()
    val s1y2 = v1 + v2
    println("El valor de la suma entre $v1 y $v2 es $s1y2")
}

fun main (){
    mostrarmensaje("Este programa rcopila dos valores numerales y los uma mostrandolo en pantalla.")
    cargarsumar()
    mostrarmensaje("(; Gracias por usar este programa ;)")
}