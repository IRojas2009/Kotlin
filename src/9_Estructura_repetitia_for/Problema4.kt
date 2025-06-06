package `9_Estructura_repetitia_for`

/*
Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos muestre
la tabla de multiplicar del mismo (los primeros 12 términos)
Ejemplo: Si ingresó 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36
 */
fun main(){
    print("Digite un numero del 1 al 10: ")
    val num = readln().toInt()
    if (num > 10) {
        print("Debe elegir un numero entre el 1 y el 10")
    }else {
        for (i in 1..12){
            val res = num * i
            println("$num * $i = $res")
        }
    }
}