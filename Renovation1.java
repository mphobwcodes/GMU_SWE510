/**
 * Mpho M
 * First Renovation project
 * The Door
 * Each Window
 * The bookshelf
 * 
 */

package Homeworks;

import java.util.Scanner;

public class Renovation1 {
	
	
	public static void main(String[] args) {
		
		Scanner getData= new Scanner(System.in);
	
	//The rooms dimensions
	int rLength, rWidth, rHeight, rTotal;
	//First Windows dimensions
	int wLength, wWidth, wTotal;
	//Second Windows Dimensions 
	int wLength2, wWidth2, wTotal2;
	//the bookshelf dimensions
	int bookLength, bookWidth, bookTotal;
	//The doors dimensions
	int dLength, dWidth, dTotal;
	//Total paint needed
	int totalGallons;
	
	System.out.println("Enter Romm Height");
	rHeight=getData.nextInt();
	System.out.println("Enter Romm Width");
	rWidth=getData.nextInt();
	System.out.println("Enter Length Height");
	rLength=getData.nextInt();
	int fArea= rLength *rWidth;  //Area of the floor
	rTotal = ((rLength * rHeight)*2) + ((rWidth * rHeight)*2);
	
	System.out.println("Enter Door Length");
	dLength=getData.nextInt();
	System.out.println("Enter Door Width");
	dWidth=getData.nextInt();
	dTotal = dLength * dWidth;
	
	System.out.println("Enter Window Length");
	wLength=getData.nextInt();
	System.out.println("Enter Window Width");
	wWidth=getData.nextInt();
	wTotal = wLength * wWidth;
	
	
	System.out.println("Enter Window2 Length");
	wLength2=getData.nextInt();
	System.out.println("Enter Window2 Width");
	wWidth2=getData.nextInt();
	wTotal2 = wLength2 * wWidth2;
	
	System.out.println("Enter Bookshelf Length");
	bookLength=getData.nextInt();
	System.out.println("Enter Bookshelf Width");
	bookWidth=getData.nextInt();
	bookTotal = bookLength * bookWidth;
	
	
	
	//calculating the total area 
	rTotal= rLength*rWidth*rHeight;
	System.out.println("Wall area to be painted = " + rTotal);
	
	//Calculating Floor Area
	
	System.out.println("Floor area to be covered = " +  );
	System.out.println("Cost of paint wall = " );
	System.out.println("Cost to carpert floor = " );
	
	
	}

 }
	


/*




totalGallons = (rTotal - dTotal - wTotal - wTotal2 - bookTotal)/120;*/
