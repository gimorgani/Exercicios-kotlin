class Cliente( private var nome:String ) {

    init {


        if (nome == "") {
            throw Exception(" A classe foi instanciada de maneira incorreta!")

        }
    }

    private var telefone = 0
    private var endereco = ""

    constructor(nome: String, telefone: Int) : this(nome) {
        this.telefone = telefone
    }
    constructor(nome:String,telefone:Int,endereco:String): this(nome, telefone) {
        this.endereco= endereco
    }


    private var listadecompras = mutableListOf<String>("papel", "lapis", "caderno")

         fun adicionar(valor: String) {
        println("Quais produtos você gostaria de colococar na lista?")
        println("Produto: ")
        var valor = readln()
        listadecompras.add(valor)
             println("Produto adicionado com sucesso!")
        }

         fun remover(valor: String){
            println("Quais produtos você gostaria de retirar da lista?")
            println("Produto: ")
            var valor = readln()
            if (listadecompras.contains(valor)) {
                listadecompras.remove(valor)
                println("Produto removido com sucesso!")
            } else {
                println("Esse produto não está na lista")
            }
         }

        fun lista() {
        listadecompras.forEach {
            String
            println(it)
                }
            }
    fun dados(){
        println("O nome do cliente é $nome, o endereço é $endereco e o telefone é $telefone")
    }

        }






