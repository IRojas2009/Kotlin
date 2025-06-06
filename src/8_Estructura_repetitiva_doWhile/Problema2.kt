package `8_Estructura_repetitiva_doWhile`

/*
En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada cuenta corriente se conoce:
número de cuenta y saldo actual. El ingreso de datos debe finalizar al ingresar un valor negativo en el número
de cuenta.
Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:

a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo que:

Estado de la cuenta	'Acreedor' si el saldo es >0.
			'Deudor' si el saldo es <0.
			'Nulo' si el saldo es =0.

b) La suma total de los saldos acreedores.

 */
fun main(){
    do {
        println("Numero de Cuenta:")
        val numcue = readln().toInt()
        println("Saldo actual:")
        val salcue = readln().toInt()

        val estcue = if (salcue < 0) "Deudor" else if (salcue == 0) "Nulo" else "Acreedor"

        println("Numero de cuenta: $numcue. Saldo: $salcue. Estado de Cuenta: $estcue")
    } while (numcue <= 0)

}