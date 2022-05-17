fun main(){

    println(" Digite três números e veja qual é o maior deles.")

    println(" Primeiro número: ")
    val num1 = readln().toInt()
    println(" Segundo número: ")
    val num2 = readln().toInt()
    println(" Terceiro número: ")
    val num3 = readln().toInt()

if( num1 > num2 && num1 > num3){
    println(" O maior número é $num1")

}else if ( num2 > num1 && num2 > num3){
    println(" O maior número é $num2")

}else if ( num1 == num2 && num1 == num3){
    println(" Esse números são iguais")
}else if ( num2 == num1 && num2 == num3){
    println(" Esses números são iguais")
}else{
    println(" O maior número é $num3")
}
}