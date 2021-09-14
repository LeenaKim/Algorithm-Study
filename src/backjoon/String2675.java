package backjoon;
import java.io.IOException;
import java.util.Scanner;
/*
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
 * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. 
 * S에는 QR Code "alphanumeric" 문자만 들어있다.
QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 */
/*
 * 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
 * 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. 
 * S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
 */
public class String2675 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int testCaseCnt = Integer.parseInt(sc.nextLine());

		int[] testRepeatCnt = new int[testCaseCnt];
		String[] testRepeatStr = new String[testCaseCnt];
		
		String ttlCaseInput = "";
		for(int i = 0; i < testCaseCnt; i++) {
			ttlCaseInput = sc.nextLine();
			String[] splitedStr = ttlCaseInput.split(" ");
			testRepeatCnt[i] = Integer.parseInt(splitedStr[0]);
			testRepeatStr[i] = splitedStr[1];
		}
		for(int i = 0; i < testCaseCnt; i++) {
			for(int j = 0; j < testRepeatStr[i].length(); j++) {
				for(int h = 0; h < testRepeatCnt[i]; h++) {
					System.out.print(testRepeatStr[i].charAt(j));
				}
			}
			System.out.println();
		}
		
	}
}
