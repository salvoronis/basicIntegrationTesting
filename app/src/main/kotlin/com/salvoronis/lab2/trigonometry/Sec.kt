package com.salvoronis.lab2.trigonometry

class Sec: TrigonometryInterface {
    val cos = Cos()

    override fun invoke(x: Double): Double = if (x.isException) x else 1/cos(x)
}