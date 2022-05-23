fun main(){

    println( "Digite três números para deixa-lo na ordem crescente!\n")


    println("Digite o primeiro número: ")
    val num1 = readln().toInt()

    println("Digite o segundo número: ")
    val num2 = readln().toInt()

    println("Digite o terceiro número: ")
    val num3 = readln().toInt()

    if( num1 <= num2 && num1 <= num3){
        print(" $num1 , $num2 , $num3")
    }else if (num1 <= num3 && num3 <= num2){
        print(" $num1, $num3 , $num2")
    }else if ( num2 <= num1 && num2 <= num3){
        println(" $num2,$num1,$num3")
    }else if ( num2 <= num3 && num2 <= num1){
        println(" $num2 , $num3, $num1")
    }else if (num3 <= num1 && num1 <= num2){
        println("$num3 ,$num1,$num2")
    }else{
        print("$num3, $num2, $num1")
    }

}