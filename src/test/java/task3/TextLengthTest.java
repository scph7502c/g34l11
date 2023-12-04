package task3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TextLengthTest {

    private TextLength textLengthCheck;

    @BeforeEach
    void setUp() {
        textLengthCheck = new TextLength();
    }

    static Stream<Arguments> textProvider() {
        return Stream.of(arguments("Zadanie", 7), arguments("Domowe", 6), arguments("Java", 4), arguments("", 0), arguments(null, 0));
    }

    @ParameterizedTest
    @MethodSource("textProvider")
    void testGetTextLength(String input, int expectedLength) {
        assertEquals(expectedLength, textLengthCheck.getTextLength(input));
    }
}