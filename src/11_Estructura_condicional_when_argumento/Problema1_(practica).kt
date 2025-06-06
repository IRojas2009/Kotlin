package `11_Estructura_condicional_when_argumento`

/*Realizar la carga de la cantidad de
hijos de 10 familias. Contar cuántos
tienen 0,1,2 o más hijos. Imprimir
dichos contadores.
*/

fun main () {
    var fam0 = 0
    var fam1 = 0
    var fam2 = 0
    var fam3mas = 0
    for (i in 1..10){
        print("Digite cuantos hijos tiene la familia numero $i: ")
        val hijos = readln().toInt()
        when (hijos) {
            0 -> fam0++
            1 -> fam1++
            2 -> fam2++
            else -> fam3mas++
        }
    }
    println("Hay $fam0 familias que no tienen hijos.")
    println("Tambien hay $fam1 familias que tienen 1 hijo.")
    println("Hay $fam2 familias que tienen 2 hijos.")
    println("Por otro lado, $fam3mas familias tienen 3 o mas hijos.")
}