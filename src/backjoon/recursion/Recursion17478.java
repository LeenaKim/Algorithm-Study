package backjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion17478 {
	public static int n;
	// 반복되는 문장 배열 
	public static String[] recurStr = {"\"재귀함수가 뭔가요?\"\n", 
			"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n",  
			"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n",
			"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n"};
	// 마지막 재귀에만 출력될 정답 
	public static String answer = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
	
	public static String recur(String str, String recurEnd) {
		
		// 마지막 재귀일시 반복되는 문장 배열의 첫문장과 정답을 담고 반환 
		if(n == 0) { 
			str += recurStr[0];
			str += answer;
			return str;
		}
		// 문장 배열을 반복하며 반환할 문장에 추가하고, 재귀가 호출된 횟수만큼 "____" 추가 
		for(int i = 0; i < recurStr.length; i++) {
			str += recurStr[i];
			recurStr[i] = "____" + recurStr[i];
		}
		
		--n;
		// 재귀 호출 횟수에 따라 마지막에만 호출될 정답도 "____"가 추가되어야 함 
		answer = "____" + answer;
		recurEnd = "____" + recurEnd;
		// 수정된 str과 recurEnd 를 매개변수로 재귀호출 
		str = recur(str, recurEnd);
		// 재귀를 마치고 돌아오면 recurEnd 추가 
		str += recurEnd;
		
		return str;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine()); // 문장 반복 횟수 
		String str = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n";
		System.out.println(recur(str, "라고 답변하였지.\n") + "라고 답변하였지.\n");
	}
}
