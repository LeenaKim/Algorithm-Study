package backjoon.order;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
 * 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

길이가 짧은 것부터
길이가 같으면 사전 순으로
 */
/*
 * 첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.
 */
/*
 * 조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
 */
public class Order1181 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] words = new String[n];
		for(int i = 0; i < n; i++) {
			words[i] = br.readLine();
		}
		
		Arrays.sort(words, (e1, e2) -> {
			if(((String) e1).length() == ((String)e2).length()) {
//				int i = 0; 
//				while(i < ((String) e1).length()) {
//					if(((String) e1).charAt(i) != ((String) e2).charAt(i)) {
//						return ((String) e1).charAt(i) - ((String) e2).charAt(i);
//					}
//					i++;
//				}
				return e1.compareTo(e2);
			} else {
				return ((String) e1).length() - ((String)e2).length();
			}
		});
		
		for(int i = 0; i < n; i++) {
			if(i == n-1) {
				System.out.println(words[i]);
			} else {
				if(!words[i].equals(words[i+1])) {
					System.out.println(words[i]);
				}				
			}
		}
	}
}
