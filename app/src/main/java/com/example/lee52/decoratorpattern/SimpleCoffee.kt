package com.example.lee52.decoratorpattern

class SimpleCoffee: Coffee {
    override fun getCost(): Double = 1.0

    override fun getIngredients() = "Coffee"
}