fun main() {



        try {


            println("Digite o  seu nome:")
            var nomes = readln()

            val clien = Cliente(nomes,9999000,"Rua Jardim")

            clien.adicionar(valor = "")
            clien.remover(valor = "")
            clien.lista()
            clien.dados()


        } catch (e: Exception) {
            println(e.message)
        }


    }


