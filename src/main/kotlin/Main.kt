fun main() {
    /*  println("cliente: Queria saber o valor dessa tatuagem.")
    println("tatuador: Então esse desenho está meio tortinho, podemos dar uma ajeitada " +
            "e deixar ele mais bonito")
    println("cliente: Isso seria otimo, quanto ficaria")
    println("tatuador: Eu cobro por hora/sessão. O valor ficaria R$360 ")
    println("cliente: Não tem aquela promoção de fazer 3 tatuagens por R$ 100")
    println("tatuador: felizmente não ")
    println("cliente: ah mas tal lugar é mais barato")
    println("tatuador: então vai fazer nesse lugar então horas")
    println("cliente: nossa que falta de respeito com o cliente")
}*/
    println(" Digite três números e veja qual é o maior deles.")

    println(" Primeiro número: ")
    val num1 = readln().toInt()
    println(" Segundo número: ")
    val num2 = readln().toInt()
    println(" Terceiro número: ")
    val num3 = readln().toInt()

    if (num1 > num2 && num1 > num3) {
        println(" O maior número é $num1")

    } else if (num2 > num1 && num2 > num3) {
        println(" O maior número é $num2")

    } else {
        println(" O maior número é $num3")
    }
}