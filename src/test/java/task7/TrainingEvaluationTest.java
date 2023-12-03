package task7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainingEvaluationTest {

    @ParameterizedTest
    @CsvSource({
            "29, 280, 190, 1.0, Niska",
            "30, 240, 168, 1.7, Dobra",
            "45, 350, 165, 2.0, Bardzo dobra",
            "90, 500, 119, 3.0, Doskonała"
    })
    public void testEvaluateTraining(int length, int calories, int heartRate, double expectedScore, String expectedEfficiency) {
        TrainingEvaluation evaluation = new TrainingEvaluation();
        double score = evaluation.evaluateTraining(length, calories, heartRate);
        String efficiency = evaluation.evaluateTrainingEfficiency(score);

        assertEquals(expectedScore, score, 0.01);
        assertEquals(expectedEfficiency, efficiency);
    }
}