package checkerboard;

import java.util.Scanner;

public class checkerboard {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter a value for N: ");
			int num = input.nextInt();
			
			if(num <= 0) {
				System.out.println("Invalid Input!");
			}else {
				break;
			}
		}
	}
	
}
