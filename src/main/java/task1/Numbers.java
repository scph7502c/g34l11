package task1;

public class Numbers {

    public boolean isDivisibleByTwo(int number) {
        return number % 2 == 0;
    }

    public int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

}