package com.example.lee52.decoratorpattern

abstract class CoffeeDecorator(protected val decoratedCoffee: Coffee): Coffee {
    override fun getCost() = decoratedCoffee.getCost()

    override fun getIngredients() = decoratedCoffee.getIngredients()
}