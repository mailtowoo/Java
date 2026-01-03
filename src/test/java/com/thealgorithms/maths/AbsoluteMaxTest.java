package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AbsoluteMaxTest {

    @Test
    void testGetMaxValue() {
        assertEquals(16, AbsoluteMax.getMaxValue(-2, 0, 16));
        assertEquals(-22, AbsoluteMax.getMaxValue(-3, -10, -22));
        assertEquals(-888, AbsoluteMax.getMaxValue(-888));
    }

    @Test
    void testGetMaxValueWithNoArguments() {
        assertThrows(IllegalArgumentException.class, AbsoluteMax::getMaxValue);
    }

    @Test
    void testGetMaxValue_withPositiveNumbersOnly() {
        int result = AbsoluteMax.getMaxValue(1, 5, 3, 9, 2);
        assertEquals(9, result);
    }

    @Test
    void testGetMaxValue_withNegativeNumbersOnly() {
        int result = AbsoluteMax.getMaxValue(-1, -5, -3, -9, -2);
        assertEquals(-9, result); // Returns -9 with largest absolute value
    }
}
