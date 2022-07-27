package backjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP11053 {
	
	public static int[] orgArr;
	public static int[] dp;
	
	public static int longestArr(int idx) {
		if(dp[idx] == 0) { // 아직 탐색하지 않은 인덱스라면 
			dp[idx] = 1; // 길이는 무조건 1부터 시작이므로 1로 초기화 
			
			for(int i = idx-1; i >= 0; i--) { // 현재 위치의 dp[idx] 이전의 원소들을 탐색 
				if(orgArr[i] < orgArr[idx]) { // 현재 위치보다 작으면 작은 원소의 인덱스로 재귀 탐색 
					dp[idx] = Math.max(dp[idx], longestArr(i) + 1); // +1을 해주는 이유는 dp[idx]이 이전 부분수열에 idx번째 원소가 추가되었기 때문 
				}
			}
		}
		return dp[idx];
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		orgArr = new int[size];
		dp = new int[size];
		for(int j = 0; j < size; j++) {
			orgArr[j] = Integer.parseInt(st.nextToken());				
		}
		for(int j = orgArr.length-1; j >= 0; j--) {
			longestArr(j);				
		}
//		for(int j = 0; j < orgArr.length; j++) {
//			longestArr(j);				
//		}
		int maxLen = 0;
		for(int i : dp) {
			if(i > maxLen) {
				maxLen = i;
			}
		}
		System.out.println(maxLen);
	}

}
