package backjoon.dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP1003 {

	public static int[] cases;
	public static int[] fibo_memo = new int[45]; // 결과를 기록할 공간. 자바 최대 int 메모리로 가능한 피보나치 수는 45번째까지 
	public static int cnt_0;
	public static int cnt_1;
	
	public static void setFiboMemo(int n) {
		for(int i = 2; (i <= n) && (i < 45); i++) {
			fibo_memo[i] = fibo_memo[i-2] + fibo_memo[i-1];
		}
		getFiboMemo(n);
	}
	
	public static void getFiboMemo(int n) {
		if(n == 0) ++cnt_0;
		else if(n == 1) ++cnt_1;
	}
	
	public static void main(String[] args) throws IOException {
		fibo_memo[0] = 0;
		fibo_memo[1] = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		cases = new int[T];
		for(int i = 0; i < T; i++) {
			cnt_0 = 0;
			cnt_1 = 0;
//			cases[i] = Integer.parseInt(br.readLine());
			setFiboMemo(Integer.parseInt(br.readLine()));
			System.out.print(cnt_0 + " " + cnt_1);
		}
	}
}
