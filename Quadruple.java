//****************************************************
//Programmer:  Karson Mathews
//Homework 1:  Quadruple
//Date:        9/8/21
//Description: Ask user for the size of their kitchen in
//			   sq ft. and prints out the size quadrupled.
//		       print out answer.
//****************************************************** 
import java.util.Scanner;

public class Quadruple{
	public static void main(String[] args) {
			Float ans; //variable to hold user response
			Float quad; //Holds ans * 4 after received from user
		    Scanner scan = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter the size of your kitchen in square feet: ");
		    ans = scan.nextFloat(); //Taking in user answer and storing in ans
		    quad = ans*4;  //Getting the quadrupled value
		    //Printing and formating variables (floats) to two decimal places
		    System.out.printf("The size of your kitchen, %.2f square feet, quadrupled is %.2f square feet.",ans, quad);
	}
}
