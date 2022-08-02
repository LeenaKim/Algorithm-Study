package backjoon.dp;

public class Line2022_3 {

	public static int[] isMoved;
	public static int minBook;
	
	public static void dfs(int n, int[] bankbook) {
		for(int i = 0; i < bankbook.length; i++) {
			if(isMoved[i] != -1) {
				isMoved[i] = -1;
				int cnt = bankbook[i];
				for(int j = i+1; j < bankbook.length; j++) {
					if(cnt + bankbook[j] > n) {
						break;
					} else {
						
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[] bankbook = {8, 4, 2, 5, 3, 7};
		
		isMoved = new int[n];
		
		minBook = n;
		
		
	}

}
