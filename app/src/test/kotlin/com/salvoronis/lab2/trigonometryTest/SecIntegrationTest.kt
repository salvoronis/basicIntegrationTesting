package com.salvoronis.lab2.trigonometryTest

import com.salvoronis.lab2.trigonometry.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource
import org.mockito.Mockito
import kotlin.math.PI
import kotlin.test.assertEquals

class SecIntegrationTests {
    val cosMock = Mockito.mock(Cos::class.java)

    @DisplayName("Cos test")
    @ParameterizedTest
    @CsvFileSource(resources = ["/results/test-cos-0.1-0-2pi-result.csv"])
    fun `sec integration with cos test` (value: Double, answer: Double) {
        val sec = Sec().apply { cos = cosMock }
        Mockito.`when`(cosMock(value)).thenReturn(answer)
        assertEquals(1.0/cosMock(value), sec(value) )
    }
}