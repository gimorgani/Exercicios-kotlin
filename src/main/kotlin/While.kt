fun main (){

    var soma = 0.0
    var num = 1.0

    while (num!=0.0){

        println(" Digite um número diferente de 0: ")
        num= readln().toDouble()
        soma+=num
 
    }
    println ( " A soma de todos os números é: $soma")
}