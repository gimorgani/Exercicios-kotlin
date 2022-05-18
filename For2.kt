fun main () {
    var soma = 0
    var soma2 = 0

    val num = 1


    for (num in 1..10 step 1) {
        print("Digite um número: ")
        var num = readln().toInt()


    }
    if (num % 2 == 0) {
        soma += num
        for (num in 1..10 step 1) {
            print("Digite um número: ")
            var num = readln().toInt()
            println(" Você digitou $soma números pares")



            if (num % 2 != 0) {
                soma2 += num

                for (num in 1..10 step 1) {
                    print("Digite um número: ")
                    var num = readln().toInt()
                    println("Você digitou $soma2 números ímpares ")
                }

            }
        }
    }
}



