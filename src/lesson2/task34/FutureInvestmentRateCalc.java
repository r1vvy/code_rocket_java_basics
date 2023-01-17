package lesson2.task34;

import java.math.BigDecimal;
import java.math.MathContext;

public class FutureInvestmentRateCalc {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            BigDecimal value = futureInvestmentValue(BigDecimal.valueOf(1000), 10, i);
            System.out.println("Future investment value for " + i + " years is " + value);
        }           
    }


    public static BigDecimal futureInvestmentValue(BigDecimal investmentAmount, double annualInterestRate, int years) {
        BigDecimal monthlyInterestRate = new BigDecimal(annualInterestRate/12/100);
        double exponent = Math.pow(1 + monthlyInterestRate.doubleValue(), years * 12);
        BigDecimal futureValue = investmentAmount.multiply(new BigDecimal(exponent));
        
        return futureValue.round(new MathContext(2));
    }

}
