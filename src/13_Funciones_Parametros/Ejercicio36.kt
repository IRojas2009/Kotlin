package `13_Funciones_Parametros`

fun perimetromostrar(lado: Int) {
    val perimetro = lado * 4
    println("El perimetro es $perimetro")
}

fun superficiemostrar(lado: Int) {
    val sup = lado * lado
    println("La superficie es $sup")
}

fun main(){
    print("Ingrese el valor del lado de un cuadrado: ")
    val lado = readln().toInt()
    print("Quiere calcular el perimetro o la superficie (Escribir Superficie o perimetro) ?")
    var resp = readln()
    when (resp) {
        "perimetro" -> perimetromostrar(lado)
        "superficie" -> superficiemostrar(lado)
    }
}
