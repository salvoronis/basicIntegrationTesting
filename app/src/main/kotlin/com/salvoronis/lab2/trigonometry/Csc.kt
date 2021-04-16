package com.salvoronis.lab2.trigonometry

class Csc: TrigonometryInterface {
    var sin = Sin()

    override fun invoke(x: Double): Double = if (x.isException) x else 1/sin(x)
}