package org.fitmuslim;

public class Main {
    public static void main(String[] args) {

        LoanCalculator calculator = new LoanCalculator();
        calculator.getInput();
        calculator.calculateProfit();
        calculator.displayTotalProfit();
        calculator.displayROI();
    }

}