
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		String userInput = scanner.nextLine();
		
		String[] intArr = userInput.split(" ");
		
		int[] intArr2 = new int[intArr.length];
		
		intArr2[0] = Integer.parseInt(intArr[0]);
		intArr2[1] = Integer.parseInt(intArr[1]);
		
		
		if(intArr2[0] > intArr2[1])
			System.out.println(">");
		else if(intArr2[0] == intArr2[1])
			System.out.println("==");
		else 
			System.out.println("<");
	}

}
