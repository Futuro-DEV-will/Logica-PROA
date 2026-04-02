fun main(){

    println("Digite o primeiro valor: ")
    val valor1 = readln().toDouble()

    println("Digite o segundo valor: ")
    var valor2 = readln().toDouble()

    while(valor2 <= 0){
        println("Valor inválido")
        println("Digite o segundo valor: ")
        valor2 = readln().toDouble()
    }
    println("Resultado: $valor1 / $valor2 = ${valor1 / valor2}")
}