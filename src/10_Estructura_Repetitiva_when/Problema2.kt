package `10_Estructura_Repetitiva_when`
/*
Plantear una estructura que se repita 5 veces
y dentro de la misma cargar 3 valores enteros.
Acumular solo el mayor del cada lista de tres valores.
 */
fun main(){
    var prinum = 0
    var segnum = 0
    var ternum = 0
    var sumato = 0
    for (i in 1..5){
        print("Ingrese su primer valor: ")
        val prinum = readln().toInt()
        print("Ingrese su segundo valor: ")
        val segnum = readln().toInt()
        print("Ingrese su tercer valor: ")
        val ternum = readln().toInt()
        when {
            prinum > segnum && segnum > ternum -> sumato += prinum
            prinum < segnum && segnum > ternum -> sumato += segnum
            prinum < segnum && segnum < ternum -> sumato += ternum
        }
    }
    println("La suma de todos los  valores es: $sumato")
}