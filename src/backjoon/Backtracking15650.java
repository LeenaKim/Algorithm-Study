package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
고른 수열은 오름차순이어야 한다.
 */
/*
 * 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
 */
/*
 * 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.

수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 */
public class Backtracking15650 {
	
	public static int[] arr;
	public static boolean[] visited;
	
	public static void dfs(int N, int M, int depth, int from) {
		if(depth == M) {
			for(int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = from; i < N; i++) {
			arr[depth] = i + 1;
//			System.out.println("i : " + i + ", depth : " + depth + ", arr[" + depth + "] : " + arr[depth] + ", from : " + from);
			
			dfs(N, M, depth + 1, i+1);
		}
		return;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nm = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		
		arr = new int[m];
		dfs(n, m, 0, 0);
		
	}
}
