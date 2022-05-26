import kotlin.math.sqrt

class Calculadora () {

   companion object{
        fun soma(n1:Int, n2:Int): Int{
         var soma1 = n1 +n2
            return soma1
        }
        fun sub(n1: Int, n2: Int): Int{
            var sub1 = n1 - n2
            return sub1

        }
        fun mult (n1: Int,n2: Int) : Int{
            var mult1 = n1 * n2
            return mult1
        }
        fun divi (n1: Int, n2: Int) : Int{
            var divi1 = n1 / n2
            return divi1
        }
        fun pot (n1:Double, n2: Double): Double{
            var pot1 = Math.pow(n1,n2)
            return  pot1

        }
        fun raiz( n1: Double): Double{
           var raiz1 = sqrt(n1)
            return raiz1

        }

}
}