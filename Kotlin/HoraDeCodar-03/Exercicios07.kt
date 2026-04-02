fun main(){

    val valores = IntArray(6)
    valores.forEachIndexed { index, d ->
        do{
            println("Digite o ${index+1}° valor: ")
            val valor:Int = readln().toIntOrNull() ?: -1
            if(valor in 0..10) valores[index] = valor
        }while (valor !in 0..10)
    }
    println("A média do aluno é ${valores.sum() / valores.size}")
}