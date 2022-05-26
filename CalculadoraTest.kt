import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.math.sqrt

internal class CalculadoraTest {

    @Test
    fun somaTest() {

    assertEquals(4,Calculadora.soma(2,2))
    }

    @Test
    fun subTest() {

        assertEquals(4, Calculadora.sub(6, 2))
    }

    @Test
    fun multTest() {

        assertEquals(15,Calculadora.mult(5,3) )
    }

    @Test
    fun diviTest() {

        assertEquals(8,Calculadora.divi(16,2))
    }

    @Test
    fun potTest() {

        assertEquals(16.0,Calculadora.pot(4.0,2.0))
    }

    @Test
    fun raizTest() {

        assertEquals(12.0,Calculadora.raiz(144.0))
    }
}