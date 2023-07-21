package org.fitmuslim;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class LoanCalculatorGUI extends JFrame implements ActionListener {

    private final JTextField totalCapitalField;
    private final JTextField loanCapitalField;
    private final JTextField payBackYearsField;
    private final JTextField rentField;
    private final JTextArea outputArea;

    private final LoanCalculator loanCalculator;


    public LoanCalculatorGUI() {

        loanCalculator = new LoanCalculator();
        setTitle("Loan Calculator");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new java.awt.GridLayout(6, 2));

        totalCapitalField = new JTextField();
        loanCapitalField = new JTextField();
        payBackYearsField = new JTextField();
        rentField = new JTextField();
        outputArea = new JTextArea();
        JButton calculateButton = new JButton("Calculate ROI");
        calculateButton.addActionListener(this);

        add(new JLabel("Enter totalCapital value:"));
        add(totalCapitalField);

        add(new JLabel("Enter loanCapital value:"));
        add(loanCapitalField);

        add(new JLabel("Enter how many years you want to pay back:"));
        add(payBackYearsField);

        add(new JLabel("Enter rent value:"));
        add(rentField);

        add(calculateButton);
        add(new JLabel(""));

        add(new JLabel("Results:"));
        add(outputArea);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double totalCapital = Double.parseDouble(totalCapitalField.getText());
        double loanCapital = Double.parseDouble(loanCapitalField.getText());
        double payBackYears = Double.parseDouble(payBackYearsField.getText());
        double rent = Double.parseDouble(rentField.getText());
        loanCalculator.setTotalCapital(totalCapital);
        loanCalculator.setLoanCapital(loanCapital);
        loanCalculator.setPayBackYears(payBackYears);
        loanCalculator.setRent(rent);
        loanCalculator.calculateProfit();
        double roi = loanCalculator.calculateROI();
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String formattedROI = decimalFormat.format(roi);
        String formattedTotalProfit = decimalFormat.format(loanCalculator.getTotalProfit());
        outputArea.setText("Return on Investment (ROI): " + roi + "%\nTotal profit: " + loanCalculator.getTotalProfit());
        outputArea.setText("Return on Investment (ROI): " + formattedROI + "%\nTotal profit: " + formattedTotalProfit);

    }
}
