package assignments;

import java.util.Scanner;

public class PrintingX {

	public static void main(String[] args) {
		
		//Getting the size using scanner
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scan.nextInt();
		//To print x in crossed pattern
		char display='x';
		
		//Using nested for loop for iteration
		for (int row = 0; row < size; row++) {
		        for (int col = 0; col < size; col++) {
		        	//Checking the condition if it is true going to if loop 
		            if (row == col || row + col == size - 1) {
		                System.out.print(display);
		             } 
		            //If condition is false then enter into else loop
		            else {
		                System.out.print(" ");
		            }
		        }
		        //finally printing the result
		        System.out.println();
		    }
		}

	}


