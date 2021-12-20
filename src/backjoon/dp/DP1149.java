package backjoon.dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * i번째 집을 각각의 색으로 칠할 때, 1~i번째 집을 모두 칠하는 최소 비용으로 부분문제를 정의해봅시다.
 * RGB거리에는 집이 N개 있다. 거리는 선분으로 나타낼 수 있고, 1번 집부터 N번 집이 순서대로 있다.

집은 빨강, 초록, 파랑 중 하나의 색으로 칠해야 한다. 각각의 집을 빨강, 초록, 파랑으로 칠하는 비용이 주어졌을 때, 아래 규칙을 만족하면서 모든 집을 칠하는 비용의 최솟값을 구해보자.

1번 집의 색은 2번 집의 색과 같지 않아야 한다.
N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.
 */
/*
 * 첫째 줄에 집의 수 N(2 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 각 집을 빨강, 초록, 파랑으로 칠하는 비용이 1번 집부터 한 줄에 하나씩 주어진다. 집을 칠하는 비용은 1,000보다 작거나 같은 자연수이다.
 */
/*
 * 첫째 줄에 모든 집을 칠하는 비용의 최솟값을 출력한다.
 */
public class DP1149 {
	
	public static int[][] cost;		// 입력값으로 받은 집마다 칠하는 비용 
	public static int[][] dp;		// 누적합을 저장할 배열 
	public static int n;			// 집의 개수 
	
	
	
	public static int paint_cost(int from, int color) {
		
		// 1~i 번째 집을 모두 칠하는 최소비용 구하기 
		if(dp[from][color] == 0) {
			// 색상에 따라 이전 집의 서로 다른 색을 재귀호출하여 최솟값과 현재 집의 비용을 더해 DP에 저장 
			if(color == 0) {
				dp[from][color] = Math.min(paint_cost(from - 1, 1), paint_cost(from - 1, 2)) + cost[from][0];
			} else if(color == 1) {
				dp[from][color] = Math.min(paint_cost(from - 1, 0), paint_cost(from - 1, 2)) + cost[from][1];				
			} else {
				dp[from][color] = Math.min(paint_cost(from - 1, 0), paint_cost(from - 1, 1)) + cost[from][2];
				
			}
		}
		
		return dp[from][color];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		cost = new int[n][3];
		dp = new int[n][3];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 3; j++) {
				cost[i][j] = Integer.parseInt(st.nextToken());				
			}
		}
		
		// DP의 첫번째 집은 각 색상비용의 첫번째 값으로 초기화 
		dp[0][0] = cost[0][0];
		dp[0][1] = cost[0][1];
		dp[0][2] = cost[0][2];
		
		for(int i = 0; i < 3; i++) {
			paint_cost(n-1, i);
			
		}
		int min = dp[n-1][0];
		for(int i = 1; i < 3; i++) {
			if(dp[n-1][i] < min) {
				min = dp[n-1][i];
			}
		}
		System.out.println(min);
	}
}
