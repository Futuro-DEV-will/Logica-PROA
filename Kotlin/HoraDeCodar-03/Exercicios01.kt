fun main(){

    println("A Bomba foi ativada e explodirá em 35s")
    Thread.sleep(5000)
    for (i in 30 downTo 0){
        println("$i segundos para a explosão!!!")
        if(i==0)break
        Thread.sleep(1000)
    }
    println("EXPLOSÃO")
}