/*
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 
이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 
순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

제한 사항
numbers의 길이는 1 이상 100,000 이하입니다.
numbers의 원소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
입출력 예
numbers	return
[6, 10, 2]	6210
[3, 30, 34, 5, 9]	9534330
 */
package codingtest;
import java.util.*;
public class ProgrammersStepTwo_가장큰수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {30, 9, 5, 34, 3};
		String answer="";
		String[] numStr=new String[numbers.length];
		
		// 정수형 배열을 문자형 배혈화하기 
		for(int i=0; i<numbers.length; i++) {
			numStr[i]=Integer.toString(numbers[i]);
			System.out.println(numStr[i]);
		}
		
		// 문자열 배열 내 각 원소의 첫번째 자리수를 기준으로 내림차순 정렬하기 
		for(int i=0; i<numStr.length; i++) {
			for(int j=0; j<numStr.length-i-1; j++) {
				
				if(numStr[j].charAt(0)<numStr[j+1].charAt(0)) {
					String temp=numStr[j];
					numStr[j]=numStr[j+1];
					numStr[j+1]=temp;
				}
				else if(numStr[j].charAt[0]==numStr[j+1].charAt(0)) {
					
					
				}
				
			}
		}
		
		// 그냥 정수형 자료일때 바로 계산해보자. 
		/*ArrayList<Integer> arr=new ArrayList<Integer>();
		int[] firstNum = new int [numbers.length];
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]/1000>=1) {
				firstNum[i]=numbers[i]/1000;	
			} else if(numbers[i]/100>=1) {
				firstNum[i]=numbers[i]/100;
			} else if(numbers[i]/10>=1) {
				firstNum[i]=numbers[i]/10;
			} else if(numbers[i]/10==0) {
				firstNum[i]=numbers[i];
			}
		}
		
		for(int i=0; i<firstNum.length; i++) {
			for(int j=i+1; j<firstNum.length; j++) {
				if(firstNum[i]==firstNum[j])
			}
		*/	
		}
		for(int a:firstNum) {
			System.out.println(a);
		}
		
		
	}

}
