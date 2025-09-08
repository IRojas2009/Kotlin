package `25_POO_Modificadores_private_y_public`

/*
SensorTemperatura
Objetivo
Modelar un sensor que mide temperaturas en °C, protegiendo el valor interno y permitiendo solo operaciones controladas.
*/
/*
Requerimientos
Clase SensorTemperatura con:

Propiedad privada temperatura: Double que almacene el valor actual del sensor.

Metodo público configurarTemperatura(valor: Double):

Debe usar un metodo privado validarRango(valor: Double) para permitir solo valores entre -50 y 150.
Si es válido, actualizar la temperatura.
Si es inválido, mostrar mensaje de error.

Metodo público aumentar(delta: Double):

Suma delta a la temperatura actual.
Antes de asignar, pasa por validarRango.

Metodo público disminuir(delta: Double):

Resta delta de la temperatura actual.
Antes de asignar, pasa por validarRango.

Metodo público mostrar():

Imprime la temperatura con 1 decimal.

Metodo privado validarRango(valor: Double): Boolean:

Retorna true si está dentro del rango permitido (-50 a 150), false en caso contrario.

 */

class Temperatura {
    private var temp: Double = 0.0
    var delta: Double = 0.0

    fun configurarTemperatura(temp: Double){
        print("Cuantos grados desea manejar?: ")
        var delta = readln().toDouble()
        print("Que desea hacer? 1 para aumentar, 2 para disminuir: ")
        var eleccion = readln().toInt()
        when (eleccion){
            1-> aumentar(delta)
            2-> disminuir(delta)
        }
        validarRango(temp, delta)
    }

    private fun validarRango(temp: Double, valor: Double): Boolean{
        if (((temp + valor) > 150.0) && ((temp + valor) < -50.0)){
            return true
        }else{
            return false
        }
    }

    private fun aumentar(delta:Double){
        if (validarRango(temp, delta) == true){
            temp =+ delta
        }else{
            println("ERROR: Al efectuar la operacion el resultado estara fuera de los limites.")
        }
    }

    private fun disminuir(delta:Double){
        if (validarRango(temp, delta) == true){
            temp =- delta
        }else{
            println("ERROR: Al efectuar la operacion el resultado estara fuera de los limites.")
        }
    }

    fun mostrar(){
        print("Temperatura : $temp")
    }
}

fun main(){
    val temp1 = Temperatura()
    temp1.configurarTemperatura(36.6)
    val temp2 = Temperatura()
    temp2.configurarTemperatura(-9.0)
}