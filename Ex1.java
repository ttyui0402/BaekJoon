package BackJoon;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		int userInput2 = scanner.nextInt();
		int [] userInputArr = new int[3];
		
		userInputArr[0] = userInput2 / 100;
		userInputArr[1] = userInput2 / 10 % 10;
		userInputArr[2] = userInput2 % 10;
		
		System.out.println(userInput * userInputArr[2]);
		System.out.println(userInput * userInputArr[1]);
		System.out.println(userInput * userInputArr[0]);
		System.out.println(userInput * userInput2);
		scanner.close();
		}
		
	}
	
	

