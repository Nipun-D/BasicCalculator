package com.nipun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator implements ActionListener {

    private static JFrame frame;
    private static JPanel panel;
    private static JTextField textField;
    private static JButton[] functionButtons = new JButton[9];
    private static JButton[] numberButtons = new JButton[10];
    private static JButton addButton, subButton, mulButton, divButton;
    private static JButton decButton, equButton, delButton, clrButton, negButton;

    public static void main(String[] args) {

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(new Font("Arial", Font.PLAIN, 50));
        textField.setEditable(false); //prevents user from typing in inputs
        
        addButton = new JButton("+");
        functionButtons[0] = addButton;
        subButton = new JButton("-");
        functionButtons[1] = subButton;
        mulButton = new JButton("*");
        functionButtons[2] = mulButton;
        divButton = new JButton("/");
        functionButtons[3] = divButton;
        decButton = new JButton(".");
        functionButtons[4] = decButton;
        equButton = new JButton("=");
        functionButtons[5] = equButton;
        delButton = new JButton("Del");
        functionButtons[6] = delButton;
        clrButton = new JButton("Clr");
        functionButtons[7] = clrButton;
        negButton = new JButton("(-)");
        functionButtons[8] = negButton;

        for(int i =0; i<9; i++) {
            functionButtons[i].addActionListener(new BasicCalculator());
            functionButtons[i].setFont(new Font("Arial", Font.PLAIN, 40));
            functionButtons[i].setFocusable(false);
        }

        negButton.setBounds(50,430,100,50);
        delButton.setBounds(150,430,100,50);
        clrButton.setBounds(250,430,100,50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4,4,10,10));

        for(int i =0;i<10;i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(new BasicCalculator());
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 40));
            numberButtons[i].setFocusable(false);
        }

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(textField);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(negButton);
        frame.add(panel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
