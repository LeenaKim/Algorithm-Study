package backjoon.dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP9184 {

	public static int[][][] nums = new int[21][21][21];
	
	// 배열이기때문에 배열 범위 밖으로 나가면 에러남을 방지 
	public static boolean inRange(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c<= 20;
	}
	
	public static int w(int a, int b, int c) {
		// 범위에 들고 저장된 값이 있으면 반환 
		if(inRange(a, b, c) && nums[a][b][c] != 0) {
			return nums[a][b][c];
		}
		if(a <= 0 || b <= 0 || c <= 0) {
			return 1;
		} 
		if(a > 20 || b > 20 || c > 20) {
			return nums[20][20][20] = w(20, 20, 20);
		} 
		if(a < b && b < c) {
			return nums[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		} 
		return nums[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a == -1 && b == -1 && c == -1) {
				break;
			}
			System.out.println("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c));
		}
		
	}
}
