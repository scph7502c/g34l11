package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextLengthTest {

    private TextLength textLengthCheck;

    @BeforeEach
    void setUp() {
        textLengthCheck = new TextLength();
    }

    static Object[][] textProvider() {
        return new Object[][]{{"Zadanie", 7}, {"Domowe", 6}, {"Java", 4}, {"", 0}, {null, 0}};
    }

    @ParameterizedTest
    @MethodSource("textProvider")
    void testGetTextLength(String input, int expectedLength) {
        assertEquals(expectedLength, textLengthCheck.getTextLength(input));
    }
}