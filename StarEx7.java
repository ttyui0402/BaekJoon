package BaekJoon;

public class StarEx7 {

	public static void main(String[] args) {
		// 3번
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i+j==6) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
					
		

