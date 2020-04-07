package codingtest;

public class ProgrammersStepOne_비밀지도 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] arr1_1=new String[arr1.length];
		String[] arr2_1=new String[arr2.length];
		// 2진수 변환과 0붙이기 
		
		for(int i=0; i<n; i++) {
			arr1_1[i]=String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr1[i])));
			arr2_1[i]=String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr2[i])));
		}
		// 배열화하기  
		char[][] arr1_2=new char[n][n];
		char[][] arr2_2=new char[n][n];
		for(int j=0; j<n; j++) {
			for(int i=0; i<n; i++) {
				arr1_2[j][i]=arr1_1[j].charAt(i);
				arr2_2[j][i]=arr2_1[j].charAt(i);
			}
		}
		// 두 배열을 비교하며 둘 중 하나라도 '1'일 경우 '#'로 하는 새로운 배열 생성
		char[][] arr3=new char[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr1_2[i][j]=='1'||arr2_2[i][j]=='1') {
					arr3[i][j]='#';
				}
				else arr3[i][j]=' ';
			}
		}
		// char 2차원 배열을 1차원 String 배열로 변환 
		String[] answer=new String[n];
		for(int i=0; i<n; i++) {
			answer[i]=String.valueOf(arr3[i]);
		}
		
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgrammersStepOne_비밀지도 one = new ProgrammersStepOne_비밀지도();
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
