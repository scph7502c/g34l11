package task7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainingEvaluationTest {

    private TrainingEvaluation trainingEvaluation;

    @BeforeEach
    void setUp() {
        trainingEvaluation = new TrainingEvaluation();
    }

    @ParameterizedTest
    @CsvSource({
            "25, 200, 155, Bardzo dobra",   // Test dla treningu o niskiej efektywności
            "70, 550, 180, Niska",   // Test dla treningu o niskiej efektywności
            "70, 500, 180, Bardzo dobra",  // Test dla treningu o wysokiej efektywności
            "60, 300, 160, Dobra"    // Test dla treningu o średniej efektywności

    })
    void testEvaluateTraining(int trainingLength, int burnedCalories, int averageHeartRate, String expectedEfficiency) {
        double score = trainingEvaluation.evaluateTraining(trainingLength, burnedCalories, averageHeartRate);
        String actualEfficiency = trainingEvaluation.evaluateTrainingEfficiency(score);

        assertEquals(expectedEfficiency, actualEfficiency);
    }
}
