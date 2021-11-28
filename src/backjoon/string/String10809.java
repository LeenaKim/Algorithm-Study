package backjoon.string;
import java.io.IOException;
import java.util.Scanner;
/*
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
 * 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
 * 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 */
public class String10809 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		for(char c = 'a'; c <= 'z'; c++) {
			for(int i = 0; i < word.length(); i++) {
			
				if(c == word.charAt(i)) {
					System.out.print(i);
					break;
				} else {
					if(i == word.length()-1) {
						System.out.print("-1");
					}
				}
			}
			if(c != 'z') {
				System.out.print(" ");
			}
		}
	}
}
