import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {

//  첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
//  입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
//  첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)

        Scanner sc = new Scanner(System.in);
        System.out.println("시간과 분을 차례대로 입력해주세요.");

        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        // 분의 범위가 45 미만이면 시간이 1 줄어야 한다.
        // 분의 범위가 45이상이면 시간은 바뀌지 않고, 분을 60에서 45를 뺀다.
        // 시간이 0시 이고, 45 미만인 경우의 시간은 23으로 설정한다.

        // 입력한 분이 45분보다 작을 경우,
        if (m < 45) {
            h--;
            m = 60 - ( 45 - m );
            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        // 입력한 분이 45분보다 클 경우,
        } else {
            System.out.println(h + " " + (m - 45));
        }
    }
}
