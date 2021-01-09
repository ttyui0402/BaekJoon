package BaekJoon;

public class Ex_2 {

	public static void main(String[] args) {

		// 두 배열이 같은 숫자가 몇개있는지 세어서 출력. (순서상관없이) (중복없음)
		// 같은 요소가 몇개있는지 확인.
		// count++
		int[] arr = {1,2,3};
		int[] arr2 = {1,2,3};
		int count = 0;
		
		// arr[0] 과 arr2[0,1,2]를 비교
		// arr[1] 과 arr2[0,1,2]를 비교
		// arr[2] 과 arr2[0,1,2]를 비교
		// 그리고 같은 숫자일 경우 그 개수를 반환. 개수를 저장하고 보여줘야 함.
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (i == j) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		
//		if (arr[0] == arr2[0]) {
//			System.out.println("arr[0]과 arr2[0]의 내용이 같다.");
//		} else {
//			System.out.println("arr[0]과 arr2[0]의 내용이 다르다.");
//		}
//		if (arr[0] == arr2[1]) {
//			System.out.println("arr[0]과 arr2[1]의 내용이 같다.");
//		} else {
//			System.out.println("arr[0]과 arr2[1]의 내용이 다르다.");
//		}
//		if (arr[0] == arr2[2]) {
//			System.out.println("arr[0]과 arr2[2]의 내용이 같다.");
//		} else {
//			System.out.println("arr[0]과 arr2[2]의 내용이 다르다.");
//		}
//		if (arr[1] == arr2[0]) {
//			System.out.println("arr[1]과 arr2[0]의 내용이 같다.");
//		} else {
//			System.out.println("arr[1]과 arr2[0]의 내용이 다르다.");
//		}
//		if (arr[1] == arr2[1]) {
//			System.out.println("arr[1]과 arr2[1]의 내용이 같다.");
//		} else {
//			System.out.println("arr[1]과 arr2[1]의 내용이 다르다.");
//		}
//		if (arr[1] == arr2[2]) {
//			System.out.println("arr[1]과 arr2[2]의 내용이 같다.");
//		} else {
//			System.out.println("arr[1]과 arr2[2]의 내용이 다르다.");
//		}
//		if (arr[2] == arr2[0]) {
//			System.out.println("arr[2]과 arr2[0]의 내용이 같다.");
//		} else {
//			System.out.println("arr[2]과 arr2[0]의 내용이 다르다.");
//		}
//		if (arr[2] == arr2[1]) {
//			System.out.println("arr[2]과 arr2[1]의 내용이 같다.");
//		} else {
//			System.out.println("arr[2]과 arr2[1]의 내용이 다르다.");
//		}
//		if (arr[2] == arr2[2]) {
//			System.out.println("arr[2]과 arr2[2]의 내용이 같다.");
//		} else {
//			System.out.println("arr[2]과 arr2[2]의 내용이 다르다.");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
