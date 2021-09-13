
public class KakaoTest {

	
		public String solution(int[] numbers, String hand) {
			
			int[][] numArr = {
					{1, 2, 3},
					{4, 5, 6},
					{7, 8, 9},
					{-1, 0, -1}
			};
			
			int lx = 0;
			int ly = 3;
			int rx = 3;
			int ry = 2;
			String answer ="";
			
			for(int l = 0; l < numbers.length; l++) {
				for(int i = 0; i < numArr.length; i++) {
					for(int j = 0; j < numArr[i].length; j++) {
						if(numbers[l] == numArr[i][j]) {
							switch(numbers[l]) {
								case 1 : case 4 : case 7 :
									answer += "L";
									lx = i;
									ly = j;
									break;
								case 3 : case 6 : case 9 :
									answer += "R";
									rx = i;
									ry = j;
									break;
								case 2 : case 5 : case 8 : case 0 :
									int lDis = Math.abs(i - lx) + Math.abs(j - ly);
									int rDis = Math.abs(i - rx) + Math.abs(j - ry);
									if(lDis > rDis) {
										answer += "R";
										rx = i; 
										ry = j;
									} else if(lDis < rDis) {
										answer += "L";
										lx = i;
										ly = j;
									} else { 
										if(hand.equals("right")) {
											answer += "R";
											rx = i;
											ry = j;
										} else {
											answer += "L";
											lx = i;
											ly = j;
										}
									}
									break;
							}
						}
					}
				}
				
			}
			
			
			return answer;
		}
	
	
	public static void main (String[] args) {
		
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		KakaoTest sol = new KakaoTest();
		System.out.println(sol.solution(numbers, hand));
		
	}
}
