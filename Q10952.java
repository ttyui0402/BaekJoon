import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10952 {
    public static void main(String[] args) throws IOException {
        // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하라.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {

            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0) {
                break;
            }
            sb.append((a+b)).append('\n');
        }
        System.out.println(sb);
    }
}
