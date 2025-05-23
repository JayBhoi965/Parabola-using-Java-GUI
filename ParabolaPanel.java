package com.parabola.gui;

import javax.swing.*;
import java.awt.*;

public class ParabolaPanel extends JPanel {

    private ParabolaEquation equation;
    private int scale = 40;

    public ParabolaPanel(ParabolaEquation equation) {
        this.equation = equation;
        setBackground(Color.WHITE);
    }
 
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = GraphUtils.prepareGraphics(g);

        int w = getWidth();
        int h = getHeight();
        int originX = w / 2;
        int originY = h / 2;
 
        GraphUtils.drawGrid(g2, w, h, scale);
        GraphUtils.drawAxes(g2, w, h, originX, originY, scale);
 
        GraphUtils.drawEquationLabel(g2, equation, 20, h - 20);
 
        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(2));
        for (int i = -originX; i < originX; i++) {
            double x1 = (double) i / scale;
            double y1 = equation.evaluate(x1);
            double x2 = x1 + 0.01;
            double y2 = equation.evaluate(x2);

            int px1 = originX + (int)(x1 * scale);
            int py1 = originY - (int)(y1 * scale);
            int px2 = originX + (int)(x2 * scale);
            int py2 = originY - (int)(y2 * scale);

            g2.drawLine(px1, py1, px2, py2);
        }
    }
   
}
