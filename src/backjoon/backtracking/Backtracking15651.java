package backjoon.backtracking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

1부터 N까지 자연수 중에서 M개를 고른 수열
같은 수를 여러 번 골라도 된다.
 */
/*
 * 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 7)
 */
/*
 * 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.

수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 */
public class Backtracking15651 {

	public static int[] arr;		// 탐색과정에서 값을 담을 int 배열 
	public static StringBuilder sb = new StringBuilder();
	
	public static void dfs(int N, int M, int depth) {
		if(depth == M) { // depth를 하나씩 늘리다가 m과 같아지면 탐색을 중단하고 탐색과정 중 값을 담았던 arr 배열 출력 
			for(int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append('\n');
			return;
		}
		
		// 15649 문제와 똑같지만, 중복체크를 하는 visit 로직만 없애면 된다.
		for(int i = 0; i < N; i++) {
			arr[depth] = i + 1;				// 해당 깊이를 index로 하여 i + 1 값 저장 
			dfs(N, M, depth + 1);	// 다음 자식 노드 방문을 위해 depth 1 증가시키며 재귀호출 
				
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		arr = new int[m];
		dfs(n, m, 0);
		System.out.println(sb);
	}
}
