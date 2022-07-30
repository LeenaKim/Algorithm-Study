package backjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DP12865 {
	public static int maxWeight;
	public static int[][] obj;
	public static int[][] dp;
	
	public static int biggestValue(int idx, int weightSum) {
		if(dp[1][idx] == 0) {
			dp[0][idx] = obj[0][idx]; // weight
			dp[1][idx] = obj[1][idx]; // value
			//weightSum = obj[0][idx];
			
			if(obj[0][idx] > maxWeight) {
				return 0;
			}
			
			for(int i = idx-1; i >= 0; i--) {
				if(weightSum + obj[0][i] <= maxWeight) {
					dp[1][idx] = Math.max(dp[1][idx], biggestValue(i, weightSum + obj[0][i]) + obj[1][idx]);
				}
			}
		}
		return dp[1][idx];
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		maxWeight = Integer.parseInt(st.nextToken());
		
		obj = new int[2][n];
		dp = new int[2][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			obj[0][i] = Integer.parseInt(st.nextToken()); // weight
			obj[1][i] = Integer.parseInt(st.nextToken()); // value
		}
		
		for(int i = n-1; i >= 0; i--) {
			biggestValue(i, obj[0][i]);
		}
		
		for(int i : dp[1]) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 최댓값 찾기 
		int max = dp[1][0];
		for(int i = 1; i < dp[1].length; i++) {
			if(dp[1][i] > max) {
				max = dp[1][i];
			}
		}
		System.out.println(max);
	}	
}
