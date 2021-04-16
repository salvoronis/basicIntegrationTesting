package com.salvoronis.lab2.csv

import com.salvoronis.lab2.logatithm.ILn
import com.salvoronis.lab2.logatithm.ILog
import com.salvoronis.lab2.trigonometry.TrigonometryInterface
import java.io.FileOutputStream
import java.io.PrintStream
import java.nio.file.Files.createDirectories
import java.nio.file.Path
import java.nio.file.Paths
import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.io.path.createTempDirectory

class CSVGenerator(_filepath: String = "src/test/resources/results/") {
    private var filepath = _filepath
    private var filename = "result.csv"
    fun setFilePath(filename: String) {
        this.filename = "${filename}.csv"
    }

    fun generate(func: ILn, step: Double, lowerBound: Double, upperBound: Double, precision: Double) {
        createDirectories(Paths.get(filepath))
        val printStream = PrintStream(FileOutputStream(filepath + filename, true))
        printStream.use {
            var x = lowerBound
            while (x < upperBound) {
                val result = func(x, precision)
                val csvString = String.format(Locale.US, "%f, %f", x, result)
                printStream.println(csvString)
                x += step
            }
        }
    }

    fun generate(func: ILog, step: Double, lowerBound: Double, upperBound: Double, base: Double) {
        createDirectories(Paths.get(filepath))
        val printStream = PrintStream(FileOutputStream(filepath + filename, true))
        printStream.use {
            var x = lowerBound
            while (x < upperBound) {
                val result = func(x, base)
                val csvString = String.format(Locale.US, "%f, %f", x, result)
                printStream.println(csvString)
                x += step
            }
        }
    }

    fun generate(func: TrigonometryInterface, step: Double, lowerBound: Double, upperBound: Double) {
        createDirectories(Paths.get(filepath))
        val printStream = PrintStream(FileOutputStream(filepath + filename, true))
        printStream.use {
            var x = lowerBound
            while (x < upperBound) {
                val result = func(x)
                val csvString = String.format(Locale.US, "%f, %f", x, result)
                printStream.println(csvString)
                x += step
            }
        }
    }
}