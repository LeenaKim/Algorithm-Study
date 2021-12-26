package backjoon.dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

X가 3으로 나누어 떨어지면, 3으로 나눈다.
X가 2로 나누어 떨어지면, 2로 나눈다.
1을 뺀다.
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
 */
/*
 * -1이나 /2 를 통해 /3이 가능한 조건을 먼저 만드는게 중요(?)
 */
public class DP1463 {

	public static Integer[] memo;	// 인덱스로 표현된 n번째 배열값이 1이 될 최소횟수 
	
	public static int dp(int n) {
		if(memo[n] == null) {
			// 3과 2로 모두 나뉘어지는 경우는 n/3, n/2, n-1을 했을 모든 경우의 수의 최솟값을 구한다. 
			if(n % 6 == 0) {
				memo[n] = Math.min(dp(n - 1), Math.min(dp(n / 3), dp(n / 2))) + 1;
			// 3으로만 나눠지는 경우 
			} else if(n % 3 == 0) {
				memo[n] = Math.min(dp(n / 3), dp(n - 1)) + 1;
			// 2로만 나눠지는 경우 
			} else if(n % 2 == 0) {
				memo[n] = Math.min(dp(n / 2), dp(n - 1)) + 1;		
			// 2나 3으로도 나눠지지 않는 경우 
			} else {
				memo[n] = dp(n - 1) + 1;
			}
		}
		return memo[n];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		memo = new Integer[n + 1];
		memo[1] = 0; // 1이 연산 후 1이 될때까지의 최소 횟수 
//		memo[2] = 1; // 2가 연산 후 1이 될때까지의 최소 횟수 
//		memo[3] = 1; // 3이 연산 후 1이 될때까지의 최소 횟수 
		System.out.println(dp(n));
	}
}
