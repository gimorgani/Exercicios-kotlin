fun main () {

    val produtos = mutableListOf<String>()

    while (true){

        println(" \nVamos ver o estoque.")
        println(" Digite o que você quer saber sobre seu estoque :")
        println("1 -Adicionar produtos, 2-Remover produtos, 3-Atualizar, 4-Mostrar o estoque, 5-Sair.")
        println(" Opção: ")

        var num = readln().toInt()



        when (num) {

            1 -> {
            do {

                println("Digite o produto que você quer adicionar e caso você queira parar de adicionar itens dê um espaço.")
                val produ = readln()
                if (produ != "") {
                    produtos.add(produ)
                } else{
                    print("Não pode entrar um produto vazio no estoque")

                }
            } while (produ != "")

        }

            2 -> {


                println("Digite um nome para você deletar da lista: ")
                val produ = readln()

                if (produ.contains(produ)) {
                    produtos.remove(produ)

                } else
                    println("O nome $produ não existe na lista")


        }

            3 -> {
            println(" Lista de produtos\n")
            produtos.forEach {
                println(it)
            }

            println("Digite um produto para atualizar: ")
            val produ = readln()

            if (produtos.contains(produ)) {
                val index = produtos.indexOf(produ)
                println("Digite um novo produto: ")
                val valor = readln()

                produtos[index] = valor
                println(" Produto cadastrado!")
            } else {
                println("O produto não existe na lista")
            }
        }

            4 -> {
            println(" Os produtos do seu estoque são: \n")
            produtos.forEach {
                println("$it, ")
            }
            println()

        }
            5 -> break
            else -> println(" Valor Inválido")

        }
    }
}











