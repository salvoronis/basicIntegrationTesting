package com.salvoronis.lab2.logarithmTest

import com.salvoronis.lab2.logatithm.*
import org.mockito.Mockito
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource

class LnIntegrationTest {
    val lnMock = Mockito.mock(Ln::class.java)

    @DisplayName("log integration")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-ln-0.1-0.1-1-result.csv"])
    fun `log integration with ln integration test`(value: Double, answer: Double) {
        val logTrue = Log()
        Mockito.`when`(lnMock(value)).thenReturn(answer)
        assertEquals(lnMock(value) / lnMock(value), logTrue(value, value))
    }
}