package com.example.demo.component.calculator

import java.lang.IllegalArgumentException
import java.util.*

class RpnCalculatorService {

    fun calculate(values: List<String>): Double {
        if (isInteger(values.last())) {
            throw IllegalArgumentException("Incorrect syntax")
        }

        val stack = Stack<Double>()
        var final = 0.0
        values.forEach {
            if (isInteger(it)) {
                stack.push(it.toDouble())
            } else {
                when(it) {
                    "+" -> {
                        final = AdditionService().calc(stack.pop(), stack.pop())
                        stack.push(final)
                    }
                    "-" -> {
                        final = SubtractionService().calc(stack.pop(), stack.pop())
                        stack.push(final)
                    }
                    "*" -> {
                        final = MultiplicationService().calc(stack.pop(), stack.pop())
                        stack.push(final)
                    }
                    "/" -> {
                        final = DivisionService().calc(stack.pop(), stack.pop())
                        stack.push(final)
                    }
                }
            }
        }

      return final
    }

    fun isInteger(value: String): Boolean = when(value.toDoubleOrNull()) {
            null -> false
            else -> true
        }

    fun calculateFactorial(firstValue: Int): Double {
        var initValue = 1

        for (x in initValue..firstValue) {
            initValue *= x
        }

        return initValue.toDouble()
    }

    fun calculatePercentage(value: Int): Double {
        val total = 100.00

        return value.toDouble() / total
    }
}
