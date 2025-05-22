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

    
    }
}
