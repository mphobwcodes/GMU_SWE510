/**
 * Mpho M
 * program determine change for buying number pair of shoes
 */

package Classexercises;

import java.util.Scanner;
public class ClassExerciseBasicsBuyShoes {

	public static void main(String[] args) {
		
		// Variables
		int numberPairsShoes=0;	
		double costPairShoes, taxRate, cashPaid;		
		double costForShoes, taxOnShoes,totalCost, change;		
		Scanner getData = new Scanner(System.in);  //  will use getData  to read in data from keyboard
		
		// read in values for number pairs shoes, cost per pair, taxes and money you have
		System.out.println("enter number pair of shoes");   // using println so can enter data on next line)
		numberPairsShoes = getData.nextInt();
		
		System.out.println("enter cost for the shoes,  tax rate and how much money you have");
		costPairShoes = getData.nextDouble();
		taxRate = getData.nextDouble();
		cashPaid = getData.nextDouble();
		
		System.out.println("number pairs= " + numberPairsShoes + "  cost shoes=" + costPairShoes + "  tax rate  " + taxRate +"  money i paid=" + cashPaid);
		
		//calculate totalCost for purchase by calculating cost, tazes  and adding taxes
		costForShoes = numberPairsShoes * costPairShoes;
		taxOnShoes = costForShoes*taxRate;
		totalCost = costForShoes+ taxOnShoes;;
		
		//  calculate how much money returned given cash paid and print out the number of pairs of shoes and return cash
				change = cashPaid - totalCost;
				System.out.println("number pair of shoes is " + numberPairsShoes + " and change returned = $" + change);
				
				getData.close();   // closes the open reading of data
	}  // end main
}  // end class