/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.Math;
/**
 *
 * @author denej
 */
public class Kub {
    double len;
    double height;
    double width;
    
    public Kub(double len, double height, double width) {
        this.len = len;
        this.height = height;
        this.width = width;
    }

    
    public double volym(double len, double height, double width) {
        double volym = len * height * width;
        return volym;
    }
            
    public double mantelarea(double len, double height, double width) {
        double volym = volym(len, height, width);
        double mantelarea = (double) Math.pow((2*volym), 2); 
        return mantelarea;
    }
}
