/*
0 �Ǵ� ���� ������ �־����� ��, ������ �̾� �ٿ� ���� �� �ִ� ���� ū ���� �˾Ƴ� �ּ���.

���� ���, �־��� ������ [6, 10, 2]��� [6102, 6210, 1062, 1026, 2610, 2106]�� ���� �� �ְ�, 
���� ���� ū ���� 6210�Դϴ�.

0 �Ǵ� ���� ������ ��� �迭 numbers�� �Ű������� �־��� ��, 
������ ���ġ�Ͽ� ���� �� �ִ� ���� ū ���� ���ڿ��� �ٲپ� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
numbers�� ���̴� 1 �̻� 100,000 �����Դϴ�.
numbers�� ���Ҵ� 0 �̻� 1,000 �����Դϴ�.
������ �ʹ� Ŭ �� ������ ���ڿ��� �ٲپ� return �մϴ�.
����� ��
numbers	return
[6, 10, 2]	6210
[3, 30, 34, 5, 9]	9534330
 */
package codingtest;
import java.util.*;
public class ProgrammersStepTwo_����ū�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {30, 9, 5, 34, 3};
		String answer="";
		String[] numStr=new String[numbers.length];
		
		// ������ �迭�� ������ ����ȭ�ϱ� 
		for(int i=0; i<numbers.length; i++) {
			numStr[i]=Integer.toString(numbers[i]);
			System.out.println(numStr[i]);
		}
		
		// ���ڿ� �迭 �� �� ������ ù��° �ڸ����� �������� �������� �����ϱ� 
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
		
		// �׳� ������ �ڷ��϶� �ٷ� ����غ���. 
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
