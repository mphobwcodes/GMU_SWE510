/**
 * Mpho M
 * demo of input
 */

package Classexercises;

import java.util.Scanner; //  import methods to read in data
public class ExampleInput {
	public static void main(String[] args) {
		//  variables 
		double junk, num3, num4, num5;  // notice warning for junk
		Scanner getInput = new Scanner(System.in);

		System.out.println("enter three floating point numbers");
		num3 = getInput.nextDouble();   // notice floating point can read in integer and change it
		num4 = getInput.nextDouble();
		num5 = getInput.nextDouble();		
		System.out.println ( "  num3=" + num3 + " num4=" + num4 + " num5=" + num5);
		// close scanner input
		getInput.close();
			
	}  //end main

}  // end class