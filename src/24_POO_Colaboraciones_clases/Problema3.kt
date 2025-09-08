package `24_POO_Colaboraciones_clases`

/*
Problema 3
Objetivo:
Simular el encendido de un motor y el comportamiento de un carro que solo puede conducirse si el motor está encendido.
🔹 Clase Motor
Atributos:
encendido: Boolean → indica si el motor está activo.
Métodos:
encender()
Cambia el estado a true y muestra un mensaje.
apagar()
Cambia el estado a false y muestra un mensaje.
estado()
Muestra si el motor está encendido o apagado.

🔹 Clase Carro
Atributos:
motor: Motor → instancia de la clase Motor.
Métodos:
conducir()
Solo permite "conducir" si el motor está encendido.
Si está apagado, impide avanzar e imprime un mensaje.
estadoGeneral()
Muestra el estado actual del motor llamando al méto do estado().


🔹 Lógica de colaboración:
El Carro depende del comportamiento del Motor, lo que demuestra una clara relación de composición, donde una clase contiene y controla a otra.
*/





class Motor {
    var encendido: Boolean = false

    fun encender() {
        encendido = true
        println("El motor ha sido encendido.")
    }

    fun apagar() {
        encendido = false
        println("El motor ha sido apagado.")
    }

    fun estado() {
        val estadoMotor = if (encendido) "encendido" else "apagado"
        println("Estado del motor: $estadoMotor")
    }
}



class Carro {
    var motor = Motor()

    fun conducir() {
        if (motor.encendido) {
            println("El carro está en movimiento.")
        } else {
            println("No se puede conducir. El motor está apagado.")
        }
    }

    fun estadoGeneral() {
        motor.estado()
    }
}




fun main() {
    val carro = Carro()

    carro.conducir()
    carro.motor.encender()
    carro.conducir()
    carro.estadoGeneral()
    carro.motor.apagar()
    carro.conducir()
}
