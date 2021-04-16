package com.salvoronis.lab2.logatithm

class Log: ILog {
    var ln = Ln()

    override fun invoke(x: Double, base: Double, precision: Double): Double {
        return if (x < 0 || x.isException) Double.NaN else if (x == 0.0) Double.POSITIVE_INFINITY else
            ln(x) / ln(base)
    }
}