package Week1.Financial_Forecasting;

public class FinancialForecast {
    public static double futureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue; 
        } else {
            return futureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
        }
    }

    public static void main(String[] args) {
        double initialValue = 1000;
        double growthRate = 0.05; 
        int years = 5;

        double predictedValue = futureValue(initialValue, growthRate, years);
        System.out.printf("Future value after %d years: %.2f\n", years, predictedValue);
    }
}

