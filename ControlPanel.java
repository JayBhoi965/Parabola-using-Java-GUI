package com.parabola.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel {

    private JTextField aField, bField, cField;
    private JButton plotButton;

    public ControlPanel(ParabolaEquation equation, ParabolaPanel graphPanel) {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBackground(new Color(245, 245, 245));

        JLabel labelA = new JLabel("a:");
        aField = new JTextField(String.valueOf(equation.getA()), 6);

        JLabel labelB = new JLabel("b:");
        bField = new JTextField(String.valueOf(equation.getB()), 6);

        JLabel labelC = new JLabel("c:");
        cField = new JTextField(String.valueOf(equation.getC()), 6);

            plotButton = new JButton("Plot Parabola");
 
        plotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(aField.getText());
                    double b = Double.parseDouble(bField.getText());
                    double c = Double.parseDouble(cField.getText());

                    equation.setCoefficients(a, b, c);
                    graphPanel.repaint();

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ControlPanel.this,
                            "Invalid input. Please enter valid numeric values.",
                            "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(labelA); add(aField);
        add(labelB); add(bField);
        add(labelC); add(cField);
        add(plotButton);
    }
}
