data class Hospital (var quartos :Int, var nome:String, var leito:Int,var uti:Boolean){

    fun uti() {

        println(" Você está na uti? ")
        println("True para sim e false para não!!")

        var s = readln().toBoolean()

        if (s) {
            println(" O paciente está na uti")
        } else {
            s = true
            println(" O paciente está no quarto")
        }
}




}