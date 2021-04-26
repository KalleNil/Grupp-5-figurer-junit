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
    double sida;
    public Paralellogram(double bas, double höjd, double sida) {
        this.bas = bas;
        this.höjd = höjd;
        this.sida = sida;
    }
    /**
     * Räknar ut area på paralellogrammet
     * @return double
     */
    @Override
    public double area() {
        double area = bas * höjd;
        return area;
    }
    
    /**
     * Räknar ut omkrets på paralellogrammet
     * @return double
     */
    @Override
    public double omkrets() {
        double omkrets = (bas * 2) + (sida * 2);
        return omkrets;
    }
    
}
