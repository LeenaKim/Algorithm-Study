package backjoon;

import java.util.Scanner;

public class AsciiString {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int number = sc.nextInt();
		char alpa = (char)number;
		System.out.println(alpa);
	}
}
