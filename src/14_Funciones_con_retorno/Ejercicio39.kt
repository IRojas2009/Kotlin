package `14_Funciones_con_retorno`

fun largo(nombre: String): Int{
    return nombre.length
}

fun main(){
    print("Ingrese un nombre: ")
    val nom1 = readln()
    print("Ingrese otro nombre: ")
    val nom2 = readln()
    if (largo(nom1) == largo(nom2))
        print("Los nombres: $nom1 y $nom2 tienen la misma cantidad de caracteres")
    else
        if (largo(nom1) > largo(nom2))
            print("$nom1 es mas largo que $nom2")
    else
            print("$nom2 es mas largo que $nom1")
}