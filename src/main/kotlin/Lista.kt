fun main () {

    var lista = mutableListOf<String>("arroz", "feijão", "café")




    lista.add(" macarrão, molho")


    println(" os itens da lista são: $lista")


    val cont = lista.contains("arroz")

    if (cont) {
        println("esse item está presente na lista")
    } else {
        println("esse item não está na lista")


    }
}





