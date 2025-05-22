package com.parabola.gui;

import javax.swing.*;
import java.awt.*;

public class GraphWindow extends JFrame {

    private ParabolaPanel graphPanel;
    private ControlPanel controlPanel;

    public GraphWindow() {
        super("Modular Parabola Plotter");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
 
        ParabolaEquation equation = new ParabolaEquation(0.01, 0, 0);
        graphPanel = new ParabolaPanel(equation);
        controlPanel = new ControlPanel(equation, graphPanel);

        add(controlPanel, BorderLayout.NORTH);
        add(graphPanel, BorderLayout.CENTER);
    }
}
