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
	
	public static void dfs() {
		
		// 정사각형이나 가로줄, 세로줄 중 빈 숫자가 하나인것 먼저 채움 
		// 하나이지 않으면 다음 빈칸으로 넘어가고 다른것부터 
		// 다시 돌아와서 못채운것 채움 
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 9; j++) {
				S[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	}
}
