package com.salvoronis.lab2.logatithm

import kotlin.math.absoluteValue
import kotlin.math.pow

class Ln: ILn {
    override fun invoke(x: Double, precision: Double): Double {
        return if (x < 0 || x.isException) Double.NaN else if (x == 0.0) Double.NEGATIVE_INFINITY else {
            val isAbsLessThen1 = (x - 1).absoluteValue <= 1
            val raw = generateSequence(0.0 to 1) {
                it.first - ((-1.0).pow(it.second) * (x - 1).pow(if (isAbsLessThen1) it.second else -it.second) / it.second) to it.second + 1
            }.takeWhile { precision <= (it.first - precision).absoluteValue && it.second < ILn.MAX_ITERATIONS }.toList().last().first
            if (isAbsLessThen1) raw else raw + invoke(x - 1)
        }
    }
}