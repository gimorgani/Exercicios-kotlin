

fun main(){

        println("Digite o nome do aluno")
    println("Aluno: ")
         val nome = readln().toString()

    println("Agora digite a sua primeira nota")
    println("Nota:")
    val not1 = readln().toDouble()
    println("Agora digite a sua segunda nota")
    println("Nota: ")
    val not2 = readln().toDouble()

    val media = not1+ not2/2

    println("Sua média é $media")
    println("O nome do aluno é: $nome")
    println("A primeira nota é: $not1")
    println("A segunda nota é: $not2")
    println("Sua média final é: $media")
    if (media <= 6){
        println(" Você foi reprovado/a!")

    }else{
        println("Você foi aprovado/a!")
    }
}