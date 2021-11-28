package backjoon.backtracking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * 스토쿠 
 */
public class Backtracking2580 {

	public static int[][] S = new int[9][9];
	
	public static boolean isLeftOne(int x, int y, int value) {
		// 가로줄 
		for(int i = 0; i < 9; i++) {
			// 가로줄에 곂치는 원소가 있는지 검사 
			if(S[x][i] == value) {
				return false;
			}
		}
		// 세로줄 
		for(int i = 0; i < 9; i++) {
			// 세로줄에 곂치는 원소가 있는지 검사 
			if(S[i][y] == value) {
				return false;
			} 
		}
		// 정사각형 
		for(int i = (x / 3) * 3; i < (x / 3) * 3 + 3; i++) {
			for(int j = (y / 3) * 3; j < (y / 3) * 3 + 3; j++) {
				if(S[i][j] == value) {
					return false;
				} 
			}
		}
		
		
		return true; 
	}
	
	public static void dfs(int x, int y) {
		// 열이 9로 모두 채워졌을 경우, 행을 바꿔 다시 호출 
		if(y == 9) {
			dfs(x + 1, 0);
			return;
		}
		
		// 행이 9로 모두 채워졌을 경우, 배열을 출력 
		if(x == 9) {
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					sb.append(S[i][j]).append(' ');
				}
				sb.append('\n');
			}
			System.out.print(sb);
			System.exit(0); // 프로그램 종료 
		}
		
		// 해당 위치가 0이라면 1부터 9까지 중 가능한 수 탐색 
		if(S[x][y] == 0) {
			for(int i = 1; i <= 9; i++) {
				if(isLeftOne(x, y, i)) {
					S[x][y] = i; // 해당 수가 가능하다면 배열에 할당하고 열을 늘려 재귀호출 
					dfs(x, y+1);
				}
			}
			S[x][y] = 0;
			return;
		}
		// 0이 아니면 열을 하나씩 늘려 다시 탐색 
		dfs(x, y + 1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 9; j++) {
				S[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0, 0);
	}
}
