package BaekJoon;

import java.util.Scanner;

public class StarEx1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int userInput = Integer.parseInt(scanner.nextLine());
		
		for (int i = 1; i <= userInput; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
