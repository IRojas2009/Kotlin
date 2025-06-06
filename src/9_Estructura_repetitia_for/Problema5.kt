package `9_Estructura_repetitia_for`

/*
Realizar un programa que lea los lados de n triángulos, e informar:
a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres
lados iguales), isósceles (dos lados iguales), o escaleno (ningún
lado igual)
b) Cantidad de triángulos de cada tipo.

 */
fun main() {
    print("Digite la cantidad de triangulos: ")
    val cant = readln().toInt()
    //Ahora si perros que empieze la locura


    for (i in 1..cant) {

        print("Digite el primer lado: ")
        val prilad = readln().toInt()
        print("Digite el segundo lado: ")
        val seglad = readln().toInt()
        print("Digite el tercer lado (Base): ")
        val terlad = readln().toInt()

        if (prilad == seglad) {
            if (prilad == terlad) {
                val tipotrian: String = "Isoceles (dos lados iguales)"
                println("Su triangulo es de tipo $tipotrian")
            } else {
                val tipotrian: String = "Equilatero (tres lados iguales)"
                    println("Su triangulo es de tipo $tipotrian")
                {
                    if (prilad == terlad) {
                        val tipotrian: String = "Isoceles (dos lados iguales)"
                        println("Su triangulo es de tipo $tipotrian")
                    } else {
                        val tipotrian: String = "Escaleno (ningun lado igual)"
                        println("Su triangulo es de tipo $tipotrian")
                    }
                }
            }
        }

    }
}

fun println(s: String, function: () -> Unit) {

}


