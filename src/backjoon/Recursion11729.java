package backjoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * 세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다. 각 원판은 반경이 큰 순서대로 쌓여있다. 이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다.

한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라. 단, 이동 횟수는 최소가 되어야 한다.
 */
/*
 * 첫째 줄에 첫 번째 장대에 쌓인 원판의 개수 N (1 ≤ N ≤ 20)이 주어진다.
 */
/*
 * 첫째 줄에 옮긴 횟수 K를 출력한다.

두 번째 줄부터 수행 과정을 출력한다. 두 번째 줄부터 K개의 줄에 걸쳐 두 정수 A B를 빈칸을 사이에 두고 출력하는데, 이는 A번째 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻이다.
 */
public class Recursion11729 {
	
	// 원판의 움직임 출력 
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void move(int n, String from, String to) throws IOException {
		bw.write(from + " " + to + "\n");
	}
	public static void hanoi(int n, String from, String to, String via) throws IOException {
		if(n == 1) {
			move(n, from, to);
		} else {
			hanoi(n-1, from, via, to);  // n-1개를 먼저 1에서 2로 이동 
			move(n, from, to); 			// 가장 무거운걸 3으로 이동 
			hanoi(n-1, via, to, from);  // 2로 옮겨놨던 n-1개를 3으로 이
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println((int)Math.pow(2, n)-1); // 원판을 움직이는 회수 
		hanoi(n, "1", "3", "2");
		bw.close();
		
	}
}
