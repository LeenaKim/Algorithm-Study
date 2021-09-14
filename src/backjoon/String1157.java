package backjoon;
import java.io.IOException;
import java.util.Scanner;
/*
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 
 * 알아내는 프로그램을 작성하시오. 
 * 단, 대문자와 소문자를 구분하지 않는다.
 */
/*
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 
 * 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 */
/*
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
 * 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */
public class String1157 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next().toUpperCase();
		
		/*
		int[] cnts = new int[word.length()];
		
		for(int i = 0; i < word.length(); i++) {
			int cnt = 1;
			for(int j = i + 1; j < word.length(); j++) {
				if(word.charAt(i) == word.charAt(j)) {
					cnt++;
				}
			}
			cnts[i] = cnt;
		}
		int max = cnts[0];
		int maxIdx = 0;
		int maxCnt = 0;
		for(int i = 0; i < cnts.length; i++) {
			if(max < cnts[i]) {
				max = cnts[i];
				maxIdx = i;
			}
		}
		for(int i = 0; i < cnts.length; i++) {
			if(cnts[i] == max) {
				maxCnt++;
			}
		}
		System.out.println(maxCnt > 1 ? "?" : word.charAt(maxIdx));
		*/
		int[] cnts = new int[26];
		for(int i = 0; i < word.length(); i++) {
			cnts[word.charAt(i) - 'A']++;
		}
		
		int max = -1;
		char result = '?';
		for(int i = 0; i < cnts.length; i++) {
			if(cnts[i] > max) {
				max = cnts[i];
				result = (char)(i + 65);
			} else if(cnts[i] == max) {
				result = '?';
			}
		}
		System.out.println(result);
		
	}
}
