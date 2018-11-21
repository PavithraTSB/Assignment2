package workout;

import java.util.Scanner;

public class Greatestnumber {

	public static void main(String[] args) {
	
        //Getting 3 numbers as input 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Input:");
	    int num1 =scan.nextInt();
	    int num2 =scan.nextInt();
	    int num3 =scan.nextInt();
		//int num1 = 10; double num2 =30.85; int num3=45;
	    //Using if loop for comparison of the 3 numbers
	    if (num1 >= num2 && num1 >= num3)
	    {
	    	System.out.println("Greatest number is :"+num1);
	    }
	    else if (num2 >= num1 && num2>=num3)
	    {
	    	System.out.println("Greatest number is :"+num2);
	    }
	    else 
	    {
	    	System.out.println("Greatest number is :"+num3);
	    }
	}

}
