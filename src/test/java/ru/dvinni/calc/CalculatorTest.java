package ru.dvinni.calc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void addition() {
        assertEquals(7, Calculator.addition(5, 2));
    }

    @Test
    void subtraction() {
        assertEquals(6, Calculator.subtraction(10, 4));
    }

    @Test
    void multiplication() {
        assertEquals(45, Calculator.multiplication(9,5));
    }

    @Test
    void division() {
        assertEquals(9, Calculator.division(27, 3));
    }
}
