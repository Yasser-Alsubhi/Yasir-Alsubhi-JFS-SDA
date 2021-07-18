package phase1project1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

////////////////////////////////////////////////////////////////////////////////

public class phs1pro1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int choose1 ;
		int choose2 ;
		String input ;

		System.out.println("[Digitize info] by Yasir");
		System.out.println("[Email:Yasser.s.alsubhi@gmail.com]");
		System.out.println("__________________________________");
		System.out.println("[Digitize info]");

		
		List<String> list = new ArrayList<String>();
		
			list.add("file3");
			list.add("file5");
			list.add("file2");
			list.add("file1");
			list.add("file4");
			
		
		
try {
	
	
	do{    

		// level 1 options
		System.out.println("Please Select one of the options below :");
		System.out.println("[1] : Show file names in Ascending order.");
		System.out.println("[2] : EDIT file.");
		System.out.println("[0] : Exit");
	 	System.out.print("Select option : ");


		choose1 = in.nextInt();

		switch(choose1) {

			case(1):
				Collections.sort(list);
				System.out.println(list);

				break;
				
			case(2):
				do{    
					System.out.println("Please Select one of the options below :");
					
					// level 2 options
				 	System.out.println("[1] : Add a file");
					System.out.println("[2] : Delete a file");
				 	System.out.println("[3] : Search a file");
				 	System.out.println("[0] : Back");
				 	System.out.print("Select option : ");
					choose2 = in.nextInt();

					switch(choose2) {

						case(1):// Add item to the list
							System.out.println("Enter the File Name : ");
							input = in.next();
							// check if the item is there in the list
							if (list.contains(input))
								System.out.println("Item is alredy in the list!");
							else
								list.add(input);
							
								System.out.println(list);
							break;
						

						case(2):// Delete a file from the list
							System.out.println("Enter File Name to Delete : ");
							// get the file name from the user
							input = in.next();
							//check if the file name is there in the list
							if (list.contains(input)) {
								list.remove(input);
								System.out.println("File "+input+"Deleted!");
							}
							else
								System.out.println("File not Found!");
							
								System.out.println(list);

							break;
							
							
						case(3):// Search a file from the list
							System.out.println("Enter File Name to Search : ");
							// get the file name from the user
							input = in.next();
							//check if the file name is there in the list
							if (list.contains(input)) {
								System.out.println("File "+input+" Found!");
							}
							else
								System.out.println("File not Found!");
							
								System.out.println(list);
							break;

					} 
					}while (choose2 !=0);   
						System.out.println("Back To Main Menu");


		} 
		}while (choose1 !=0);  
			System.out.println("Thank You For using [Digitize info] by Yasir\nHave a great day :) ");
				System.exit(0);
} catch (Exception e) {
	System.out.println("Wrong Input!!");
}
		
	}
}

		
	

