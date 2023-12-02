package task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UpperCaseTest {

    private final UpperCase textCheck = new UpperCase();

    @ParameterizedTest
    @ValueSource(strings = {"test", "hello", "Java"})
    void testConvertToUpperCase(String input) {
        String result = textCheck.convertToUpperCase(input);
        assertEquals(input.toUpperCase(), result);
    }

    @Test
    void testConvertToUpperCaseWithNull() {
        assertNull(textCheck.convertToUpperCase(null));
    }

    @Test
    void testConvertToUpperCaseWithEmptyString() {
        assertEquals("", textCheck.convertToUpperCase(""));
    }
}