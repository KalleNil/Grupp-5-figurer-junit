/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author denej
 */
public class Paralellogram implements Geometri {

    @Override
    public double area(double len, double height) {
        double area = len * height;
        return area;
    }

    @Override
    public double omkrets(double len, double height) {
        double omkrets = len + len + height + height;
        return omkrets;
    }
    
}
