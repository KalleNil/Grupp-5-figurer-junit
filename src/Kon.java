/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preec
 */
public class Kon {
    
    float radius;
    float height;
    float slant_height;
    static float pi= (float) 3.14159;
    
     public Kon(float radius, float height, float slant_height, float pi) {
        this.radius = (float) radius;
        this.height = (float) height;
        this.slant_height = slant_height;
        Kon.pi = pi;
     }
     //Räkna konens sida "slant height" med s = math.sqrt (r^2 + h^2)
     //Använder pythagoras sats 
     public static float slantHeight (float radius, float height, float slant_height, float pi) {
         
         return slant_height = (float) Math.sqrt(radius * radius + height * height);
     }
     //Räkna ut volym på konen volym = 1/3 (pi * r * r * h)
     public static float volume(float radius, float height, float slant_height) {
        
         return (float)1 / 3 * pi * height * radius * radius;
     }
     //Räkna ytan av konen med pi * r * s + pi * r^2
     public static float surfaceArea(float radius, float height, float slant_height, float pi) {
        
        return pi * radius * slant_height  + pi * radius * radius;   
     }
}
