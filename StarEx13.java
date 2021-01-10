
public class StarEx13 {

	public static void main(String[] args) {
		// 9번
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
//				if (i+j==2 || i+j==3 || i+j==4 || i+j==5 || i+j==6) {
				if ((i+j>=6 || i>=j) && (i+j<=6 || i<=j)) {	
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
					
		

// (i+j>=6 || i>=j)
//i>=j
//!(i+j<=6 || i<=j)