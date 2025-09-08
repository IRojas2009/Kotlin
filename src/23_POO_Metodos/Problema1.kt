package `23_POO_Metodos`

/*
Crear una clase llamada Notas que almacene un arreglo con las calificaciones (enteros) de 4 estudiantes.
Implementar un méto-do cargarNotas() que solicite las 4 notas desde teclado.


Desde ese mismo méto-do, llamar a:


promedioNotas() → calcula y muestra el promedio.


aprobados() → muestra cuántos estudiantes tienen nota mayor o igual a 70.

 */

class Notas{
    var calificaciones = IntArray(4)
    var promedio = 0

    fun cargarNotas(){
        for (i in 1..4){
            print("Digite la nota numero ${calificaciones[i]+1}: ")
            calificaciones[i] = readln().toInt()
        }
        promedioNotas()
        aprobados()
    }

    fun promedioNotas(){

        for (i in 1..4){
            var promedio = calificaciones[i] + promedio
        }
        promedio /= 4
    }

    fun aprobados() {
        for (i in 1..4){
            if (calificaciones[i] >= 70){
                print("El estudiante numero ${calificaciones[i]+1} paso.")
            }else{
                print("El estudiante numero ${calificaciones[i]+1} no paso.")
            }
        }
    }
}

fun main(){
    var notas1 = Notas()
    notas1.cargarNotas()
}