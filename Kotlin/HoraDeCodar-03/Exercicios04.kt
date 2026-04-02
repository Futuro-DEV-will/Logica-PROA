fun main(){

    var resultado: Double = 0.0
    var divisor:Int = 0
    for (i in 15..100){
        resultado += i
        divisor++
    }
    println("Resultado da média: ${resultado/divisor}")


    val valores = DoubleArray(86)
    valores.forEachIndexed { index, d ->
        valores[index] = (index+15).toDouble()
    }
    println("Resultado da média: ${valores.sum()/divisor}")

}