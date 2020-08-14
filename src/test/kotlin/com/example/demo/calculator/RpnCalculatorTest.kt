package com.example.demo.calculator

import com.example.demo.component.calculator.RpnCalculatorService
import junit.framework.TestCase.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import java.lang.IllegalArgumentException
import java.util.*

class RpnCalculatorTest {

    @get:Rule
    @JvmField
    var thrown = ExpectedException.none()

    private lateinit var service: RpnCalculatorService

    @Test
    fun `rpm - factorial`() {
        val result = RpnCalculatorService().calculateFactorial(3)

        assertEquals(6.0, result)
    }

    @Test
    fun `rpn - percentage`() {
        val result = RpnCalculatorService().calculatePercentage(30)

        assertEquals(0.3, result)
    }

    @Test
    fun `rpn - check is integer`() {
        val result = RpnCalculatorService().isInteger("5")
        val result2 = RpnCalculatorService().isInteger("!")

        assertEquals(true, result)
        assertEquals(false, result2)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `rpn - calculate list with wrong syntax`() {
        val list = listOf("2", "3")

        RpnCalculatorService().calculate(list)
    }

    @Test
    fun `rpn - calculate`() {
        val list = listOf("1", "2", "3", "+", "+")

        val result = RpnCalculatorService().calculate(list)

        assertEquals(6.0, result)
    }

    @Test
    fun `rpn - calculate minus`() {
        val list = listOf("2", "1", "-")
        
        val result = RpnCalculatorService().calculate(list)

        assertEquals(-1.0, result)
    }

    @Test
    fun `rpn - calculate multiply`() {
        val list = listOf("2", "4", "*")

        val result = RpnCalculatorService().calculate(list)

        assertEquals(8.0, result)
    }

    @Test
    fun `rpn - calculate divide`() {
        val list = listOf("3", "6", "/")

        val result = RpnCalculatorService().calculate(list)

        assertEquals(2.0, result)
    }
}
