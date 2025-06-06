package Proyecto_Kotlin

fun registrarNota(nombre:String): Double{
    val nota = DoubleArray( 5)
    for (i in 0..4) {
        var valor: Double = 0.0
    // Seguir pidiendo hasta que la nota esté bien
    while (valor < 1 || valor > 100) {
        print("Ingrese su nota del 1 al 100: ")
        valor = readln().toDouble()
        if (valor < 1 || valor > 100) {
            println("El valor es incorrecto")
        }
    }
        nota[i] = valor    }
    val promedio: Double = nota.sum() / nota.size
    return promedio
}

fun main (){
    val estudiantes = Array<String>(5)
    for (i in estudiantes.indices) {
        print("Ingresa el nombre ${i + 1}: ")
        estudiantes[i] = readln()
    }
    val notas = mutableListOf<Double>()
    var aprobados = 0
    var reprobados= 0
    for (nombre in estudiantes) {
        val nota = registrarNota(nombre)
        notas.add(nota)
        when (nota) {
            in  90..100 -> {
                println("$nombre tiene una calificación Excelente.")
            }
            in 80..89 -> {
                println("$nombre tiene una calificación Buena.")
            }
            in 70..79 -> {
                println("$nombre tiene una calificación Aprobada.")
            }
            else -> {
                println("$nombre tiene una calificación Reprobada.")
            }
        }
        if (nota > 70)
            aprobados++
        else
            reprobados++
    }
    println("la cantidad de estudiantes aprobados es $aprobados")
    println("la cantidad de estudiantes reprobados es $reprobados")
    println("el promedio de notas de los estudantes es $promedio")

    }