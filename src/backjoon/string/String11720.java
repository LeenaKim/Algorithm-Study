package backjoon.string;

import java.io.IOException;
import java.util.Scanner;
/*
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 */
public class String11720 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();			// 숫자의 갯수 
		String nums = sc.next();	// 숫자 나열 
		
		int sum = 0;
		for(int i = 0; i < cnt; i++) {
//			int num  = Character.getNumericValue(nums.charAt(i));
			sum += nums.charAt(i)-'0';	// charAt 사용시 아스키코드가 아닌 실제 입력값 정수를 사용하기 위해 -'0'
		}
		System.out.println(sum);
    }
}
