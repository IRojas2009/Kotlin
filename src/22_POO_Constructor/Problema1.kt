package `22_POO_Constructor`

/*
Crear una clase llamada Producto con las propiedades nombre, precio y stock.
 Utilizar el constructor principal para inicializar estas propiedades.
 Implementar un bloque init que verifique que ni el precio ni el stock sean negativos. Si alguno es negativo, establecer su valor en 0.
 Agregar los siguientes métodos:
mostrarInfo(): muestra los datos del producto.
hayStock(): retorna un mensaje indicando si el producto está disponible (stock > 0).

 */

class Producto (nombre: String, precio: Double, var stock: Int) {

    fun hayStock(stock: Int): String{
        if (stock <= 0){
            val stock = 0
            return "Disponible"
        }else{
            return "Agotado"
        }

    }

    fun mostrarInfo(nombre: String, precio: Double, stock: Int, haystock: String){
        println("Nombre del producto: $nombre")
        println("Precio del producto: $precio")
        println("El producto esta $haystock, porque le quedan $stock unidades")
    }
}


fun main(){
    val producto1 = Producto ("Manzanas", 5.0, 20)
    val haystock = producto1.hayStock(20).toString()
    producto1.mostrarInfo(
        "Manzanas", 5.0, 20, haystock)
}