/**
 * Mpho M
 * Example program shows what happens if a number is too Big
 */
package Classexercises;

public class ExampleTooBigNumber {

	public static void main(String[] args) {
		//  int number3 = 2147483700;  //  notice that eclipse will tell you if you initialize number too big
		int number= 2147483647 , number2;
	
		number2 = number + 2;  //   but compiler and eclipse not know results of any math operation so not tell
		System.out.println ("number=" + number + "  number2=" + number2  + "   which is negative number");
		//  from the quiz questions
		System.out.printf("%10.3f", 2143.33);

	System.out.println("hellois fun\rJava ");
	}  //end main

}  // end class