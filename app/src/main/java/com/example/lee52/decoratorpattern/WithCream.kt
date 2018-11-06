package com.example.lee52.decoratorpattern

class WithCream(coffee: Coffee): CoffeeDecorator(coffee) {
    override fun getCost() = super.getCost() + 0.2

    override fun getIngredients() = "${super.getIngredients()}, Cream"
}