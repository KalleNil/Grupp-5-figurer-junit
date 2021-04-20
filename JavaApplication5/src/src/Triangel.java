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
public class Triangel extends Figurer implements Geometri {
	double sida;
    double sida2;
    
    public Triangel(double bas, double sida, double sida2, double höjd) {
    	this.bas = bas;
    	this.höjd = höjd;
    	this.sida = sida;
    	this.sida2 = sida2;
    }

    @Override
    public double area() {
        double area = bas * höjd / 2;
        return area;
    }
    @Override
    public double omkrets() {
        double omkrets = bas + sida + sida2;
        return omkrets;
    }
}
