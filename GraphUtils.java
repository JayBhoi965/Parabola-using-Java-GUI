package com.parabola.gui;

import java.awt.*;

public class GraphUtils {

    public static Graphics2D prepareGraphics(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
        return g2;
    }

    public static void drawGrid(Graphics2D g2, int w, int h, int scale) {
        g2.setColor(new Color(220, 220, 220));
        for (int i = 0; i < w; i += scale)
            g2.drawLine(i, 0, i, h);
        for (int i = 0; i < h; i += scale)
            g2.drawLine(0, i, w, i);
    }
    
    public static void drawAxes(Graphics2D g2, int w, int h, int originX, int originY, int scale) {
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2));
        g2.drawLine(0, originY, w, originY); //X 
        g2.drawLine(originX, 0, originX, h);  //Y

        // Axis ticks
        for (int i = -w / (2 * scale); i <= w / (2 * scale); i++) {
            int x = originX + i * scale;
            g2.drawLine(x, originY - 4, x, originY + 4);
            if (i != 0)
                g2.drawString(String.valueOf(i), x - 5, originY + 15);
        }

        for (int i = -h / (2 * scale); i <= h / (2 * scale); i++) {
            int y = originY - i * scale;
            g2.drawLine(originX - 4, y, originX + 4, y);
            if (i != 0)
                g2.drawString(String.valueOf(i), originX + 5, y + 5);
        }

        g2.drawString("X", w - 15, originY - 5);
        g2.drawString("Y", originX + 10, 15);
    }

     public static void drawEquationLabel(Graphics2D g2, ParabolaEquation eq, int x, int y) {
        g2.setColor(Color.BLUE);
        g2.setFont(new Font("Serif", Font.BOLD, 14));
        String label = String.format("y = %.2fx² + %.2fx + %.2f", eq.getA(), eq.getB(), eq.getC());
        g2.drawString(label, x, y);
    }
}
