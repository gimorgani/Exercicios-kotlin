fun main (){

    println(" Digite a sua idade: ")
    val idade = readln().toInt()


    if (idade <=10 && idade <=14){
        println("Você está na categoria infantil")
    }else if ( idade in 15 .. 17){
        println(" Você está na categoria juvenil")
    } else{
        print(" Você está na categoria adulto")
    }

}