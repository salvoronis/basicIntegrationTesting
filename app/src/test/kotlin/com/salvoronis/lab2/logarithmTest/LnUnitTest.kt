package com.salvoronis.lab2.logatithmTest

import com.salvoronis.lab2.logatithm.Ln
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertAll
import kotlin.math.E

class LnUnitTests {
    val ln = Ln()

    @Test
    fun `ln base test`() = assertEquals(1.0, ln(E), 0.001)

    @Test
    fun `ln test`() = assertAll(
        { assertEquals(0.0, ln(1.0))},
        { assertEquals(0.69314718, ln(2.0), 0.01)},
        { assertEquals(1.0986123, ln(3.0), 0.01)},
        { assertEquals(1.38644, ln(4.0), 0.01)},
        { assertEquals(1.60379, ln(5.0), 0.01)}
    )

    @Test
    fun `ln exceptions tests`() = assertAll(
        { assertEquals(Double.NaN, ln(-1.0)) },
        { assertEquals(Double.NaN, ln(-0.1)) }
    )
}