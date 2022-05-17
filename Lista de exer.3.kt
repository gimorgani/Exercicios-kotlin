fun main (){

    println(" Digite a sua idade: ")
    val idade = readln().toInt()


    when ( idade){
    
    in 10 .. 14 -> println ("Infantil")
    in 15 .. 17 -> println ("Juvenil")
    in 18 .. 25 -> println ("Adulto")
   
    else -> println(" Valor inválido")
}
}
