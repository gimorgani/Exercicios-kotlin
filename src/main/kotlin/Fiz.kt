fun main () {

    for (num in 1..100 step 1)
        if ( num % 3 == 0 && num % 5 == 0){
            print( "FizzBuzz\n")
        }else if (num %5 == 0 ){
        print("Buzz\n")
        }else if ( num % 3 == 0 ){
            print(" Fizz\n")
        }else{
            print("  $num \n")
        }

}