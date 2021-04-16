package com.salvoronis.lab2.trigonometry

class Tan: TrigonometryInterface {
    var sin = Sin()
    var cos = Cos()

    override fun invoke(x: Double): Double = if (x.isException) x else sin(x)/cos(x)
}