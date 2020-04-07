/*
데이터 처리 전문가가 되고 싶은 어피치는 문자열을 압축하는 방법에 대해 공부를 하고 있습니다. 
최근에 대량의 데이터 처리를 위한 간단한 비손실 압축 방법에 대해 공부를 하고 있는데, 
문자열에서 같은 값이 연속해서 나타나는 것을 그 문자의 개수와 반복되는 값으로 표현하여 
더 짧은 문자열로 줄여서 표현하는 알고리즘을 공부하고 있습니다.

간단한 예로 aabbaccc의 경우 2a2ba3c(문자가 반복되지 않아 한번만 나타난 경우 1은 생략함)와 같이 표현할 수 있는데, 
이러한 방식은 반복되는 문자가 적은 경우 압축률이 낮다는 단점이 있습니다. 
예를 들면, abcabcdede와 같은 문자열은 전혀 압축되지 않습니다. 
어피치는 이러한 단점을 해결하기 위해 문자열을 1개 이상의 단위로 잘라서 압축하여 더 짧은 문자열로 표현할 수 있는지 방법을 찾아보려고 합니다.

예를 들어, ababcdcdababcdcd의 경우 문자를 1개 단위로 자르면 전혀 압축되지 않지만, 
2개 단위로 잘라서 압축한다면 2ab2cd2ab2cd로 표현할 수 있습니다. 
다른 방법으로 8개 단위로 잘라서 압축한다면 2ababcdcd로 표현할 수 있으며, 
이때가 가장 짧게 압축하여 표현할 수 있는 방법입니다.

다른 예로, abcabcdede와 같은 경우, 문자를 2개 단위로 잘라서 압축하면 abcabc2de가 되지만, 
3개 단위로 자른다면 2abcdede가 되어 3개 단위가 가장 짧은 압축 방법이 됩니다. 
이때 3개 단위로 자르고 마지막에 남는 문자열은 그대로 붙여주면 됩니다.

압축할 문자열 s가 매개변수로 주어질 때, 위에 설명한 방법으로 1개 이상 단위로 문자열을 잘라 
압축하여 표현한 문자열 중 가장 짧은 것의 길이를 return 하도록 solution 함수를 완성해주세요.

제한사항
s의 길이는 1 이상 1,000 이하입니다.
s는 알파벳 소문자로만 이루어져 있습니다.
입출력 예
s	result
"aabbaccc"	7
"ababcdcdababcdcd"	9
"abcabcdede"	8
"abcabcabcabcdededededede"	14
"xababcdcdababcdcd"	17
입출력 예에 대한 설명
입출력 예 #1

문자열을 1개 단위로 잘라 압축했을 때 가장 짧습니다.

입출력 예 #2

문자열을 8개 단위로 잘라 압축했을 때 가장 짧습니다.

입출력 예 #3

문자열을 3개 단위로 잘라 압축했을 때 가장 짧습니다.

입출력 예 #4

문자열을 2개 단위로 자르면 abcabcabcabc6de 가 됩니다.
문자열을 3개 단위로 자르면 4abcdededededede 가 됩니다.
문자열을 4개 단위로 자르면 abcabcabcabc3dede 가 됩니다.
문자열을 6개 단위로 자를 경우 2abcabc2dedede가 되며, 이때의 길이가 14로 가장 짧습니다.

입출력 예 #5

문자열은 제일 앞부터 정해진 길이만큼 잘라야 합니다.
따라서 주어진 문자열을 x / ababcdcd / ababcdcd 로 자르는 것은 불가능 합니다.
이 경우 어떻게 문자열을 잘라도 압축되지 않으므로 가장 짧은 길이는 17이 됩니다.
 */
package codingtest;
import java.util.ArrayList;
public class ProgrammersStepTwo_문자열압축 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int a=1;
		// 한개로 묶을때
		int cntt=1;
		for(int i=0; i+1<=s.length(); i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				cntt++;
			}
			else if (s.charAt(i)!=s.charAt(i+1)||i+1==s.length()) {
				if(cntt>1) {
					answer=answer+Integer.toString(cntt)+s.charAt(i);
					cntt=1;
				}
				else answer+=s.charAt(i);
			}
		}
		*/
		
		String s="abababc";
		String answer="";
		
		// 압축된 문자열의 길이를 반환할 ArrayList변수 len 생
		ArrayList<Integer> len = new <Integer>ArrayList();
		
		// 중복된 문자의 개수를 셀 정수형 변수 cnt 생
		int cnt=1;
		
		// 비교할 문자의 개수 i는 1부터 전체 문자열의 반까지 1씩 증가하며 비교한다. 
		// 비교할 문자의 개수는 전체 문자열 길이의 반보다 많을 수 없기 때문. (최소 두개의 반복되는 집단이 나와야 하기 문)
		for(int i=1; i<=s.length()/2; i++) {
			// 문자열 s의 인덱스 j는 0부터, 비교할 문자의 개수인 i만큼 증가하며 요소 문자를 비교한다. 
			// 이 때, (j ~ j+i), (j+i ~ j+2*i) 두 집단을 비교하므로 조건문은 j<=s.length()-2*i가 된다. 
			for(int j=0; j <= s.length()-2*i; j+=i) {
				// j와 i가 증가할때마다 어디부터 어디까지의 문자열을 비교하는지 보기 위해 반복문이 돌아갈때마다 출력해본다.
				System.out.printf("%s, %s\n", s.substring(j, j+i), s.substring(j+i, j+2*i));
				// (j ~ j+i)의 문자열이 (j+i ~ j+2*i)와 같다면 중복된다는 것이므로 카운트를 늘려준다.
				if(s.substring(j, j+i).equals(s.substring(j+i, j+2*i))) {
					cnt++;
					// 만약 문자열이 중복되는데(앞의 if문 만족) 해당 인덱스가 마지막 인덱스라면 answer에 중복된 횟수와 중복된 문자열 구간을 추가한다.
					if(j+i>=s.length()-2*i) {
						answer=answer+Integer.toString(cnt)+s.substring(j, j+i)+s.substring(j+2*i, s.length());
						cnt=1;
					}
				} 
				if(j+2*i>=s.length()) {
					answer=answer+s.substring(j, s.length());
				}
				// 만약 (j ~ j+i)의 문자열이 (j+i ~ j+2*i)의 문자열과 같지 않다면 두 경우로 나누어 생각한다.
				else if(!s.substring(j, j+i).equals(s.substring(j+i, j+2*i))){
					// 만약 cnt가 1보다 크면 현재 비교하는 문자열 전에 이미 중복된 다른 문자열이 있다는 소리이므로 저장된 cnt와 현재 비교하는 문자열 직전의 문자열(j-i, j)을 추가한다.
					if(cnt>1) {
						if(j-i>=0)
							answer=answer+Integer.toString(cnt)+s.substring(j-i,j);
							cnt=1;
						// cnt가 1보다 큰데 j가 마지막 인덱스라면 마지막까지 다 출력해준다.
						//if(j==s.length()-2*i-1) {
							//answer+=s.substring(j+i, j+2*i+1);
						//}
					// 만약 cnt가 1이면 현재 돌고있는 s[j]가 중복되는게 없으면서 그 직전 문자도 중복이 안됫다는 것.
					} 
					else if(cnt==1) {
						// 만약 그 j가 마지막 인덱스라
						/*if(j==s.length()-2*i) {
							 그 중에서도 비교하는 문자열의 가장 끝 인덱스인 j+2*i가 전체 문자열의 크기를 벗어난다면 비교를 할 수가 없으므로 j+i부터 문자열 끝까지 다 추가해준다.
							if(j+2*i>s.length()) {
								answer=s.substring(j+i, s.length());
							}
							else {*/
						
								answer=answer+s.substring(j, j+i)+s.substring(j+i, j+2*i);
							//}
						}
						/*else {
							answer+=s.substring(j, j+i);
						}*/
					//}
					
				}
				
			}
			System.out.println(answer);
			len.add(answer.length());
			answer="";
		}
		System.out.println(len);
		
	}

}
