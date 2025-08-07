package com.college;

public class jump_statements {
	public static void main(String[] args) {
		
		//Break
//		for(int i = 5; i <= 10; i++) {
//			if(i == 5) {
//				break;
//				System.out.println(i);
//				System.out.println("Hello Friends.");
//				//break;
//			}
//		}
		
		//Continue
//		for(int i = 5; i <= 15; i++) {
//			//odd numbers are skiped
//			
//		}
		
		//Switch
		
		int userInput = 4;
		switch(userInput) {
		case 1:
			System.out.println(userInput + ":Current plan details.");
			break;
		case 2:
			System.out.println(userInput + ":New offers.");
			break;
		case 3:
			System.out.println(userInput + ":Talk to custmar support person.");
			break;
		case 4:
			System.out.println(userInput + ":Custmar services.");
		
		 default:
			System.out.println(userInput + ":you had put wrong input.");
		}
	
	}
}
