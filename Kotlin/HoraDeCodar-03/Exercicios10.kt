fun main(){

    val valores = DoubleArray(10)
    var valoresDentro = 0; var valoresFora = 0
    valores.forEachIndexed { index, d ->
        println("Digite o ${index+1}º valor: ")
        val valor = readln().toInt()
        if(valor in 24..42) valoresDentro++
        else valoresFora++
    }
    println("Valores entre 24 e 42: $valoresDentro")
    println("Valores fora do range: $valoresFora")

}