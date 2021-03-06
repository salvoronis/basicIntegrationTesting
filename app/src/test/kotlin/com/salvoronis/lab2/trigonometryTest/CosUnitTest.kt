package com.salvoronis.trigonometryTest

import com.salvoronis.lab2.trigonometry.Cos
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.math.PI
import kotlin.math.sqrt

class CosUnitTest {
    val cos = Cos()

    @Test
    fun `cos first quarter test`() = assertAll(
        {assertEquals(sqrt(3.0) / 2, cos(PI / 6), 0.1)},
        {assertEquals(sqrt(2.0) / 2, cos(PI / 4), 0.1)},
        {assertEquals(0.5, cos(PI / 3), 0.1)}
    )

    @Test
    fun `cos second quarter test`() = assertAll(
        { assertEquals(-0.5, cos(2 * PI / 3), 0.1) },
        { assertEquals(-sqrt(2.0) / 2, cos(3 * PI / 4), 0.1) },
        { assertEquals(-sqrt(3.0) / 2, cos(5 * PI / 6), 0.1) }
    )

    @Test
    fun `cos infinity test`() = org.junit.jupiter.api.assertAll(
        { assertEquals(Double.NEGATIVE_INFINITY, cos(Double.NEGATIVE_INFINITY)) },
        { assertEquals(Double.POSITIVE_INFINITY, cos(Double.POSITIVE_INFINITY)) },
        { assertEquals(Double.NaN, cos(Double.NaN)) }
    )
}