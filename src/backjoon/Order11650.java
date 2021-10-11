package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
 */
/*
 * 첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
 */
/*
 * 첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
 */
public class Order11650 {
	public static void heap(int[][] xy, int n) {
		for(int i = 1; i < n; i++) {
			int child = i;
			while(child > 0) {
				int parent = (child - 1)/2;
				if(xy[child][0] > xy[parent][0]) {
					int tempX = xy[child][0];
					int tempY = xy[child][1];
					xy[child][0] = xy[parent][0];
					xy[child][1] = xy[parent][1];
					xy[parent][0] = tempX;
					xy[parent][1] = tempY;
				} else if(xy[child][0] == xy[parent][0]) {
					if(xy[child][1] > xy[parent][1]) {
						int tempX = xy[child][0];
						int tempY = xy[child][1];
						xy[child][0] = xy[parent][0];
						xy[child][1] = xy[parent][1];
						xy[parent][0] = tempX;
						xy[parent][1] = tempY;
					} 
				}
				child = parent;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] xy = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			xy[i][0] = Integer.parseInt(input[0]);
			xy[i][1] = Integer.parseInt(input[1]);
		}
		
		// 최대힙 
		heap(xy, n);
		
		for(int i = n - 1; i > 0; i--) {
			int tempX = xy[0][0];
			int tempY = xy[0][1];
			xy[0][0] = xy[i][0];
			xy[0][1] = xy[i][1];
			xy[i][0] = tempX;
			xy[i][1] = tempY;
			heap(xy, i);
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(xy[i][j] + " ");
			}
			System.out.println();
		}
	}
}
