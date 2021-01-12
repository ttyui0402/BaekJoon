
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해.");
		
			int userInput1 = Integer.valueOf(scanner.nextLine());
			int userInput2 = Integer.valueOf(scanner.nextLine());
			
			if (-1000 <= userInput1 && userInput1 <= 1000 && userInput1 != 0) {
				if (-1000 <= userInput2 && userInput2 <= 1000 && userInput2 != 0) {
					if (userInput1 > 0 && userInput2 > 0) {
						System.out.println("1");
					} else if (userInput1 < 0 && userInput2 > 0) {
						System.out.println("2");
					} else if (userInput1 < 0 && userInput2 < 0) {
						System.out.println("3");
					} else
						System.out.println("4");
				}
			} else {
				System.out.println("숫자를 다시 입력해주세요.");
			}
			scanner.close();
	}
}
