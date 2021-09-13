package jongman.bruteForce;

public class Boggle {

	static int[] dx = { -1, -1, -1, 1, 1, 1, 0, 0 };
	static int[] dy = {-1, 0, 1, -1, 0, 1, -1, 1 };
	static char[][] board = {
			{'U', 'R', 'L', 'P', 'M'},
			{'X', 'P', 'R', 'E', 'T'},
			{'G', 'I', 'A', 'E', 'T'},
			{'X', 'T', 'N', 'Z', 'Y'},
			{'X', 'O', 'Q', 'R', 'S'}
	};
	
	public static void main(String[] args) {
		String word = "PRETTY";
		int x = 1;
		int y = 1;
		boolean answer = hasWord(y, x, word);
		System.out.println("answer : " + answer);
	}
	
	public static boolean hasWord(int y, int x, String word) {
		System.out.println(x + ", " + y);
		// 기저사례1 : 시작 위치가 범위 밖이면 무조건 실패 
		if(!inRange(x, y)) {
			System.out.println("범위를 벗엉남 ");
			return false;
		}
		if(board[x][y] != word.charAt(0)) {
			System.out.println("board[x][y] : " + board[x][y]);
			System.out.println("word.charAt(0) : " + word.charAt(0));
			System.out.println("첫글자가 일치하지 않을때");
			return false;
			
		}
		if(word.length() == 1) {
			System.out.println("한글자일경우 ");
			return true;
		}
		
		// 여기까지 왔다는건 해당하는 글자를 찾았단는것 
		for(int direction = 0; direction < 8; ++direction) {
			// 해당 글자를 기준(0, 0)으로 반복문으로 다음글자 찾기 
			System.out.println("------------------------------");
			System.out.println("direction : " + direction);
			int nextY = y + dy[direction];
			int nextX = x + dx[direction];
			
			System.out.println(word.substring(1));
			
			// 첫번째 글자를 제외한 나머지와 함께 재귀호출 
			// 만약 다음글자에서 다다음글자를 못찾는다면 이전 반복문으로 돌아와 이어서 수행 
			if(hasWord(nextY, nextX, word.substring(1)))
				return true;
		}
		return false;
	}
	
	public static boolean inRange(int x, int y) {
		if(x >= 0 && x < 5 && y >= 0 && y < 5) {
			return true;
		}
		return false;
	}
}
