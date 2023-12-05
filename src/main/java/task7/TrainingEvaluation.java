package task7;

public class TrainingEvaluation {

    public double evaluateTraining(int trainingLength, int burnedCalories, int averageHeartRate) {
        double lengthScore = evaluateTrainingLength(trainingLength);
        double caloriesScore = evaluateBurnedCalories(burnedCalories);
        double heartRateScore = evaluateAverageHeartRate(averageHeartRate);

        return calculateWeightedAverage(lengthScore, caloriesScore, heartRateScore);
    }


    double evaluateTrainingLength(int trainingLength) {
        if (trainingLength < 30) {
            return 1;
        } else if (trainingLength <= 60) {
            return 2;
        } else {
            return 3;
        }
    }

    double evaluateBurnedCalories(int burnedCalories) {
        if (burnedCalories <= 300) {
            return 1;
        } else if (burnedCalories < 400) {
            return 2;
        } else {
            return 3;
        }
    }

    double evaluateAverageHeartRate(int averageHeartRate) {
        if (averageHeartRate < 160) {
            return 3;
        } else if (averageHeartRate <= 175) {
            return 2;
        } else {
            return 1;
        }
    }

    private double calculateWeightedAverage(double lengthScore, double caloriesScore, double heartRateScore) {
        double totalWeight = 1 + 2 + 3;
        double weightedAverage = (lengthScore * 1 + caloriesScore * 2 + heartRateScore * 3) / totalWeight;
        return Math.round(weightedAverage * 10.0) / 10.0;
    }

    public String evaluateTrainingEfficiency(int length, int calories, int heartRate) {
        double score = evaluateTraining(length, calories, heartRate);

        if (score < 1.2) {
            return "Niska";
        } else if (score >= 1.2 && score < 2.0) {
            return "Dobra";
        } else if (score < 3.0) {
            return "Bardzo dobra";
        } else {
            return "Doskonała";
        }
    }
}