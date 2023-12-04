package task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class NumbersTest {

    private Numbers numberCheck;

    @BeforeEach
    void setUp() {
        numberCheck = new Numbers();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void testIsDivisibleByTwo(int number) {
        assertTrue(numberCheck.isDivisibleByTwo(number));
    }

    @ParameterizedTest
    @CsvSource({
            "432, 9",
            "12345, 15",
            "876, 21"
    })
    void testSumOfDigits(int number, int expectedSum) {
        assertEquals(expectedSum, numberCheck.sumOfDigits(number));
    }

    @Test
    void testIsDivisibleByTwoWithOddNumber() {
        assertFalse(numberCheck.isDivisibleByTwo(7));
    }

    @Test
    void testSumOfDigitsWithSingleDigit() {
        assertEquals(9, numberCheck.sumOfDigits(9));
    }
}