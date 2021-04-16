package com.salvoronis.lab2.trigonometry

import kotlin.math.*

class Sin: TrigonometryInterface {
    val fact: (Int) -> Int = {(1 .. it).fold(1) {acc, i -> acc * i}}

    override fun invoke(x: Double): Double {
        return if (x.isException) x else
        generateSequence(0){n -> n + 1}
        .take(7)
        .map { n -> ((-1.0).pow(n) * x.pow(2 * n + 1)) / fact(2 * n + 1) }
        .sum()
    }
}