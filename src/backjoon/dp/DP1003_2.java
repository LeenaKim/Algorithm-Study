package backjoon.dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DP1003_2 {

	public static int[][] fibo_memo = new int[41][2]; // 0과 1이 호출된 횟수를 기록할 공간. 
	

	public static int[] fibo(int n) {
		// n에 대한 0, 1의 호출 횟수가 없을 때(탐색하지 않은 값일때)
		if(fibo_memo[n][0] == -1 || fibo_memo[n][1] == -1) {
			fibo_memo[n][0] = fibo(n - 1)[0] + fibo(n - 2)[0];
			fibo_memo[n][1] = fibo(n - 1)[1] + fibo(n - 2)[1];
		}
		// n에 대한 0, 1을 담고있는 [n] 반환 
		return fibo_memo[n];
	}

	
	public static void main(String[] args) throws IOException {
		// 이전에 미리 입력이 안된경우를 파악하기위해(-1인 경우) -1로 초기화 
		for(int i = 0; i < fibo_memo.length; i++) {
			fibo_memo[i][0] = -1;
			fibo_memo[i][1] = -1;
		}
		fibo_memo[0][0] = 1; // n = 0일때의 0 호출 횟수 
		fibo_memo[0][1] = 0; // n = 0일때의 1 호출 횟수 
		fibo_memo[1][0] = 0; // n = 1일때의 0 호출 횟수 
		fibo_memo[1][1] = 1; // n = 1일때의 1 호출 횟수 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			int c = Integer.parseInt(br.readLine());
			fibo(c);
			sb.append(fibo_memo[c][0] + " " + fibo_memo[c][1]).append('\n');
		}
		System.out.println(sb);
	}
}
