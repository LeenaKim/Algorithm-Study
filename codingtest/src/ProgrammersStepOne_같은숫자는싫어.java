/*
�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. 
�̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. 
��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. 
���� ���,
arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.
���ѻ���
�迭 arr�� ũ�� : 1,000,000 ������ �ڿ���
�迭 arr�� ������ ũ�� : 0���� ũ�ų� ���� 9���� �۰ų� ���� ����
����� ��
arr	answer
[1,1,3,3,0,1,1]	[1,3,0,1]
[4,4,4,3,3]	[4,3]
����� �� ����
����� �� #1,2
������ ���ÿ� �����ϴ�.
 */

package codingtest;
import java.util.ArrayList;
public class ProgrammersStepOne_�������ڴ½Ⱦ� {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,1,3,3,0,1,1};
		int[] arr2= {4,4,4,3,3};
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(0, arr1[0]);
		for(int i=1; i<arr1.length; i++) {
			if(arr1[i]!=arr1[i-1]) {
				answer.add(arr1[i]);
			}
		}
		int[] arrrr= new int[answer.size()];
		int j=0;
		for(int a:answer) {
			arrrr[j++]=a;
		}
		//int[] arrrr=answer.toArray(new int[answer.size()]);
		
		/*int cnt=0;
		for(int i=1; i<arr1.length; i++) {
			if(arr1[i]!=arr1[i-1]) {
				cnt+=1;
			}
		}
		int[] answer = new int[cnt+1];
		answer[0]=arr1[0];
		int cntt=0;
		for(int i=1; i<arr1.length; i++) {
			if(arr1[i]!=arr1[i-1]) {
				cntt+=1;
				answer[cntt]=arr1[i];
			}
		}*/
		
		/*for(int i=0; i<answer.size(); i++) {
			System.out.printf("%d\t", answer.get(i));
		}*/
		for(int i=0; i<arrrr.length; i++) {
			System.out.printf("%d", arrrr[i]);
		}
		
		
	}

}
