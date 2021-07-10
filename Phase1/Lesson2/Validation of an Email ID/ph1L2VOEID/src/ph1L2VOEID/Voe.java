package ph1L2VOEID;

import java.util.Scanner;


public class Voe {
	public static void main(String[] args) {
		
		//we need Scanner to take value from the user
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		// to hold the input from the user
		String input = null ;
		String target = null;

		// Create String array and add the values 
		String[] emails = 
			    {
				"ABC@XYZ.com","DEF@XYZ.com",
				"GHI@XYZ.com","JKL@XYZ.com",
				"MNO@XYZ.com","PQR@XYZ.com",
				"S3U@XYZ.com","VWX@XYZ.com",
				"YZ@XYZ.com" 
				};
		
		//Hello and how to use this program
		System.out.println("Email cheacker :) \nPlease Enter an Email to cheack ");
		System.out.println("There is "+ emails.length +" Emails");
		System.out.println("*Hint* : ABC@XYZ.com ~ YZ@XYZ.com");

		// taking the value and store it in 'input'
		input = in.nextLine();
		

		//check if there is value in input
		if (input != null) {
			//check for the value throw all items in 'emails'
			for (int i = 0; i < emails.length; i++) {
				//Compare between the 'emails' value and target value ignoring the letters case
				if (emails[i].equalsIgnoreCase(input) ){
					// if found assign this value from 'emails' to target
					target = emails[i];
					
				} else {
					
				}
			}		 
		}
		else {
			
		}
		// check if there is any input or it's blank
		if (input.isBlank()){
			System.out.println("Empty!, Enter a valid Email next time.");
			
		}
		// if do not match
		else if (target == null) {
			System.out.println("Email Not Found! :( ");
			
		
		}else {
			System.out.println("YES! This email is valid :) => " + target);
		}
	
		}
		

	}

