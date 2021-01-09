package BaekJoon;

public class Ex_3 {
	// String check(int[] arr, int[] arr2)
	// 위치와 값이 같으면 S, 값만 같으면 B.
	// 출력예시 = "3S0B"
	
	int[] arr = {1,2,3};
	int[] arr2 = {1,2,3};
		
	public static String check(int[] arr, int[] arr2) {
		int strike = 0;
		int ball = 0;

		// 같은 인덱스 끼리의 그 값이 같으면 S를 출력하고, 다르면 B를 출력. 
		// 그 앞에 그 값이 같은지 알 수 있는 개수가 나오게.
		// (1) 인덱스끼리 비교하기. i, j는 위치.
		// (2) 값끼리 비교하기. 내용은 어떻게 가져와?
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (i == j && arr[i] == arr2[j]) {
					strike++;
				} else if (arr[i] == arr2[j]) 
					ball++;
						
			}
		}
		return strike+"S"+ball+"B";
//		return Integer.toString(strike, ball);
	}
}
				
		
		
		


