package com.salvoronis.lab2.function

import kotlin.math.pow
import com.salvoronis.lab2.logatithm.*
import com.salvoronis.lab2.trigonometry.*

class MainFun: IMainFun {
    var tan = Tan()
    var sec = Sec()
    var csc = Csc()
    var log2 = Log()
    var log5 = Log()
    var log10 = Log()
    var ln = Ln()

    override fun invoke(x: Double): Double {
        return if (x <= 0.0)
            (tan(x) * sec(x)).pow(3.0) * csc(x).pow(3)
        else
            ((((log10(x,10.0)*log5(x,5.0)) * log2(x,2.0)).pow(3)) / log10(x,10.0)) / (ln(x)/(ln(x)+log10(x,10.0)))
    }
}