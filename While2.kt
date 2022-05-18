fun main () {
    var idade = 0
    var cont21 = 0
    var cont50 = 0

    while (idade != -99 ) {

        print(" Digite a sua idade: ")
        idade = readln().toInt()

        if (idade !=-99){
           if ( idade <21){
               cont21++
           }else if ( idade > 50){
               cont50++
           }

            }
        }
    println(" O total de pessoas com 21 anos é : $cont21 " )
    println(" O total de pessoas com mais de  50 anos é : $cont50")
    }