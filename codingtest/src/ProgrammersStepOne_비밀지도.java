package codingtest;

public class ProgrammersStepOne_������� {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] arr1_1=new String[arr1.length];
		String[] arr2_1=new String[arr2.length];
		// 2���� ��ȯ�� 0���̱� 
		
		for(int i=0; i<n; i++) {
			arr1_1[i]=String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr1[i])));
			arr2_1[i]=String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr2[i])));
		}
		// �迭ȭ�ϱ�  
		char[][] arr1_2=new char[n][n];
		char[][] arr2_2=new char[n][n];
		for(int j=0; j<n; j++) {
			for(int i=0; i<n; i++) {
				arr1_2[j][i]=arr1_1[j].charAt(i);
				arr2_2[j][i]=arr2_1[j].charAt(i);
			}
		}
		// �� �迭�� ���ϸ� �� �� �ϳ��� '1'�� ��� '#'�� �ϴ� ���ο� �迭 ����
		char[][] arr3=new char[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr1_2[i][j]=='1'||arr2_2[i][j]=='1') {
					arr3[i][j]='#';
				}
				else arr3[i][j]=' ';
			}
		}
		// char 2���� �迭�� 1���� String �迭�� ��ȯ 
		String[] answer=new String[n];
		for(int i=0; i<n; i++) {
			answer[i]=String.valueOf(arr3[i]);
		}
		
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgrammersStepOne_������� one = new ProgrammersStepOne_�������();
		int n=5;
		int[] arr1= {9, 20, 28, 18, 11};
		int[] arr2= {30, 1, 21, 17, 28};
		String[] two=one.solution(n, arr1, arr2);
		
		
		/*for(String i:arr1_1) {System.out.printf("%s\t", i);}
		System.out.println();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%c", arr1_2[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%c", arr2_2[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%c", arr3[i][j]);
			}
			System.out.println();
		}
		System.out.println();*/
		for(int i=0; i<n; i++) {
			System.out.printf("%s", two[i]);
		}
	}

}
