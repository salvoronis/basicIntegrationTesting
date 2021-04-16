package com.salvoronis.lab2.trigonometry

import kotlin.math.PI

class Cos: TrigonometryInterface {
    var sin = Sin()

    override fun invoke(x: Double): Double  = if (x.isException) x else sin(x + PI/2.0)
}