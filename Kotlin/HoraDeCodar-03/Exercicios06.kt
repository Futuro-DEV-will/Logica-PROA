fun main(){

    do{
        println("Digite a primeira nota do aluno: ")
        val nota1: Double = readln().toDouble()

        println("Digite a segunda nota do aluno: ")
        val nota2: Double = readln().toDouble()

        val resultado = (nota1 + nota2) / 2.0
        if(resultado >= 9.5) println("Aluno aprovado!")
        else println("Aluno reprovado!")

        println("Calcular a média de outro aluno Sim/Não?")
        val opcao = readln()
    }while (opcao == "s" || opcao == "S" || opcao == "sim" || opcao == "SIM" || opcao == "sIm" || opcao == "SiM" || opcao == "sIM" || opcao == "Sim" || opcao == "SIm" || opcao == "siM")

}