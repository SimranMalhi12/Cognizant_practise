public class Main {

    public static void main(String[] args) {

        double amount = 10000;
        double rate = 0.10;
        int years = 5;

        double result = ForecastCalculator.futureValue(amount, rate, years);

        System.out.printf("Future Value = %.2f", result);
    }
}