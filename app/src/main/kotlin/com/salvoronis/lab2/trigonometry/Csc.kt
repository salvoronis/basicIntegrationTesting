package com.salvoronis.lab2.trigonometry

class Csc: TrigonometryInterface {
    val sin = Sin()

    override fun invoke(x: Double): Double = if (x.isException) x else 1/sin(x)
}