package `1_Tipos_de_variables`

fun print(varuno: Int, s: String) {
    /*
    Crear un programa que defina dos variables inmutables de tipo Int. Luego definir una
 tercer variable mutable que almacene la suma de las dos primeras variables y las
 muestre. Seguidamente almacenar en la variable el producto de las dos primeras
 variables y mostrar el resultado
    */

    val varuno: Int
    val vardos: Int

    varuno = 5
    vardos = 3

    var ressuma: Int
    var resmul: Int

    ressuma = (varuno + vardos)
    resmul = (varuno * vardos)

    print(varuno, " + ")
    print(vardos, " = ")
    println(ressuma)

    print(varuno, " * ")
    print(vardos, " = ")
    print(resmul)
}
