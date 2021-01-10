
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("시험점수를 입력해주세요.");
			int userInput = Integer.parseInt(scanner.nextLine());
			
		
		int score = 0;
		
		if(0 <= userInput && userInput <= 100) {
			score = userInput;
			
		} else {
			System.out.println("0부터 100까지만 입력할 수 있습니다.");
			continue;
		}
		
		if (score >= 90) 
			System.out.println("A");
		else if (score >= 80)
			System.out.println("B");
		else if (score >= 70)
			System.out.println("C");
		else if (score >= 60)
			System.out.println("D");
		else
			System.out.println("F");
		
		break;
		
		}	// while
	}
}
