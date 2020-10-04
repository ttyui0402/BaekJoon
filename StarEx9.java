package BaekJoon;

public class StarEx9 {

	public static void main(String[] args) {
		// 5번
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
//				if (i==j || i==j+1 || i==j+2 || i==j+3 || i==j+4) {
				if (i>=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
					
		

