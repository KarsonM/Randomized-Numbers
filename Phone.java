//****************************************************
//Programmer:  Karson Mathews
//Homework 2:  Phone
//Date:        9/8/21
//Description: Generate a random area code. The 1st number
//			   can't contain 0 or 1 and the second number 
//		       can't contain 8 or 9.
//****************************************************** 
//Needed to generate random number
import java.util.Random;

//Class for our project
public class Phone{
	public static void main(String[] args) {
			Random generator = new Random(); //Assigning Generator as our object to call
			int num1 = generator.nextInt(8) + 2; //Generates random # b/w 2-9
			int num2 = generator.nextInt(8); //Generates random # b/w 0-7
			int num3 = generator.nextInt(10); //Generates random # b/w 0-9
			System.out.printf("Area Code: %s%s%s-", num1, num2, num3); //Prints all at once
	}
}