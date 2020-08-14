package com.example.demo.component.calculator

class DivisionService : RpnCalculator {
    override fun calc(secondValue: Double, firstValue: Double): Double {
        return secondValue / firstValue
    }
}
