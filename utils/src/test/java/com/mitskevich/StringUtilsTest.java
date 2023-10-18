package com.mitskevich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @Test
    void isPositiveNumberNull() {
        assertFalse(StringUtils.isPositiveNumber(null));
    }
    @Test
    void isPositiveNumberEmpty() {
        assertFalse(StringUtils.isPositiveNumber(""));
    }
    @Test
    void isPositiveNumberZero() {
        assertFalse(StringUtils.isPositiveNumber("0"));
    }
    @Test
    void isPositiveNumberTrue() {
        assertTrue(StringUtils.isPositiveNumber("123"));
    }
    @Test
    void isPositiveNumberPassNegativeNumber() {
        assertFalse(StringUtils.isPositiveNumber("-1234"));
    }
    @Test
    void isPositiveNumberPassLetter() {
        assertFalse(StringUtils.isPositiveNumber("123g4"));
    }
}