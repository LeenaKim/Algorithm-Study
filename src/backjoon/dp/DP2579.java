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
	public static Integer[] stepsMemo;		// 누적합을 저장할 배열 
	
	public static int getMaxScores(int n) {
			
		if(stepsMemo[n] == null) {
			// 2계단 아래의 점수와, 3계단 아래의 점수 + 1계단 아래의 점수 중 큰 값에, 현재 계단의 점수를 합한 것 
			stepsMemo[n] = Math.max(getMaxScores(n - 2), getMaxScores(n - 3) + scores[n - 1]) + scores[n];
		} 
		return stepsMemo[n];				
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		scores = new int[n + 1];
		stepsMemo = new Integer[n + 1];
		
		for(int i = 1; i <= n; i++) {
			scores[i] = Integer.parseInt(br.readLine());
		}
		// 초깃값 세팅 
		stepsMemo[0] = scores[0];	// 시작점 
		stepsMemo[1] = scores[1];	// 1번째 계단 

		// n = 1 인 경우를 대비해 예외처리 -> n 이 2 이상일 경우 
		if(n >= 2) {
			stepsMemo[2] = scores[1] + scores[2];
		}
		System.out.println(getMaxScores(n));
	}
}
