package backjoon.recursion;
import java.io.IOException;
import java.util.Scanner;
/*
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 */
/*
 * 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
 */
/*
 * 첫째 줄에 N!을 출력한다.
 */
public class Recursion10872 {

	public static int pactorial(int n) {
		if(n == 1) return n;
		else if(n <= 0) return 1;
		else {
			return n *	pactorial(n-1);
		}
	}
	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(pactorial(n));
	}
	

	
}
