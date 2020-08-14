package com.example.demo.component.calculator

class AdditionService : RpnCalculator {
    override fun calc(secondValue: Double, firstValue: Double): Double {
        return secondValue + firstValue
    }
}
