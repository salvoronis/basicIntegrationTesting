package com.salvoronis.lab2.trigonometry

interface TrigonometryInterface {
    val Double.isException: Boolean
        get() = this in setOf(Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY)

    operator fun invoke(x: Double): Double
}