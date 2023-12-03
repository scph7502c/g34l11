package task7;

public class TrainingEvaluation {

    public double evaluateTraining(int trainingLength, int burnedCalories, int averageHeartRate) {
        double lengthScore = evaluateTrainingLength(trainingLength);
        double caloriesScore = evaluateBurnedCalories(burnedCalories);
        double heartRateScore = evaluateAverageHeartRate(averageHeartRate);

        return calculateWeightedAverage(lengthScore, caloriesScore, heartRateScore);
    }


    private double evaluateTrainingLength(int trainingLength) {
        if (trainingLength < 30) {
            return 1;
        } else if (trainingLength <= 60) {
            return 2;
        } else {
            return 3;
        }
    }

    private double evaluateBurnedCalories(int burnedCalories) {
        if (burnedCalories <= 300) {
            return 1;
        } else if (burnedCalories < 400) {
            return 2;
        } else {
            return 3;
        }
    }

    private double evaluateAverageHeartRate(int averageHeartRate) {
        if (averageHeartRate < 160) {
            return 1;
        } else if (averageHeartRate <= 175) {
            return 2;
        } else {
            return 3;
        }
    }

    private double calculateWeightedAverage(double lengthScore, double caloriesScore, double heartRateScore) {
        double totalWeight = 1 + 2 + 3; // Suma wag
        return (lengthScore * 1 + caloriesScore * 2 + heartRateScore * 3) / totalWeight;
    }

    public String evaluateTrainingEfficiency(double trainingScore) {
        if (trainingScore < 1.2) {
            return "Niska";
        } else if (trainingScore < 2.0) {
            return "Dobra";
        } else if (trainingScore < 3.0) {
            return "Bardzo dobra";
        } else {
            return "Doskonała";
        }
    }
}