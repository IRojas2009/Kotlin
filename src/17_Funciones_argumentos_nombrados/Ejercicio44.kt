package `17_Funciones_argumentos_nombrados`

fun calcularSueldo(nombre : String, costohora : Double , cantidadhoras : Int){
    val sueldo = costohora * cantidadhoras
    println("$nombre trabajo $cantidadhoras horas, se le pagan $costohora por hora, por lo tanto le corresponde un sueldo de $sueldo")
}

fun main(){
    calcularSueldo("Juan", 10.5, 120)
    calcularSueldo(costohora = 12.0, cantidadhoras = 40, nombre = "Ana")
    calcularSueldo(cantidadhoras = 90, nombre = "Luis", costohora = 7.25)
}
