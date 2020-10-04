package BaekJoon;

public class StarEx10 {

	public static void main(String[] args) {
		// 6번
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
//				if (i+j==2 || i+j==3 || i+j==4 || i+j==5 || i+j==6) {
				if (i+j<=6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
					
		

