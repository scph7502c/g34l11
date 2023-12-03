package task7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainingEvaluationTest {

    @ParameterizedTest
    @CsvSource({
            "15, 250, 150, Niska",
            "45, 350, 165, Dobra",
            "75, 450, 180, Doskonała"
    })
    public void testTrainingEvaluation(int length, int calories, int heartRate, String expectedEfficiency) {
        TrainingEvaluation evaluation = new TrainingEvaluation();
        double score = evaluation.evaluateTraining(length, calories, heartRate);
        String efficiency = evaluation.evaluateTrainingEfficiency(score);

        assertEquals(expectedEfficiency, efficiency);
    }
}