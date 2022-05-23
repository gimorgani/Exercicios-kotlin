import java.awt.PageAttributes.PrintQualityType

fun main (){

println("Qual o seu estado civil?")
    println("Digite 1-Soleiro/a, 2-Casado/a, 3- Outros")
    println("Opção: ")

    val ec = readln().toInt()

    when (ec){
        1-> println("Você é Solteiro/a")
        2-> println("Você é Casado/a")
        3-> println("Outros")

        }
            if (ec > 4|| ec ==0){
            println("Resultado inválido")

    }
}