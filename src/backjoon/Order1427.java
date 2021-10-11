package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 */
/*
 * 첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
 */
/*
 * 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 */
public class Order1427 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		String res = "";
		
		for(int i = 9; i >= 0; i--) {
			for(int j = 0; j < n.length(); j++) {
				if((char)i + '0' == n.charAt(j)) {
					res += n.charAt(j);
				}
			}
		}
		
		System.out.println(res);
	}
}
