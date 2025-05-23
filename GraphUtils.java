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

}
