package backjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * 철거되어야 할 전선의 최소 개수라 하면, 
 * 거꾸로 전체 전선의 개수에서 최대한 겹치지 않게 설치 가능한 개수를 구하여 빼면, 
 * 즉 (전체 전선 개수 - 설치 가능 개수) = 철거 개수 가 되지 않을까?
한마디로 최대한 설치 가능한 개수를 구하면 된다는 뜻이다.
 */
public class DP2565 {
	public static int[][] wire; // 전깃줄 A,B 
	public static int[] dp;
	
	public static int crossLine(int idx) {
		if(dp[idx] == 0) {
			dp[idx] = 1;
		
			for(int i = idx-1; i >= 0; i--) {
				if(wire[1][i] < wire[1][idx]) { // 이전 A에 연결된 B가 현재보다 작다면, 연결할 수 있다는 의미 
					dp[idx] = Math.max(dp[idx], crossLine(i) + 1);
				}
			}
		}
		return dp[idx];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		wire = new int[2][n];
		dp = new int[n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			wire[0][i] = Integer.parseInt(st.nextToken()); // A 전깃줄 
			wire[1][i] = Integer.parseInt(st.nextToken()); // B 전깃줄 
		}
		// A를 기준으로 버블정렬 
		for(int i = n-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(wire[0][j] > wire[0][j+1]) {
					int temp = wire[0][j]; // A
					int temp2 = wire[1][j]; // B
					// swap
					wire[0][j] = wire[0][j+1];
					wire[1][j] = wire[1][j+1];
					wire[0][j+1] = temp;
					wire[1][j+1] = temp2;
				}
			}
		}
		// 정렬 결과 출력 
//		for(int i = 0; i < 2; i++) {
//			System.out.println();
//			for(int j = 0; j < n; j++) {
//				System.out.print(wire[i][j] + " ");
//			}
//		}
		for(int i = n-1; i >= 0; i--) {
			crossLine(i);
		}
		
//		for(int i : dp) {
//			System.out.println(i);
//		}
		
		// 최댓값 찾기 
		int max = dp[0];
		for(int i = 1; i < dp.length; i++) {
			if(dp[i] > max) {
				max = dp[i];
			}
		}
		System.out.println(n - max); // 전체 전깃줄 - 곂치지 않고 연결할 수 있는 전깃줄 수 = 끊어야 할 전깃줄 수 
	}
}
