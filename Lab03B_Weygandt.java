//Aidan Weygandt 09/27/21
// Purpose of Program:
// Modifying a class to add a constructor and methods to
// give it complete functionality for dealing with rational numbers

import java.util.Scanner;

public class Lab03B_Weygandt{
	private static int num1, den1, num2, den2;// numerator and denominator of the rational number

	public static void main (String[] args){
		enterData();

    Lab03B_Rational_Weygandt equation = new Lab03B_Rational_Weygandt();//creates object with constructor for doing calculations between two other fraction objects

		Lab03B_Rational_Weygandt r1 = new Lab03B_Rational_Weygandt(num1, den1);//creates fraction number 1 with overloaded constructor

    Lab03B_Rational_Weygandt r2 = new Lab03B_Rational_Weygandt(num2, den2);//creates fraction number 2 with overloaded constructor

    r1.displayData();
		r2.displayData();

    equation.multiply(r1, r2);
    equation.divide(r1, r2);
    equation.add(r1, r2);
    equation.minus(r1, r2);
	}

	public static void enterData(){//takes inputs for each fractions numerator and denominator
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the 1st numerator ----> ");
    while (!input.hasNextInt()){ //make sure an int was entered
      input.nextLine(); //clear the invalid input before prompting again
      System.out.print("Please enter The numerator as an int (1,2,3) > ");
    }
		num1 = input.nextInt();

		System.out.print("\nEnter the 1st denominator --> ");
    while (!input.hasNextInt()){  //make sure an int was entered
      input.nextLine(); //clear the invalid input before prompting again
      System.out.print("Please enter The denominator as an int (1,2,3) > ");
    }
		den1 = input.nextInt();

    System.out.print("\nEnter the 2nd numerator ----> ");
    while (!input.hasNextInt()){ //make sure an int was entered
        input.nextLine(); //clear the invalid input before prompting again
        System.out.print("Please enter The numerator as an int (1,2,3) > ");
    }
		num2 = input.nextInt();

		System.out.print("\nEnter the 2nd denominator --> ");
    while (!input.hasNextInt()){  //make sure an int was entered
        input.nextLine(); //clear the invalid input before prompting again
        System.out.print("Please enter The denominator as an int (1,2,3) > ");
    }
		den2 = input.nextInt();
	}
}