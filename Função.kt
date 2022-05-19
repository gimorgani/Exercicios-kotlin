fun main (){


    println(" Vamos fazer uma conta? ")
    println(" Digite um número: ")
    val num1 = readln().toDouble()

    println(" Digite outro número: ")
    val num2 = readln().toDouble()


    println(" Agora escolha uma das opções para fazer seu cálculo: ")
    println(" 1 -soma, 2-subtração, 3-multiplicação, 4-divisão ")
    val escolha = readln().toInt()

    when (escolha){
        1 ->  println(" A soma dos números $num1 e $num2 é: ${soma(num1,num2)}")
        2 -> println(" A subtração dos números $num1 e $num2 é: ${sub(num1,num2)}")
        3 -> println(" A multiplicação dos números $num1 e $num2 é: ${multi(num1,num2)}")
        4 -> println(" A divisão dos números $num1 e $num2 é: ${div(num1,num2)}")
    }


}
 fun soma(n1:Double,n2:Double): Double{
    val resultsoma = n1 + n2
     return resultsoma
 }

fun sub(n1:Double,n2:Double): Double {
    val resultsub = n1 - n2
    return resultsub
}
fun multi(n1:Double,n2:Double): Double {
    val resultmult = n1 * n2
    return resultmult
}
fun div(n1:Double,n2:Double): Double{
    val resuldiv = n1 / n2
    return resuldiv
}

