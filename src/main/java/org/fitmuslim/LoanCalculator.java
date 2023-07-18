package org.fitmuslim;

import java.util.Scanner;

public class LoanCalculator {
    private double totalCapital;
    private double loanCapital;
    private double payBackYears;
    private double rent;
    private double totalProfit;

    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter totalCapital value: ");
        totalCapital = scanner.nextDouble();

        System.out.print("Enter loanCapital value: ");
        loanCapital = scanner.nextDouble();

        System.out.print("Enter how many years you want to pay back: ");
        payBackYears = scanner.nextDouble();

        System.out.print("Enter rent value: ");
        rent = scanner.nextDouble();
    }

    public void calculateProfit() {
        double v = (loanCapital / payBackYears);
        totalProfit = 0.0;

        for (int jahr = 0; jahr <= payBackYears; jahr++) {
            double profitFunction = ((loanCapital - v * jahr) / totalCapital) * rent * 12;
            totalProfit += profitFunction;
            System.out.println("GG for Jahr " + jahr + ": " + profitFunction);
        }
    }
    public double calculateROI() {
        double initialInvestment = loanCapital;
        double netProfit = totalProfit;
        return (netProfit / initialInvestment) * 100;
    }

    public void displayROI() {
        double roi = calculateROI();
        System.out.println("Return on Investment (ROI): " + roi + "%");
    }
    public void displayTotalProfit() {
        System.out.println("Total profit: " + totalProfit);
    }

}
