class Cavalo(nome: String, idade: Int, var raca:String) :Animal(nome, idade){


    override fun som() {
        println(" O som que ele faz é o relincho")
    }
fun correr(){
    println("Os cavalos correm")
}
}