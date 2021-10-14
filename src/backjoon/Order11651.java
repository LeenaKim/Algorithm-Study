package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
 * 2차원 평면 위의 점 N개가 주어진다. 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
 */
/*
 * 첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
 */
/*
 * 첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
 */
public class Order11651 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] xy = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			String input = br.readLine();
			xy[i][0] = Integer.parseInt(input.split(" ")[0]);
			xy[i][1] = Integer.parseInt(input.split(" ")[1]);
		}
		
		Arrays.sort(xy, (e1, e2) -> {
			if(e1[1] == e2[1]) {
				return e1[0] - e2[0]; 
			} else {
				return e1[1] - e2[1];
			}
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(xy[i][0] + " " + xy[i][1]);			
		}
	}
}
