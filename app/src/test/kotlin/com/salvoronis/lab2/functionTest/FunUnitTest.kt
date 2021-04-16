package com.salvoronis.lab2.functionTest

import com.salvoronis.lab2.function.MainFun
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals

class FunUnitTest {
    var function = MainFun()

    @Test
    fun `main function test`() = assertAll(
        { assertEquals(Double.NaN, function(0.0)) }
    )

    @Test
    fun `main function less than 0 test`() = assertAll(
        { assertEquals(2.1891326971918352, function(-0.500000), 0.001) },
        { assertEquals(1.6378331141629177, function(-0.400000), 0.001) },
        { assertEquals(1.3154119477753303, function(-0.300000), 0.001) },
        { assertEquals(1.1284088080470274, function(-0.200000), 0.001) },
        { assertEquals(1.0305058598858596, function(-0.100000), 0.001) },
    )

    @Test
    fun `main function above 0 test`() = assertAll(
        { assertEquals(153.96959092935364, function(0.100000), 0.001) },
        { assertEquals(8.772093786299273, function(0.200000), 0.001) },
        { assertEquals(0.8602860148084147, function(0.300000), 0.001) },
        { assertEquals(0.09682238950629961, function(0.400000), 0.001) },
        { assertEquals(0.010382767635646205, function(0.500000), 0.001) },
    )
}