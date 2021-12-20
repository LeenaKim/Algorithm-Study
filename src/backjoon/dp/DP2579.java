package backjoon.dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * i번째 계단에 오를 때, 몇 개의 연속한 계단을 올랐는지를 고려하여 부분문제를 정의해봅시다.
 * 20부터 시작하여 가능한 모든 방법으로 시작점까지 내려간다. 
 */
public class DP2579 {

	public static int[] scores;
	public static int[] stepsMemo;		// 누적합을 저장할 배열 
	public static boolean[] visited;	// 연속 계단을 올랐는지 판단을 위한 배열 
	
	public static boolean isContinued(int n) {
		if(visited[n - 1] && visited[n + 1]) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int getMaxScores(int n) {
		if(stepsMemo[n] == 0) {
			if(!visited[n]) {
				visited[n] = true;
				if(!isContinued(n)) {
					
				} else {
					getMaxScores(n - 1);
				}
			}
		}
		return stepsMemo[n];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		scores = new int[n];
		stepsMemo = new int[n];
		visited = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			scores[i] = Integer.parseInt(br.readLine());
		}
		// 초깃값 세팅 = 1번째 계단 
		stepsMemo[0] = scores[0];
		
		getMaxScores(n-1);
	}
}
