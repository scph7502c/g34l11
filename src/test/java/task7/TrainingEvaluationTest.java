package task7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainingEvaluationTest {

    @ParameterizedTest
    @CsvSource({
            "29, 280, 190, Niska",
            "30, 240, 168, Dobra",
            "45, 350, 165, Bardzo dobra",
            "90, 500, 119, Doskonała"
    })
    public void testEvaluateTraining(int length, int calories, int heartRate, String expectedEfficiency) {
        TrainingEvaluation evaluation = new TrainingEvaluation();
        String efficiency = evaluation.evaluateTrainingEfficiency(length, calories, heartRate);

        assertEquals(expectedEfficiency, efficiency);
    }
}