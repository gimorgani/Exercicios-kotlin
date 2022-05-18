fun main(){

    var soma =0
    var cont = 0
    do {
        println(" Digite um número: ")
        val num = readln().toInt()

        if (num % 3 == 0 && num!=0){
            soma+= num
            cont++
        }
    }while (num != 0)
    val  media = soma / cont

    println(" A soma dos números digitados é igual a : $soma e a média é igual a: $media")
}