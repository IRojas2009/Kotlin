package `11_Estructura_condicional_when_argumento`

fun main(){
    print("Ingrese un valor entero positivo comprendido entre 1 y 99999: ")
    val valor = readln().toInt()
    when (valor) {
        in 1..9 -> print("Tiene 1 digitos")
        in 10..99 -> print("Tiene 2 digitos")
        in 100..999 -> print("Tiene 3 digitos")
        in 1000..9999 -> print("Tiene 4 digitos")
        in 10000..99999 -> print("Tiene 5 digitos")
        else -> print("No se encuentra en el rango indicado")
    }
}