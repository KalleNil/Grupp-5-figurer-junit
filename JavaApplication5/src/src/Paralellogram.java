package src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author denej
 */
public class Paralellogram extends Figurer implements Geometri {
    
    public Paralellogram(double bas, double höjd) {
        this.bas = bas;
        this.höjd = höjd;
    }

    @Override
    public double area() {
        double area = bas * höjd;
        return area;
    }

    @Override
    public double omkrets() {
        double omkrets = (bas * 2) + (höjd * 2);
        return omkrets;
    }
    
}
