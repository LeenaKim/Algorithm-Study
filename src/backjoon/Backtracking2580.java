package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * 스토쿠 
 */
public class Backtracking2580 {

	public static int[][] S = new int[9][9];
	
	public static boolean isLeftOne(int x, int y, int flag) {
		boolean res = false;
		boolean[] isNumUsed = new boolean[9];
		// 가로줄 
		if(flag == 0) {
			for(int i = 0; i < 9; i++) {
				isNumUsed[S[x][i]] = true;
				// 가로줄에 빈값이 본인 제외 또 있으면 
				if(S[x][i] == 0 && i != y) {
					break;
				} else if(S[x][i] != 0 && i == 8) {
					res = true;
				}
			}
		// 세로줄 
		} else if(flag == 1) {
			for(int i = 0; i < 9; i++) {
				isNumUsed[S[i][y]] = true;
				// 세로줄에 빈값이 본인 제외 또 있으면 
				if(S[i][y] == 0 && i != x) {
					break;
				} else if(S[i][y] != 0 && i == 8) {
					res = true;
				}
			}
		// 정사각형
		} else {
			for(int i = x / 3 * 3; i < x / 3 * 3 + 3; i++) {
				for(int j = y / 3 * 3; j < y / 3 * 3 + 3; j++) {
					isNumUsed[S[i][j]] = true;
					if(S[i][j] == 0 && i != x && j != y) {
						break;
					} else if(S[i][j] != 0 && i == x / 3 * 3 + 2 && j == y / 3 * 3 + 2) {
						res = true;
					}
				}
			}
		}
		
		if(flag == 1 || flag == 0 && !res) {
			isLeftOne(x, y, ++flag);
		} else {
			int leftNum = 0;
			for(int i = 0; i < isNumUsed.length; i++) {
				if(isNumUsed[i] == false) leftNum = i + 1;
			}
			S[x][y] = leftNum;
			return res;
		}
		return res;
		
	}
	
	public static void dfs(int fromX, int fromY, int depth) {
		if(depth == 9) {
			return;
		}
		// 정사각형이나 가로줄, 세로줄 중 빈 숫자가 하나인것 먼저 채움 
		// 하나이지 않으면 다음 빈칸으로 넘어가고 다른것부터 
		// 다시 돌아와서 못채운것 채움 
		for(int i = fromX; i < 9; i++) {
			for(int j = fromY; j < 9; j++) {
				if(S[i][j] == 0) {
					if(!isLeftOne(i, j, 0)) {
						dfs(i+1, j+1, depth + 1);						
					}
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 9; j++) {
				S[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0, 0, 0);
		for(int i = 0; i < S.length; i++) {
			for(int j = 0; j < S[i].length; j++) {
				System.out.print(S[i][j] + " ");
			}
			System.out.println();
		}
	}
}
