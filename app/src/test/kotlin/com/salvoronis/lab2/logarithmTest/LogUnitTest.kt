package com.salvoronis.lab2.logatithmTest

import com.salvoronis.lab2.logatithm.Log
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.api.Assertions.assertEquals

class LogUnitTests {
    val log = Log()

    @Test
    fun `log() base test`() = assertAll(
        { assertEquals(1.0, log(2.0, 2.0), 0.1) },
        { assertEquals(1.0, log(3.0, 3.0), 0.1) },
        { assertEquals(1.0, log(4.0, 4.0), 0.1) }
    )

    @Test
    fun `log() test`() = assertAll(
        { assertEquals(0.6309, log(2.0, 3.0), 0.001)},
        { assertEquals(1.2618, log(4.0, 3.0), 0.001)},
        { assertEquals(1.4649, log(5.0, 3.0), 0.001)},
        { assertEquals(1.6309, log(6.0, 3.0), 0.001)},
    )
}