package com.salvoronis.lab2.trigonometryTest

import com.salvoronis.lab2.trigonometry.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource
import org.mockito.Mockito
import kotlin.math.PI
import kotlin.test.assertEquals

class CscIntegrationTests {
    val sinMock = Mockito.mock(Sin::class.java)

    @DisplayName("Cos test")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-sin-0.1-0-2pi-result.csv"])
    fun `csc integration with sin test` (value: Double, answer: Double) {
        val csc = Csc().apply { sin = sinMock }
        Mockito.`when`(sinMock(value)).thenReturn(answer)
        assertEquals(1.0/sinMock(value), csc(value) )
    }
}