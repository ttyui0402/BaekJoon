package BaekJoon;

import java.util.Scanner;

public class StarEx3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int userInput = Integer.parseInt(scanner.nextLine());
		
		for (int i = userInput; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
