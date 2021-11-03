package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.

N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.
 */
/*
 * 첫째 줄에 N이 주어진다. (1 ≤ N < 15)
 */
/*
 * 첫째 줄에 퀸 N개를 서로 공격할 수 없게 놓는 경우의 수를 출력한다.
 */
public class Backtracking9663 {

	public static int[] arr;
	public static int cnt;
	
	public static boolean isAvailable(int col) {
		for(int i = 0; i < col; i++) {
			if(arr[col] == arr[i]) return false; // 두 열의 행의 값이 같은경우 
			if(Math.abs(arr[col] - arr[i]) == Math.abs(col - i)) return false; // 대각선에 놓인 경우 
		}
		return true;
	}
	public static void dfs(int n, int depth) {
		// 마지막 열의 행까지 다 찾았을 시  
		if(depth == n) {
			cnt++;
			return;
		}
		
		// 각 열의 행을 0부터 n까지 대입시킨다.  
		for(int i = 0; i < n; i++) {
			arr[depth] = i;
			// 대입시킨 arr[depth]가 퀸을 놓을 수 있는 위치이면 재귀호출, 아니면 반복문 i값을 늘려 계속 탐색  
			if(isAvailable(depth)) {
				dfs(n, depth + 1);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n]; // n개의 열로 된 배열 생성 
		cnt = 0;
		dfs(n, 0);
		
		System.out.println(cnt);
	}
}
