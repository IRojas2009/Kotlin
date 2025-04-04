package `5_Estructuras_condicionales_anidadas`

/*
Un postulante a un empleo, realiza un test de capacitación,
se obtuvo la siguiente información: cantidad total de
preguntas que se le realizaron y la cantidad de preguntas
que contestó correctamente. Se pide confeccionar un programa
que ingrese los dos datos por teclado e informe el nivel del
mismo según el porcentaje de respuestas correctas que ha
obtenido, y sabiendo que:

	Nivel máximo: Porcentaje >= 90%.
	Nivel medio: Porcentaje >= 75% y < 90%.
	Nivel regular:	Porcentaje >= 50% y 75%.
	Fuera de nivel:Porcentaje < 50%.

 */

fun main(){

    print("Digite el porcentaje que obtuvo: ")
    val nota = readln().toInt()

    val res = if (nota >= 90) " de Nivel maximo"
    else if (nota >= 75) " de Nivel Medio"
    else if (nota >= 50) " de Nivel Regular"
    else "ta Fuera de nivel"

    print("El postulante es$res")

}