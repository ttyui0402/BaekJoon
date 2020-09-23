package BaekJoon;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int userTest = Integer.parseInt(scanner.nextLine());
	
	
	
	for (int i = 1; i <= userTest; i++) {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("Case #" +i+ ": "+a+" + "+b+" = "+(a+b));
		
		}
	scanner.close();	
		
	}

}
