package com.example.lee52.decoratorpattern

class WithMilk(coffee: Coffee): CoffeeDecorator(coffee) {
    override fun getCost() = super.getCost() + 0.5

    override fun getIngredients() = "${super.getIngredients()}, Milk"
}