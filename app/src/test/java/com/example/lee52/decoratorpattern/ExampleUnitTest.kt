package com.example.lee52.decoratorpattern

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    lateinit var coffee: Coffee
    lateinit var withMilk: Coffee
    lateinit var withCream: Coffee

    @Before
    fun setup() {
        coffee = SimpleCoffee()
        withMilk = WithMilk(coffee)
        withCream = WithCream(withMilk)
    }

    @Test
    fun printSimpleCoffee() {
        println("Cost: ${coffee.getCost()}\nIngredients: ${coffee.getIngredients()}\n-------------------------")
        assert(true)
    }

    @Test
    fun printWithMilk() {
        println("Cost: ${withMilk.getCost()}\nIngredients: ${withMilk.getIngredients()}\n-------------------------")
        assert(true)
    }

    @Test
    fun printWithCream() {
        println("Cost: ${withCream.getCost()}\nIngredients: ${withCream.getIngredients()}\n-------------------------")
        assert(true)
    }
}
