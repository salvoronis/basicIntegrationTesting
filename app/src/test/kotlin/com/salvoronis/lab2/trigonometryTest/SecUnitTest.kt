package com.salvoronis.trigonometryTest

import com.salvoronis.lab2.trigonometry.Sec
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.math.PI
import kotlin.math.sqrt

class SecUnitTest {
    val sec = Sec()

    @Test
    fun `sec test`() = assertAll(
        { assertEquals(2.0/sqrt(3.0), sec(PI / 6), 0.01) },
        { assertEquals(sqrt(2.0), sec(PI / 4), 0.01) },
        { assertEquals(2.0, sec(PI / 3), 0.01) },
        { assertEquals(1.0, sec(0.0), 0.01) }
    )

    @Test
    fun `sec infinity test`() = assertAll(
        { assertEquals(Double.POSITIVE_INFINITY, sec(Double.POSITIVE_INFINITY)) },
        { assertEquals(Double.NEGATIVE_INFINITY, sec(Double.NEGATIVE_INFINITY)) },
        { assertEquals(Double.NaN, sec(Double.NaN)) }
    )
}