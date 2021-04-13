/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author denej
 */
public class Triangel implements Geometri {
    double len;
    double height;
    
    
    public Triangel(double len, double height) {
        this.len = len;
        this.height = height;
        
    }

    @Override
    public double area(double len, double height) {
        double area = len* height / 2;
        return area;
    }

    @Override
    public double omkrets(double base, double height) {
        double omkrets = len + len + len;
        return omkrets;
    }


    
}
