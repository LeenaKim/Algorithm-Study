package backjoon.dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * 위 그림은 크기가 5인 정수 삼각형의 한 모습이다.

맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라. 아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.

삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 수는 모두 정수이며, 범위는 0 이상 9999 이하이다.
 */
/*
 * 
첫째 줄에 삼각형의 크기 n(1 ≤ n ≤ 500)이 주어지고, 둘째 줄부터 n+1번째 줄까지 정수 삼각형이 주어진다.
 */
/*
 * 첫째 줄에 합이 최대가 되는 경로에 있는 수의 합을 출력한다.
 */
public class DP1932 {

	public static int[][] tri;	// 입력값을 저장할 배열 
	public static int[][] dp;	// 누적합을 저장할 배열 
	
	public static int getMaxSum(int from, int idx) {
		if(dp[from][idx] == -1) {
			if(idx - 1 < 0){
				dp[from][idx] = getMaxSum(from - 1, idx) + tri[from][idx];				
			} else if(tri[from - 1][idx] == -1) {
				dp[from][idx] = getMaxSum(from - 1, idx - 1) + tri[from][idx];				
			} else {
				dp[from][idx] = Math.max(getMaxSum(from - 1, idx - 1), getMaxSum(from - 1, idx)) + tri[from][idx];								
			}
		}
		
		return dp[from][idx];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		tri = new int[n][n];
		dp = new int[n][n];
		
		// -1로 초기화 
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				tri[i][j] = -1;
				dp[i][j] = -1;
			}
		}
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < i+1; j++) {
//				if(st.nextToken() != "" || st.nextToken() != null) {
					tri[i][j] = Integer.parseInt(st.nextToken());					
//				}
			}
		}
		// dp의 첫 값은 첫 입력값으로 저장 
		dp[0][0] = tri[0][0];
		

		for(int i = 0; i < n; i++) {
			getMaxSum(n-1, i);
		}
		
		int max = dp[n-1][0];
		for(int i = 0; i < n; i++) {
			if(dp[n-1][i] > max) {
				max = dp[n-1][i];
			}
		}
		System.out.println(max);
		
		
		
		
	}
}
