package BaekJoon;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println((a%c)+(b%c)%c);
		System.out.println((a*b)%c);
		System.out.println((a%c)*(b%c)%c);
		
		scanner.close();
	}

}
