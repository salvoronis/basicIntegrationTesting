package com.salvoronis.lab2.functionTest

import com.salvoronis.lab2.function.MainFun
import com.salvoronis.lab2.trigonometry.*
import com.salvoronis.lab2.logatithm.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource
import org.junit.jupiter.api.Assertions.assertEquals
import org.mockito.Mockito
import kotlin.math.PI
import kotlin.math.pow

class FunIntegrationTest {
    val secMock = Mockito.mock(Sec::class.java)
    val cscMock = Mockito.mock(Csc::class.java)
    val tanMock = Mockito.mock(Tan::class.java)
    val log2Mock = Mockito.mock(Log::class.java)
    val log5Mock = Mockito.mock(Log::class.java)
    val log10Mock = Mockito.mock(Log::class.java)
    var sec = Sec()
    var tan = Tan()
    var csc = Csc()
    var ln = Ln()
    var log2 = Log()
    var log5 = Log()
    var log10 = Log()

    @DisplayName("main integration test tan")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-tan-0.1--1-2pi-result.csv"])
    fun `main test tan`(value: Double, answer: Double) {
        val main = MainFun().apply { tan = tanMock }
        Mockito.`when`(tanMock(value)).thenReturn(answer)
        if (value <= 0) {
            assertEquals((tanMock(value) * sec(value)).pow(3.0) * csc(value).pow(3.0), main(value))
        }
    }

    @DisplayName("main integration test sec")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-sec-0.1--1-2pi-result.csv"])
    fun `main test sec`(value: Double, answer: Double) {
        val main = MainFun().apply { sec = secMock }
        Mockito.`when`(secMock(value)).thenReturn(answer)
        if (value <= 0) {
            assertEquals((tan(value) * secMock(value)).pow(3.0) * csc(value).pow(3.0), main(value))
        }
    }

    @DisplayName("main integration test csc")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-csc-0.1--1-2pi-result.csv"])
    fun `main test csc`(value: Double, answer: Double) {
        val main = MainFun().apply { csc = cscMock }
        Mockito.`when`(cscMock(value)).thenReturn(answer)
        if (value <= 0) {
            assertEquals((tan(value) * sec(value)).pow(3.0) * cscMock(value).pow(3.0), main(value))
        }
    }

    @DisplayName("main integration test log2")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-log2-0.1-0.1-1-result.csv"])
    fun `main test log2`(value: Double, answer: Double) {
        print("log2 ")
        val main = MainFun().apply { log2 = log2Mock }
        Mockito.`when`(log2Mock(value, 2.0)).thenReturn(answer)
        if (value > 0)
            assertEquals(
                ((((log10(value,10.0)*log5(value,5.0)) * log2Mock(value,2.0)).pow(3)) / log10(value,10.0)) / (ln(value)/(ln(value)+log10(value,10.0))),
                main(value),
                0.1
            )
    }

    @DisplayName("main integration test log5")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-log5-0.1-0.1-1-result.csv"])
    fun `main test log5`(value: Double, answer: Double) {
        print("log5 ")
        val main = MainFun().apply { log5 = log5Mock }
        Mockito.`when`(log5Mock(value,5.0)).thenReturn(answer)
        if (value > 0)
            assertEquals(
                ((((log10(value,10.0)*log5Mock(value,5.0)) * log2(value,2.0)).pow(3)) / log10(value,10.0)) / (ln(value)/(ln(value)+log10(value,10.0))),
                main(value),
                0.1
            )
    }

    /* @DisplayName("main integration test log10")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-log10-0.1-0.1-1-result.csv"])
    fun `main test log10`(value: Double, answer: Double) {
        print("log10 ")
        val main = MainFun().apply { log10 = log10Mock }
        Mockito.`when`(log10Mock(value,10.0)).thenReturn(answer)
        if (value > 0)
            assertEquals(
                ((((log10Mock(value,10.0)*log5(value,5.0)) * log2(value,2.0)).pow(3)) / log10Mock(value,10.0)) / (ln(value)/(ln(value)+log10Mock(value,10.0))),
                main(value),
                0.001
            )
    } */
}