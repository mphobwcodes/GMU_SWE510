package Classexercises;

import java.util.Scanner; 

public class Addition 
{
     public static void main(String[] args)
    { 
          Scanner getData = new Scanner(System.in);
// variables
          double number1; 
          double number2; 
          double sum; 

          System.out.print("Enter first integer: "); 
          number1 = getData.nextInt(); 

          System.out.print("Enter second integer: "); 
          number2 = getData.nextInt(); 

          sum = number1 + number2; 

          System.out.printf("Sum is %d%n", sum); 
          getData.close();
     }
}