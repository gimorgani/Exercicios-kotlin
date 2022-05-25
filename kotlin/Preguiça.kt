class Preguiça(nome: String, idade: Int, var pelagem: String) :Animal(nome, idade) {

    override fun som() {
        println(" Ela emite um som quando está em perigo")
    }
 fun subir(){
     println("As preguiças sobem em árvores")
 }
}