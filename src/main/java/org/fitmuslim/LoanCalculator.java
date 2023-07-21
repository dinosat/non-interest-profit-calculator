package org.fitmuslim;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class LoanCalculator {
    private double totalCapital;
    private double loanCapital;
    private double payBackYears;
    private double rent;
    private double totalProfit;

    public void calculateProfit() {
        double v = (loanCapital / payBackYears);
        totalProfit = 0.0;

        for (int jahr = 0; jahr <= payBackYears; jahr++) {
            double profitFunction = ((loanCapital - v * jahr) / totalCapital) * rent * 12;
            totalProfit += profitFunction;
        }
    }

    public double calculateROI() {
        double initialInvestment = loanCapital;
        double netProfit = totalProfit;
        return (netProfit / initialInvestment) * 100;
    }

}
