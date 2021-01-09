package BaekJoon;

public class StatEx12 {

	public static void main(String[] args) {
		// 8번
		for (int i = 1; i <= 1; i++) {
			for (int j = 1; j <= i+4; j++) {
				if (i+j>=6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}
	}
}
					

