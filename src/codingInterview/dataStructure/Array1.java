package codingInterview.dataStructure;
/*
 * 중복이 없는가 : 문자열이 주어졌을 , 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리
 */
public class Array1 {

	public static void main(String[] args) {
		boolean answer = isUnique("abbcdfs");
		System.out.println("answer : " + answer);
	}
	
	public static boolean isUnique(String str) {
		
		boolean[] char_set = new boolean[128];// 기본값은 false 
		
		for(int i = 0; i < char_set.length; i++) {
			System.out.println(char_set[i]);
		}
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);// 각 알파벳의 ascii 코드값 
			System.out.println("val : " + val);
			if(char_set[val]) {
				return false;
			}
			char_set[val] = true; // 첫번째 등장할때 true로 바꿔줌 
		}
		return true;
	}
	
}
