package com.salvoronis.lab2.trigonometryTest

import com.salvoronis.lab2.trigonometry.Sin
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.math.PI
import kotlin.math.sqrt

class SinUnitTest {
    var sin = Sin()

    @Test
    fun `_sin(x) random dots test`() = assertAll(
        {assertEquals(0.09983341664682815, sin(0.1), 0.001)},
        {assertEquals(0.8414709848079, sin(1.0), 0.001)}
    )

    @Test
    fun `_sin(x) border point test`() = assertAll(
        {assertEquals(-0.0009999998333333417, sin(-0.001), 0.001)},
        {assertEquals(0.0, sin(0.0), 0.001)},
        {assertEquals(0.0009999998333333417, sin(0.001), 0.001)},

        {assertEquals(0.9999995000000417, sin(PI / 2 + 0.001), 0.001)},
        {assertEquals(1.0, sin(PI / 2), 0.001)},
        {assertEquals(0.9999995000000417, sin(PI / 2 - 0.001), 0.001)},

        {assertEquals(-0.00999983333416633, sin(PI + 0.01), 0.01)},
        {assertEquals(0.0, sin(PI), 0.01)},
        {assertEquals(0.009999833334166574, sin(PI - 0.01), 0.01)},

        {assertEquals(-0.99999950000004166665, sin(-PI / 2), 0.001)},
        {assertEquals(-1.0, sin(-PI / 2), 0.001)},
        {assertEquals(-0.99999950000004166668, sin(-PI / 2), 0.001)},
    )

    @Test
    fun `_sin(x) first quarter test`() = assertAll(
        {assertEquals(0.5, sin(PI / 6), 0.001)},
        {assertEquals(sqrt(2.0)/2, sin(PI / 4), 0.001)},
        {assertEquals(sqrt(3.0)/2, sin(PI / 3), 0.001)}
    )

    @Test
    fun `_sin(x) second quarter test`() = assertAll(
        {assertEquals(0.5, sin(5 * PI / 6), 0.001)},
        {assertEquals(sqrt(2.0)/2, sin(3 * PI / 4), 0.001)},
        {assertEquals(sqrt(3.0)/2, sin(2 * PI / 3), 0.001)}
    )

    @Test
    fun `_sin(x) third quarter test`() = assertAll(
        {assertEquals(-0.5, sin(7 * PI / 6), 0.01)},
        {assertEquals(-sqrt(2.0)/2, sin(5 * PI / 4), 0.1)},
        {assertEquals(-sqrt(3.0)/2, sin(4 * PI / 3), 0.1)}
    )

    @Test
    fun `_sin(x) forth quarter test`() = assertAll(
        {assertEquals(-0.5, sin(-0.523599), 0.001)},
        {assertEquals(-sqrt(2.0)/2, sin(-0.7853981633974486), 0.001)},
        {assertEquals(-sqrt(3.0)/2, sin(-1.04719), 0.001)}
    )

    @Test
    fun `_sin(x) infinity test`() = assertAll(
        {assertEquals(Double.NEGATIVE_INFINITY, sin(Double.NEGATIVE_INFINITY))},
        {assertEquals(Double.POSITIVE_INFINITY, sin(Double.POSITIVE_INFINITY))},
        {assertEquals(Double.NaN, sin(Double.NaN))},
    )
}