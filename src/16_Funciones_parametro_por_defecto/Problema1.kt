package `16_Funciones_parametro_por_defecto`

/*
Confeccionar una función que reciba entre 2
y 5 enteros. La misma nos debe retornar la
suma de dichos valores. Debe tener tres
parámetros por defecto.

 */

fun recibeSuma(v1: Int, v2: Int,v3: Int = 5, v4: Int = 5, v5: Int = 5): Int {
    val suma : Int = v1 + v2 + v3 + v4 + v5
    return suma
}

fun main(){
    print("Digite el primer valor: ")
    val v1alor = readln().toInt()
    print("Digite el segundo valor: ")
    val v2alor = readln().toInt()
    print("Desea digitar otro valor (1 para si, 0 para no)?: ")
    var ele1 = readln().toInt()
    if (ele1 == 1)
        print("Digite el tercer valor: ")
    val v3alor = readln().toInt()
    print("Desea digitar otro valor (1 para si, 0 para no)?: ")
    var ele2 = readln().toInt()
        if (ele2 == 1)
        print("Digite el cuarto valor: ")
        val v4alor = readln().toInt()
        print("Desea digitar otro valor (1 para si, 0 para no)?: ")
        var ele3 = readln().toInt()
        if (ele3 == 1)
            print("Digite el quinto valor: ")
            val v5alor = readln().toInt()

    val suma = recibeSuma(v1alor,v2alor,v3alor,v4alor,v5alor)
    print("El valor de la suma de todos los digitados es $suma")
}