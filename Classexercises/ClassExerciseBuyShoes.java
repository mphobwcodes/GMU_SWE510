/**
 * Mpho M
 * Buying shoes and giving cash left over after pay bill
 * advanced -makes change for money left over 
 */

package Classexercises;

import java.util.Scanner;  // get programs to read in data

public class ClassExerciseBuyShoes {

	public static void main(String[] args) {
		
		// Variables
		int numberPairsShoes=0;
	//  following is to actually make 	
		int numberDollars, change, numberChange;   //  initializing it to zero
		int number1s=0, number5s=0, number10s=0, number20s=0, number50s=0, number100s=0; //for change
	
		int numberPennies=0, numberDimes=0, numberNickels=0, numberQuarters=0, numberFiftyCents=0; 
		
		double costPairShoes, taxRate, yourMoney;
		
		double totalCostPurchase, changeReturned;
		
		Scanner getData = new Scanner(System.in);  //  will use getData  to read in data from keyboard
		
		// read in values for number pairs shoes, cost per pair, taxes and money you have
		
		System.out.println("enter number pair of shoes");   // using println so can enter data on next line)
		numberPairsShoes = getData.nextInt();
		if (numberPairsShoes< 0) {
			System.out.println("negative number");
		}  //  end of if neg
			
		
			
		if (numberPairsShoes == 0)
			System.out.println("do you want any shoes");
		
		System.out.println("enter cost for the shoes, current tax rate and how much money you have");
		costPairShoes = getData.nextDouble();
		taxRate = getData.nextDouble();
		yourMoney = getData.nextDouble();
		
		System.out.println("number pairs= " + numberPairsShoes + "  cost shoes=" + costPairShoes + "  tax rate  " + taxRate +"money i have=" + yourMoney);
		
		//calculate totalCost for purchase by calculating cost and adding taxes
		
		totalCostPurchase = numberPairsShoes*costPairShoes + numberPairsShoes*costPairShoes*taxRate;
		
		//  calculate how much money returned and print out the number of pairs of shoes and return cash
		
		changeReturned = yourMoney - totalCostPurchase;
		changeReturned = (int)((changeReturned+.005)*100)/100.;  //  rounds to two decimal points
		System.out.println("number pair of shoes is " + numberPairsShoes + " and change returned = $" + changeReturned);
		
		//now lets figure out how to make change for dollars but getting dollars and using integer division to determine
		
		numberDollars = (int)changeReturned;
		numberChange = (int)((changeReturned - numberDollars)*100);
		// for data 3 pair, 10.50, .07 and 105  get error where change = 29 versus 30
		
		System.out.println("change returned="  + changeReturned +"  dollars=" + numberDollars + "  change=" + numberChange);
		number100s = numberDollars/100;     					//  determione number 100's need
		numberDollars = numberDollars - number100s*100;			//  reduce number dollars by the 100's
		number50s = numberDollars/50;							//  determine number 50s needed
		numberDollars = numberDollars - number50s*50;			//  reduce the number dollars by 50's
		number20s = numberDollars/20;							//  continue for 20's, 10'5 and 5's
		numberDollars = numberDollars - number20s*20;
		number10s = numberDollars/10;
		numberDollars = numberDollars - number10s*10;
		number5s = numberDollars/5;
		numberDollars = numberDollars - number5s*5;
		number1s = numberDollars;   //  becuase only thing left are ones
		
		//outpout change in dollars
		
		System.out.println("1's = " + number1s + " 5's = " + number5s + " 10's = " + number10s 
				+ " 20's = " + number20s +	" 50's = " + number50s + " 100's = " + number100s);
		
		//now lets figure out how to make change for the change
				
				numberFiftyCents = numberChange/50;
				numberChange = numberChange - numberFiftyCents*50;
				numberQuarters = numberChange/25;
				numberChange = numberChange - numberQuarters*25;
				numberDimes = numberChange/10;
				numberChange = numberChange - numberDimes*10;
				numberNickels = numberChange/50;
				numberChange = numberChange - numberNickels*5;
				numberPennies = numberChange;   //  becuase only thing left are ones
				
				//outpout change in dollars
				
				System.out.println("pennies= " + numberPennies + " Number Nickels = " + numberNickels +
						" number dimes=" + numberDimes 
						+ " number quarters = " + numberQuarters +	" number 50 cents = " + numberFiftyCents + " 100's = " + number100s);
				System.out.println( Integer.MAX_VALUE);

		
				getData.close();   // closes the open reading of data
	}  // end main
}  // end class
