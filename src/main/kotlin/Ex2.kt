fun main() {

    var soma = 0
    var soma2 = 0
    var num = 1

    for (num in 1..10 step 1) {

        println(" Digite um número : ")
        var num = readln().toInt()
    }

    if (num % 2 == 0) {
        soma += num
        for (num in 1..10 step 1) {
            println(" Digite um número : ")
            var num = readln().toInt()
            println(" A soma dos números pares é: $soma ")

            if (num % 2 != 0) {
                soma2 += num
                for (num in 1..10 step 1) {
                    println(" Digite um número : ")
                    var num = readln().toInt()
                    println(" A soma dos números ímpares é: $soma2")
                }


            }
        }
    }
}