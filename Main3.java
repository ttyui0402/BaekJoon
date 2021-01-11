
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

//		연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//
//		윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//
//		예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
//		
//		1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
//		
//		첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
		
		// 1-0 연도를 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도를 입력해주세요.");
		int userInput = Integer.parseInt(scanner.nextLine());
		// 1-1. 입력받는 연도의 범위는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
		if (userInput >= 1 && userInput < 4000) {
			// 2-0. 입력받은 연도가 윤년인지 확인한다. 
			// 2-1.	윤년의 조건은 4의 배수이면서, 100의 배수가 아닐 때, 
			//			혹은 400의 배수일 때다.
			
			// 3-0. 입력받은 연도나 윤년이면 1을,
			if ((userInput % 4 == 0 && userInput % 100 != 0) || userInput % 400 == 0) {
				System.out.println("윤년입니다.");
				System.out.println("1");
			} else
//				평년이면 0을 출력한다.
				System.out.println("윤년이 아닙니다.");
				System.out.println("0");
		}
		
		scanner.close();
		
		
		
	}

}
