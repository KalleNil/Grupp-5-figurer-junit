/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author denej
 */
public class Triangel  {
    double a;
    double b;
    double c;
    double h;
    
    
    public Triangel(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        
    }

    public double area(double a, double b, double c, double h) {
        double area = b * h / 2;
        return area;
    }

    public double omkrets(double a, double b, double c, double h) {
        double omkrets = a + b + c;
        return omkrets;
    }


    
}
