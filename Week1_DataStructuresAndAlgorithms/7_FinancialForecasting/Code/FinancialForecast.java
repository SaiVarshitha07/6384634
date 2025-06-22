package Code;
public class FinancialForecast {
    public static double forecastValueRecursive(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return forecastValueRecursive(presentValue, growthRate, years - 1) * (1 + growthRate);
    }
}
