fun main (){

    println(" Vamos saber mais sobre alguns bichos? ")

    println("Digite uma opção para selecionar o animal que você quer conhecer: ")
    println("1-Cachorro, 2-Cavlo, 3-Preguiça, 4-Sair")
    var num = readln().toInt()


    val dormir = Preguiça("Bela",3,"Longa e ondulada")
    val galopa = Cavalo("Furacão",5, "Avelin")
    val latido =Cachorro("Kimberly",2,"Dachshund")

    when (num) {
        1 -> {
            println("O animal que você escolheu é o cachorro")
            println("O nome é: ${latido.nome}, tem ${latido.idade} anos e a raça é : ${latido.raca}")
            latido.som()
            latido.correr()

        } 2 -> {
        println(" O animal que você escolheu é o cavalo")
        println("O nome é: ${galopa.nome},tem ${galopa.idade} anos e a raça é: ${galopa.raca}")
            galopa.correr()
            galopa.som()

         } 3 ->{
             println("O animal que você escolheu é a preguiça")
            println("O nome é ${dormir.nome},tem ${dormir.idade} anos e a pelagem é: ${dormir.pelagem}")
            dormir.som()
            dormir.subir()
         } 4 ->{
            println("Você saiu!")
         }






    }
}