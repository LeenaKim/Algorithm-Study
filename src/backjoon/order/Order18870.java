package backjoon.order;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
/*
 * 수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.

Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표의 개수와 같아야 한다.

X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.
 */
/*
 * 첫째 줄에 N이 주어진다.

둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.
 */
/*
 * 첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.
 */
public class Order18870 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] xs = new int[n];
		String[] input = br.readLine().split(" ");
		HashMap<Integer, Integer> rankMap = new HashMap<>();
		for(int i = 0; i < n; i++) {
			xs[i] = Integer.parseInt(input[i]);
		}
		
		int[] xsClone = xs.clone();
		Arrays.sort(xs);
		
		int idx = 0;
		for(int i = 0; i < n; i++) {
			if(!rankMap.containsKey(xs[i])) {
				rankMap.put(xs[i], idx++);				
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(rankMap.get(xsClone[i])).append(' ');
		}
		System.out.print(sb.toString());
	}
}
