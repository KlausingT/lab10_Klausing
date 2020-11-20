package helloWorld;

import java.util.Scanner;
import java.lang.Math; 

public class PaintEstimator {
	public static void main(String[] args) {
		 Scanner scnr = new Scanner(System.in);
	      double wallWidth;
	      double wallHeight;
	      double wallArea;
	      
	      System.out.println("Enter wall height (feet):");              // FIXME (1): Prompt user to input wall's width
	      wallHeight = scnr.nextDouble();  
	      
	      System.out.println("Enter wall width (feet):");
	      wallWidth = scnr.nextDouble(); 
	      
	      wallArea = wallWidth * wallHeight;
	      System.out.println("Wall area: " + wallArea + " square feet");
	      
	      System.out.println("Paint needed: " + wallArea/350 + " gallons");
	      System.out.print("Cans needed: ");
	      System.out.print((int)Math.ceil(wallArea/350));
	      System.out.println(" can(s)");

	      
	      // FIXME (2): Calculate and output the amount of paint in gallons needed to paint the wall
	      
	      // FIXME (3): Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
	   }

	}

