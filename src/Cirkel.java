/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author denej
 */
public class Cirkel implements Geometri {
    //private double area;
    //private double omkrets;
    double radius;
    
    
    public Cirkel(double radius) {
        this.radius = radius;
        
    }
    
    /**
     * Räknar ut area beroende på vad cirkeln har för radie
     * @return double
     */
    @Override
    public double area() {
        return  3.14 * (this.radius * this.radius);//To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Räknar ut omkrets beroende på vad cirkeln har för radie
     * @return double
     */
    @Override
    public double omkrets() {
        return 2 * 3.14 * this.radius; //To change body of generated methods, choose Tools | Templates.
    }
    
}