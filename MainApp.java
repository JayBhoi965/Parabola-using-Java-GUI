package com.parabola.gui;

public class MainApp {
    public static void main(String[] args) { 
        javax.swing.SwingUtilities.invokeLater(() -> {
            GraphWindow window = new GraphWindow();
            window.setVisible(true);
        });
    }
}
