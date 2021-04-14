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
    private double radius;
    
    public Cirkel(double radius) {
        this.radius = radius;
        
    }
    
    @Override
    public double area(double radius, double pi) {
        return  3.14 * (this.radius * this.radius);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double omkrets(double radius, double height) {
        return 2 * 3.14 * this.radius; //To change body of generated methods, choose Tools | Templates.
    }
    
}
