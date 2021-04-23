/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preec
 */
public class Kon extends Cirkel {
    double height;
    double slantHeight;
    final double pi= 3.14;
    
     public Kon(double radius, double height) {
        super(radius);
        this.height = height;
        this.slantHeight = slantHeight;
     }
     
     //Räkna konens sida "slant height" med s = math.sqrt (r^2 + h^2)
     //Använder pythagoras sats 
     public double slantHeight() {
         //Konvertera Math.sqrt till float (float) Math.sqrt
         return slantHeight = (double) Math.sqrt(radius * radius + height * height);
     }
    
     
     //Räkna ut volym på konen volym = 1/3 (pi * r * r * h)
 
     public double volume() {
        return 1 / 3 * (pi * height * radius * radius);
     }
     
     
     //Räkna ytan av konen med pi * r * s + pi * r^2
     public double surfaceArea() {
        
        return pi * radius * slantHeight  + pi * radius * radius;   
     }
}
