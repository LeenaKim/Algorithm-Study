package backjoon.dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 45656이란 수를 보자.

이 수는 인접한 모든 자리의 차이가 1이다. 이런 수를 계단 수라고 한다.

N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구해보자. 0으로 시작하는 수는 계단수가 아니다.
 */
/*
 * 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.
 */
/*
 * 첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.
 */
public class DP10844 {

	public static Long[][] memo = new Long[10][101];
	public static long MOD = 1000000000;
	/**
	 * 
	 * @param n : 시작하는 10 미만의 숫자 
	 * @param len : 계단수의 개수를 구하고자 하는 숫자의 길이 
	 * @return
	 */
	public static Long dp(int n, int len) {
		if(memo[n][len] == null) {
			// 시작하는 수가 9면 10으로 시작하는 계단수는 없기때문에 예외처리 
			if(n + 1 > 9) {
				memo[n][len] = dp(n-1, len-1);
			} else if(n - 1 < 0) {
				memo[n][len] = dp(n+1, len-1);								
			} else {
				memo[n][len] = dp(n-1, len-1) + dp(n+1, len-1);				
			}
		}
		return memo[n][len] % MOD;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i <= 9; i++) {
			memo[i][1] = (long) 1;
		}
		long cnt = 0;
		for(int i = 1; i <= 9; i++) {
			cnt += dp(i, n);
		}
		System.out.println(cnt % MOD);
		
	}
}
