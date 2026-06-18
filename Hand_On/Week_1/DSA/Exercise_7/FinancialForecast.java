public class FinancialForecast {
    public static double futureValue(double amt, double growthRate, int years){
        if(years == 0){
            return amt;
        }
        return futureValue(amt*(1+growthRate), growthRate, years-1);
    }
    public static void main(String[] args) {
        double amount = 10000;
        double growthRate = 0.10;
        int years = 5;
        double res = futureValue(amount,growthRate,years);
        System.out.println("Future values after "+years+" years is "+res);
    }
}
// Time COmplexity is O(n) n -- > no.of years 