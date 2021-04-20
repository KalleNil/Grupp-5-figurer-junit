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
public class Kub extends treDfigurer implements Geometri{
    
    public Kub(double a) {
            this.bas = a;
            this.höjd = a;
            this.djup = a;

    }

	@Override
	//Volym
	public double area() {
		double volym = bas * höjd * djup;
        return volym;
	}


	@Override
	//Mantelarea
	public double omkrets() {
		double volym = area();
        double mantelarea = (double) Math.pow((2*volym), 2); 
        return mantelarea;
	}
}
