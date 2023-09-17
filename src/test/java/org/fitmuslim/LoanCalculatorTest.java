package org.fitmuslim;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class LoanCalculatorTest {
    private LoanCalculator loanCalculator;

    @BeforeEach
    void setUp() {
        loanCalculator = new LoanCalculator();
    }

    @Test
    void testCalculateProfit() {
        // Set up the LoanCalculator with sample data
        loanCalculator.setLoanCapital(10000.0);
        loanCalculator.setTotalCapital(20000.0);
        loanCalculator.setPayBackYears(5.0);
        loanCalculator.setRent(200.0);

        // Calculate profit
        loanCalculator.calculateProfit();

        // Ensure that the total profit matches the expected value
        double expectedProfit = 3600.0; // Adjust this value based on your expected calculation
        assertEquals(expectedProfit, loanCalculator.getTotalProfit(), 0.01); // Use an appropriate delta for double comparison
    }

    @Test
    void testCalculateROI() {
        // Set up the LoanCalculator with sample data
        loanCalculator.setLoanCapital(10000.0);
        loanCalculator.setTotalCapital(20000.0);
        loanCalculator.setPayBackYears(5.0);
        loanCalculator.setRent(400);
        loanCalculator.calculateProfit(); // Calculate profit first

        // Calculate ROI
        double expectedROI = 72.0; // Adjust this value based on your expected calculation
        assertEquals(expectedROI, loanCalculator.calculateROI(), 0.01); // Use an appropriate delta for double comparison
    }
}
