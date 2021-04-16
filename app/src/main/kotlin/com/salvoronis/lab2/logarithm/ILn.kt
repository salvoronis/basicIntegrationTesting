package com.salvoronis.lab2.logatithm

import kotlin.math.absoluteValue

interface ILn {
    companion object {
        const val MAX_ITERATIONS = 1000000
    }

    val Double.isException: Boolean
        get() = this in setOf(Double.NaN, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY)
    
    fun Double.normalize(accuracy: Double) = if (this.absoluteValue - 0.0 < accuracy) 0.0 else this

    operator fun invoke(x: Double, precision: Double = 0.000000001): Double
}