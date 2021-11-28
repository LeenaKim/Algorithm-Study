package backjoon.basicMath;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
/*
 * 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.

달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
 */
/*
 * 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
 */
/*
 * 첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
 */
public class BasicMath2869 {

	public static void main(String[] args) throws IOException {
		// Scanner은 시간초과가 된다. 
		/*
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();		// 하루에 올라가는 높이 
		int b = sc.nextInt();	// 하루에 떨어지는 높이 
		int v = sc.nextInt();	// 막대의 길이 
		
		int days = (v-b) / (a-b);
		
		if((v-b) % (a-b) != 0) days++;
		
		System.out.println(days);
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int days = (v-b) / (a-b);
		
		if((v-b) % (a-b) != 0) days++;
		
		System.out.println(days);
		
	}
}
