package calc;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in) ;
		
			double value1 = 0 ;
			double value2 = 0 ;
			
			double result = 0 ;
			
			String op = null ;
			
		System.out.print("Enter the First Value: ");
		value1 = in.nextDouble();
		
		
		System.out.print("Enter the Second Value: ");
		value2 = in.nextDouble();
		
		System.out.print("Enter the Operation: ");
		op = in.next();
		
		
		if(op.equals("+")){
			
			result = Add(value1,value2);
			System.out.print("The answar is : "+result); 
			
		}else if(op.equals("-")){
			
			result = Sub(value1,value2);
			System.out.print("The answar is : "+result); 
			
		}else if(op.equals("*")){
			
			result = Mult(value1,value2);
			System.out.print("The answar is : "+result); 
			
			
		}else if(op.equals("/")){
			
			result = Div(value1,value2);
			System.out.print("The answar is : "+result); 
			
		}else
		{
			System.out.println("Invalid Operation!!!");
		}
		
}
	
	
	
	//
	static double Add(double x, double y) {
		
		double z = x + y;
		
		return z;
	}
	//
	static double Sub(double x, double y) {
		
		double z = x - y;
		
		return z;
	}
	//
	static double Mult(double x, double y) {
			
		double z = x * y;
			
		return z;
	}
	//
	static double Div(double x, double y) {
			
		double z = x / y;
			
		return z;
		
	}
	
	

	
	
}
