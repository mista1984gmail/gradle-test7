package com.mitskevich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class UtilsTest {

    @Test
    void isAllPositiveNumbersTrue() {
        assertTrue(Utils.isAllPositiveNumbers("79", "12"));
    }
    @Test
    void isAllPositiveNumbersContainsNull() {
        assertFalse(Utils.isAllPositiveNumbers(null, "12"));
    }
    @Test
    void isAllPositiveNumbersContainsEmptyElement() {
        assertFalse(Utils.isAllPositiveNumbers("123", "", "12"));
    }
    @Test
    void isAllPositiveNumbersContainsNegativeNumber() {
        assertFalse(Utils.isAllPositiveNumbers("123", "56", "-12"));
    }
    @Test
    void isAllPositiveNumbersContainsZero() {
        assertFalse(Utils.isAllPositiveNumbers("123", "0", "12"));
    }
    @Test
    void isAllPositiveNumbersContainsLetters() {
        assertFalse(Utils.isAllPositiveNumbers("123", "0", "1tr2"));
    }
}