package backjoon.dp;

public class Line2022_01 {

	public static int cnt = 0;
	public static String s;
	
	public static void dp(int idx) {
//		if(dp[idx] == null) {
//			dp[idx] = 0;
//		
		
		for(int i = idx-1; i>=0; i--) {
			if(s.charAt(idx) == 'a') {
				if(s.charAt(i) == 'a') {
					break;
				} else if(s.charAt(i) == 'z') {
					++cnt;
					break;
				}
			}
			else if(s.charAt(idx) == 'z') {
				if(s.charAt(i) == 'z') {
					break;
				} else if(s.charAt(i) == 'a') {
					++cnt;
					break;
				}
			}
		}
				
//			}
//				
//		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		s = "zabzczxa";
//		s = "abcz";
		s = "abcd";
		
		for(int i = s.length() - 1; i >= 0; i--) {
			dp(i);
		}
		
		System.out.println(cnt);
	}

}
