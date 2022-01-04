package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    public void whenPositiveNumber_thenCorrect() {
        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isPositiveNumber("123"));
        assertFalse(stringUtils.isPositiveNumber("-123"));
        assertFalse(stringUtils.isPositiveNumber("www"));
    }
}
