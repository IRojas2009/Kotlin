package `16_Funciones_parametro_por_defecto`

fun tituloSubrayado(titulo: String, caracter: String = "*"){
    println(titulo)
    for (i in 1..titulo.length)
        print(caracter)
    println()
}

fun main (){
    tituloSubrayado("Sistema de Administracionn")
    tituloSubrayado("Ventas","-")
}