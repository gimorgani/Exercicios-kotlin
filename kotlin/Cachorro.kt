class Cachorro(nome: String, idade: Int, var raca:String) :Animal(nome, idade) {




    override fun som() {
        println(" O som que ele faz é o latido")
    }

    fun correr(){
        println(" Os cachorros correm muito")
    }



}