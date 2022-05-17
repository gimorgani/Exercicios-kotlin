
import kotlin.math.pow
import kotlin.math.sqrt

fun main () {

    println(" Digite um número: ")


    val num = readln().toDouble()


    if (num%2.0==0.0){
        println("Esse número é par e a raiz quadrada dele é: ${sqrt(num)}")
    }else{
        println("Esse número é ímpar e ele ao quadrado é: ${ num.pow(2.0)}")
    }
}
