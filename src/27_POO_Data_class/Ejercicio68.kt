package `27_POO_Data_class`

data class Jugador(val nombre: String){
    var puntos: Int = 0
}

fun main(){
    val jugador1 = Jugador("Pedro")
    val jugador2 = Jugador("Luis")

    jugador1.puntos = 10
    jugador2.puntos = 20

    if (jugador1 == jugador2){
        println("Tienen el mismo nombre")
}else{
    println("No tienen el mismo nombre")
}}