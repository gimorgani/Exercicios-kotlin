fun main(){

 println(" Digite três números para deixa-los em ordem crescente")

   println("Primeiro número: ")
   val num1 = readln().toInt()
   println("Segundo número: ")
   val num2 = readln().toInt()
   println("Terceiro número: ")
   val num3 = readln().toInt()

  val num = listOf( num1, num2, num3)

  val ordem = num.sorted()
  println(" os números em ordem crescente são: $ordem")



}