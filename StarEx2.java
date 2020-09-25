package BaekJoon;

import java.util.Scanner;

public class StarEx2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int userInput = Integer.parseInt(scanner.nextLine());
		
		for (int i = 1; i <= userInput; i++) {
			for (int j = userInput; j >= 1; j--) {
				if(i<j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
					
				}
			}
			System.out.println();	
		}
		
		
	}

}
