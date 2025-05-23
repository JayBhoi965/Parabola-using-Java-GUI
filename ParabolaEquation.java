package com.parabola.gui;

public class ParabolaEquation {
    private double a, b, c;

    public ParabolaEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double evaluate(double x) {
        return a * x * x + b * x + c;
    }

    public void setCoefficients(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
}
