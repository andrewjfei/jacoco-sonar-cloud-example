package dev.andrewjfei.jacoco.sonar.cloud.example.utils;

import org.junit.jupiter.api.Test;

import static dev.andrewjfei.jacoco.sonar.cloud.example.utils.NumberUtil.add;
import static dev.andrewjfei.jacoco.sonar.cloud.example.utils.NumberUtil.max;
import static dev.andrewjfei.jacoco.sonar.cloud.example.utils.NumberUtil.min;
import static dev.andrewjfei.jacoco.sonar.cloud.example.utils.NumberUtil.subtract;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberUtilTest {

    @Test
    public void testAdd_returnsCorrectResult() {
        int a = 3;
        int b = 5;
        int expected = 8;

        int result = add(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testSubstract_returnsCorrectResult() {
        int a = 7;
        int b = 2;
        int expected = 5;

        int result = subtract(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testMax_valueAMax_returnsCorrectResult() {
        int a = 6;
        int b = 1;
        int expected = 6;

        int result = max(a, b);

        assertEquals(expected, result);
    }


    @Test
    public void testMax_valueBMax_returnsCorrectResult() {
        int a = 2;
        int b = 3;
        int expected = 3;

        int result = max(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testMin_valueAMin_returnsCorrectResult() {
        int a = 2;
        int b = 3;
        int expected = 2;

        int result = min(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testMin_valueBMin_returnsCorrectResult() {
        int a = 9;
        int b = 6;
        int expected = 6;

        int result = min(a, b);

        assertEquals(expected, result);
    }

}
