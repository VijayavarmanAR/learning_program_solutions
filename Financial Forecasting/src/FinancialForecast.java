public class FinancialForecast {
    public static double forecastValue(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;
        }
        double newAmount = initialAmount * (1 + growthRate);
        return forecastValue(newAmount, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initial = 10000; 
        double rate = 0.05;   
        int years = 5;

        double result = forecastValue(initial, rate, years);
        System.out.printf("Future value after %d years = %.2f%n", years, result);
    }
}
