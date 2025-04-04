package `5_Estructuras_condicionales_anidadas`

fun main() {

    print("Ingrese primer nota: ")
    val nota1 = readln().toInt()
    print("Ingrese segunda nota: ")
    val nota2 = readln().toInt()
    print("Ingrese tercer nota: ")
    val nota3 = readln().toInt()

    val promedio = (nota1 + nota2 + nota3) / 3

    val estado = if (promedio >= 7) "Promocionado"
    else if (promedio >= 4) "Regular" else "Reprobado"

    print("Estado del alumno: $estado")
}