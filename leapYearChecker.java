package com.exception;
import java.util.Scanner;
public class leapYearChecker {
	
	    public static void main(String[] args) {
	        // Create a Scanner object for input
	        Scanner sc = new Scanner(System.in);

	        // Prompt the user to enter a year
	        System.out.print("Enter a year:- ");
	        int year = sc.nextInt();

	        // Check if the year is a leap year
	        if (year % 400 == 0) {
	            System.out.println(year + " is a leap year.");
	        } else if (year % 100 == 0) {
	            System.out.println(year + " is not a leap year.");
	        } else if (year % 4 == 0) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }

	        
	       
	    }
	}



	    
	    
	



