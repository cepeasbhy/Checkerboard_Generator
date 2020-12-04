package checkerboard;

import java.util.Scanner;

public class checkerboard {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			System.out.print("Enter a value for N: ");
			num = input.nextInt();
			
			if(num <= 0) {
				System.out.println("Invalid Input!");
			}else {
				break;
			}
		}
		
		for(int i = 0; i<num+1; i++) {
			for(int j = 0; j<=num*4; j++) {
				if(j%4==0) {
					System.out.print("+");
				}else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	
	
}
