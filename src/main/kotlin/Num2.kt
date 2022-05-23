fun main(){

    print("Digite o valor 1: ")
    val num1 = readln().toInt()

    print("Digite o valor 2: ")
    val num2 = readln().toInt()

    print("Digite o valor 3: ")
    val num3 = readln().toInt()

    if(num1<=num2 && num1<=num3){
        println("$num1 , $num2 , $num3")
    }else if (num1<=num3 && num3<=num2){
        println("$num1,$num3,$num2")
    }else if (num2<=num1 && num2<=num3){
        println("$num2, $num1,$num3")
    }else if (num2<=num3 && num2<=num1){
        println("$num2, $num3,$num1")
    }else if (num3<=num1 && num3<=num2){
        println(" $num3,$num1, $num2")
    }else{
        println ("$num3,$num2,$num1")
    }


}