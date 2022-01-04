package ru.clevertec;

public class StringUtils {
    public boolean isPositiveNumber(String str) {
        return org.apache.commons.lang3.StringUtils.isNumeric(str);
    }
}
