package com.salvoronis.lab2

import kotlin.math.PI
import com.salvoronis.lab2.function.*
import com.salvoronis.lab2.trigonometry.*
import com.salvoronis.lab2.logatithm.*
import com.salvoronis.lab2.csv.CSVGenerator

fun main() {
    val generator = CSVGenerator()
    val ln = Ln()
    val log = Log()
    val cos = Cos()
    val sin = Sin()
    val csc = Csc()
    val sec = Sec()
    val tan = Tan()

    generator.setFilePath("test-log2-0.1-0.1-1-result")
    generator.generate(log, 0.1, 0.1, 1.0, 0.1, 2.0)

    generator.setFilePath("test-log5-0.1-0.1-1-result")
    generator.generate(log, 0.1, 0.1, 1.0, 0.1, 5.0)

    generator.setFilePath("test-log10-0.1-0.1-1-result")
    generator.generate(log, 0.1, 0.1, 1.0, 0.1, 10.0)

    generator.setFilePath("test-ln-0.1-0.1-1-result")
    generator.generate(ln, 0.1, 0.1, 1.0, 0.1)

    generator.setFilePath("test-sin-0.1-0-2pi-result")
    generator.generate(sin, 0.1, 0.0, 2 * PI)

    generator.setFilePath("test-cos-0.1-0-2pi-result")
    generator.generate(cos, 0.1, 0.0, 2 * PI)

    generator.setFilePath("test-cos-0.1--1-2pi-result")
    generator.generate(cos, 0.1, -1.0, 2*PI)

    generator.setFilePath("test-csc-0.1-0-2pi-result")
    generator.generate(csc, 0.1, 0.0, 2 * PI)

    generator.setFilePath("test-csc-0.1--1-2pi-result")
    generator.generate(csc, 0.1, -1.0, 2*PI)

    generator.setFilePath("test-sec-0.1-0-2pi-result")
    generator.generate(sec, 0.1, 0.0, 2 * PI)

    generator.setFilePath("test-sec-0.1--1-2pi-result")
    generator.generate(sec, 0.1, -1.0, 2*PI)

    generator.setFilePath("test-tan-0.1-0-2pi-result")
    generator.generate(tan, 0.1, 0.0, 2 * PI)

    generator.setFilePath("test-tan-0.1--1-2pi-result")
    generator.generate(tan, 0.1, -1.0, 2*PI)
}
