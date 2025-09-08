package `25_POO_Modificadores_private_y_public`

/*
CuentaBancaria — Encapsular estado y validar operaciones
¿Qué se busca?
Proteger el saldo para que nadie lo modifique directamente.
Exponer solo operaciones válidas: depositar, retirar, consultar.
Pasos para hacerlo
Estado privado: crea private var saldo: Int = 0.
*/
/*
API pública mínima:

depositar(monto: Int): verifica que monto > 0. Si no, mensaje de error.
retirar(monto: Int): verifica que monto > 0 y que saldo >= monto. Si no, mensaje.
consultarSaldo(): imprime el saldo actual.
*/
/*
Helpers(Métodos) privados:


montoValido(monto: Int): devuelve true si monto > 0.
puedeRetirar(monto: Int): devuelve true si alcanza el saldo.
(Opcional) registrarOperacion(texto: String): centraliza impresiones de auditoría.
*/
/*
Demostración: en main, haz un flujo de operaciones: dos depósitos, un retiro válido,
un retiro inválido, y consulta final.
 */

class CuentaBancaria(saldo: Int) {
    private var saldo: Int = 0


    fun correr() {
        print("¿Cuanto dinero quiere mover? :")
        var monto: Int = readln().toInt()
        separacion()
        print("Digite 1 para depositar, Digite 2 para retirar: ")
        var eleccion: Int = readln().toInt()
        var valido: Boolean = montoValido(monto)
        var disponible: Boolean = puedeRetirar(saldo, monto)

        when (eleccion){
            1 ->{
               depositar(monto, valido)
           }
            2 ->{
                retirar(saldo,monto,disponible)
            }
       }
    }


    private fun separacion() = println("************************************************")


    private fun depositar(monto:Int, valido: Boolean){
        if (valido == true) {
            this.saldo =+ monto
            print("Depositado con Exito! Ahora su saldo es de $saldo")
        }else{
            println("No puede depositar ya que su cantidad a mover es insuficiente o nula.")
        }
    }

    private fun retirar(saldo: Int,monto:Int, disponible: Boolean){
        if (disponible == true) {
            this.saldo =- monto
            print("Retirado con Exito! Ahora su saldo es de $saldo")
        }else{
            println("No puede retirar ya que su cantidad guardada es insuficiente o nula.")
        }
    }


    private fun montoValido(monto: Int): Boolean{
        if (monto > 0){
            return true
        }else{
            return false
        }
    }

    private fun puedeRetirar(saldo: Int, monto: Int): Boolean {
        if (saldo >= monto){
            return true
        }else{
            return false
        }
    }
}

fun main(){
    val cliente1 = CuentaBancaria(2000)
    cliente1.correr()

    val cliente2 = CuentaBancaria(3000)
    cliente2.correr()
}