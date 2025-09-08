package `26_POO_Metodos__set_y_get`

import java.awt.geom.Area
import java.security.cert.TrustAnchor


/*
Diseñe una Clase Jardín:
Una empresa encargada de enzacatar jardines desea que usted le diseñe una aplicación que le permita calcular los costos del contrato por enzacatado. Para efectuar dicho cálculo es
necesario conocer las dimensiones del jardín (largo y ancho) y el tipo de zacate que se utilizará (1 = criollo, 2 = americano, 3 = sintético).
El precio que se cobrará por enzacatar un jardín corresponde a:
El precio por mano de obra en la instalación del zacate.
El costo del zacate.
Más el impuesto de ventas (13%).
Condiciones del problema:
Cuando se construyen los objetos se asigna valor a los atributos largo, ancho y tipoZacate.
Ahora, aplicando el tema de propiedades con set y get:
*/




class Jardin {
    var largo = 0
        set(valor) {

                    if (field <= 0)
                        field = 1
                }
                get() {
                    return field
                }
    private var ancho: Int = 0
                set(valor) {

                    if (field <= 0)
                        field = 1
                }
                get() {
                    return field
                }
    private var tipoZacate: Any = 0
                set(valor) {
                    when (tipoZacate){
                    1 -> field = "criollo".uppercase()
                    2 -> field = "americano".uppercase()
                    3 -> field = "sintetico".uppercase()
                    else -> field = "criollo".uppercase()
                    }
                }
                get(){
                    return field
                }

    fun Total(subtotal: Int, impuesto: Double): Double{
        return subtotal + impuesto
    }
    fun Subtotal(Vzacate: Int, manoobra: Int): Int {
        return manoobra * Vzacate
    }
    fun ValorZacate(area: Int): Int {
        when (tipoZacate){
            "CRIOLLO" -> return 1000 * area
            "AMERICANO"-> return 1500 * area
            "SINTTICO" -> return 2000 * area
            else -> return 1000 * area
        }
    }
    fun ManoObra(area: Int): Int {
        return area * 500
    }
    fun Impuesto(subtotal: Int): Double{
        return subtotal * 0.13
    }
    fun Area(largo: Int, ancho: Int): Int {
        return largo * ancho
    }





    var area = Area(largo, ancho)
    var manoobra = ManoObra(area)
    var vzacate = ValorZacate(area)
    var subtotal = Subtotal(vzacate, manoobra)
    var impuesto = Impuesto(subtotal)
    var total = Total(subtotal, impuesto)




/*
Cuando se asigne un valor a largo o ancho mediante su mét odo set, si el valor recibido es menor o igual a 0, automáticamente se almacenará el valor 1. Esto evita dimensiones inválidas.
Cuando se consulte el valor de largo o ancho mediante su méto do get, debe devolverse el valor tal como está almacenado.
Cuando se asigne un valor a tipoZacate, si no corresponde a ninguno de los valores válidos (1, 2 o 3), el set corregirá el valor asignado y almacenará por defecto el valor 1 (criollo).
Cuando se consulte el valor de tipoZacate mediante su métod o get, no se debe devolver el número, sino el nombre del tipo de zacate en mayúsculas (“CRIOLLO”, “AMERICANO” o “SINTÉTICO”).
Además, se debe disponer de una propiedad calculada area con solo get, que retorne el área total del jardín como largo × ancho.

*/







    fun cargar(){
        do {
            print("Digite la cantidad de metros del Largo de su Jardin: ")
            var largo = readln().toInt()

            print("Digite la cantidad de metros del Ancho de su Jardin: ")
            var ancho = readln().toInt()

            println("Digite 1 para elejir zacate criollo ")
            println("Digite 2 para elejir zacate americano ")
            println("Digite 3 para elejir zacate sintetico ")
            print("En caso de ser diferente, se le asignara criollo por predeterminado:  ")
            var tipoZacate = readln().toInt()

            print("Desea cambiar los datos registrados? Digite 1 para si, otro NUMERO para no: ")
            var cambiarDatos: Int = readln().toInt()
        } while (cambiarDatos == 1)


        imprimirDetalle()




/*
Requerimiento adicional:
El dueño de la empresa desea que la aplicación permita imprimir en detalle desglosado el cobro, mostrando:
Dimensiones del jardín (largo y ancho).
Área total a enzacatar.
Tipo de zacate utilizado (en texto).
Costo de mano de obra.
Costo del zacate.
Subtotal.
Impuesto.
Total a pagar.
Implementación:
La clase Jardín debe contener un constructor con parámetros donde se reciben los valores iniciales para largo, ancho y tipoZacate.
Los atributos deben definirse como propiedades con métodos set y get personalizados para aplicar las validaciones y formatos indicados.
Se deben implementar métodos auxiliares privados que calculen el costo de mano de obra, el costo del zacate, el subtotal, el impuesto y el total.


Finalmente, debe definirse un méto do imprimirDetalle() que muestre toda la información desglosada al usuario.


En el mét odo main se deben crear varios objetos de la clase Jardín, probando tanto casos válidos como casos inválidos (dimensiones negativas o tipo de zacate fuera de rango),
de manera que se evidencie el uso de los set y get en la validación y presentación de los datos.

 */





    }


    fun imprimirDetalle(){
        println("Datos:")
        println("***********************************************************")
        println("Dimensiones del jardín: Largo: $largo, Ancho: $ancho.")
        println("Area a enzacatar: $area.")
        println("Tipo de zacate utilizado: $tipoZacate.")
        println("Costo Mano de obra: ${area * 500}")
        println("Valor del zacate utilizado: $vzacate ")
        println("Subtotal: $subtotal")
        println("Impuesto: ${subtotal*0.13}")
        println("***********************************************************")
        println("Total a pagar: $total")

    }




/*
    Información de costos:
    Por mano de obra la empresa cobra una tarifa básica de ₡500 por metro cuadrado de enzacatado.
    El precio del zacate varía dependiendo del tipo:
    Tipo 1 (criollo): ₡1000 por m².
    Tipo 2 (americano): ₡1500 por m².
    Tipo 3 (sintético): ₡2000 por m².


    El subtotal corresponde a la suma de mano de obra más el costo del zacate.
    El impuesto de ventas se calcula como el 13% sobre el subtotal.
    El total a pagar es la suma del subtotal más el impuesto.

    */






}

fun main(){
    val zacate1 = Jardin()
    zacate1.cargar()
}
