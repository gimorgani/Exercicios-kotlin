fun main(){

    println(" Qual o valor da sua compra: ")
    print("R$ ")
    val valor = readln().toDouble()

    var desc = 0.0

    if (valor < 50 ){

        desc = 0.0
    }else if ( valor in 50.0 .. 101.0){
        desc = 0.1
    }else if (valor in 101.0 .. 200.0){
        desc = 0.2
    }else{
        desc = 0.3
    }

    val compDesc = valor * desc

    println(" A sua compra teve ${ desc * 100} % de desconto e fica em torno de R$${valor - compDesc}")
}