import java.util.*;
import java.lang.*;
import java.io.*;

public class UsainBoltVsTiger
{
	public static void main (String[] args) 
	{
		// your code goes here
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- >0){
	        double finish = sc.nextDouble();
	        double distancetoBolt = sc.nextDouble();
	        double tigerAcceleration = sc.nextDouble();
	        double boltSpeed = sc.nextDouble();
	        double tTime=tigerTime(finish,distancetoBolt,tigerAcceleration);
	        double bTime=boltTime(finish,boltSpeed);
	        if(tTime>bTime){
	            System.out.println("Bolt");
	        }
	        else{
	            System.out.println("Tiger");
	        }
	        
	    }

	}
	public static double tigerTime(double finish,double distancetoBolt,double tigerAcceleration){
	    double dis= finish+distancetoBolt;
	    return Math.sqrt((2*dis)/tigerAcceleration);
	}
	public static double boltTime(double finish , double boltSpeed){
	    return finish/boltSpeed;
	}
}
