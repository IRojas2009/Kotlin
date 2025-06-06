package `14_Funciones_con_retorno`

/*
En la función main del
programa cargar los lados
de dos rectángulos y luego
mostrar cual de los dos
tiene una superficie mayor.
 */

fun superficie(cuad: Int, ): Int {
    val sucu = cuad * cuad

    return sucu
}

fun recsuperficie(rec1: Int, rec2: Int){
    val sure = rec1 * rec2
}


fun main(){
    print("Digite el lado de Cuadrado: ")
    val lcua = readln().toInt()
    print("Digite el lado de Cuadrado: ")
    val lre1 = readln().toInt()
    print("Digite el lado de Cuadrado: ")
    val lre2 = readln().toInt()
superficie(lcua)
    recsuperficie(lre1, lre2) 
}