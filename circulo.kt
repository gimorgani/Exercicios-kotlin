
import kotlin.math.PI

fun main(){

    print(" Digite o diâmetro do circulo: ")
    var diametro = readln()!!.toInt()

    var area = PI *(diametro*diametro/4)

    var perimetro = diametro * PI



    println(" A area do circulo é: ${"%.2f". format(area)}  e o perimetro é: ${"%.2f".format(perimetro)}")
}

