package com.salvoronis.lab2.function

import kotlin.math.pow
import com.salvoronis.lab2.logatithm.*
import com.salvoronis.lab2.trigonometry.*

class MainFun: IMainFun {
    val tan = Tan()
    val sec = Sec()
    val csc = Csc()
    val log = Log()
    val ln = Ln()

    override fun invoke(x: Double): Double {
        return if (x <= 0.0)
            (tan(x) * sec(x)).pow(3.0) * csc(x).pow(3)
        else
            ((((log(x,10.0)*log(x,5.0)) * log(x,2.0)).pow(3)) / log(x,10.0)) / (ln(x)/(ln(x)+log(x,10.0)))
    }
}