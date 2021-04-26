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
     
     /**
     * Räknar ut längden på den lutande sidan av konen
     * @return double
     */
     /*Räkna konens sida "slant height" med s = math.sqrt (r^2 + h^2)
     Använder pythagoras sats*/ 
     public double slantHeight() {
         //Konvertera Math.sqrt till float (float) Math.sqrt
         return slantHeight = (double) Math.sqrt(radius * radius + height * height);
     }
    
     /**
     * Räknar ut volymen av konen
     * @return double
     */
     //Räkna ut volym på konen volym = 1/3 (pi * r * r * h)
     public double volume() {
        return pi * (radius * radius) * height /3;
     }
     
          
     /**
     * Räknar ut mantelarea av konen
     * @return double
     */
     //Räkna ytan av konen med pi * r * s + pi * r^2
     //Update den totala ytan av konen = pi*r(r+sqrt(h^2+r^2))
     public double surfaceArea() {
        
         return pi*radius*(radius+Math.sqrt(height*height+radius*radius));
        //return pi * radius * slantHeight  + pi * radius * radius;   
     }
}
