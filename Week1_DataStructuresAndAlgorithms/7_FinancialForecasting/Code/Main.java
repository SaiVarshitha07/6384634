public class Main {
    public static void main(String[] args) {
        double presentValue = 10000;
        double growthRate = 0.10;
        int years = 5;

        double futureValue = FinancialForecast.forecastValueRecursive(presentValue, growthRate, years);
        System.out.printf("Recursive: Future value after %d years: Rs.%.2f%n", years, futureValue);
    }
}