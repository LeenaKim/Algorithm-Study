package programmers.stackQueue;

public class GymUniform {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		
		int answer = solution(n, lost, reserve);
		System.out.println(answer);
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n;
 
        for(int i = 0; i < lost.length; i++) {
        	System.out.println("i : " + i);
            boolean rent = false;
            int j = 0;
            while(!rent) {
                if(j == reserve.length)                   
                	break;
                if(lost[i] == reserve[j]) {
                	System.out.println("lost[i] == reserve[j]");
                	reserve[j] = -1; 
                	rent = true;
                } else if(lost[i] - reserve[j] == 1 ) {
                	System.out.println("lost[i] - reserve[j] == 1 ");
                	reserve[j] = -1; 
                	rent = true;
                } else if(lost[i] - reserve[j] == -1) {
                	System.out.println("lost[i] - reserve[j] == -1");
                	reserve[j] = -1; 
                	rent = true;
                } else {
                	System.out.println("else");
                	j++;                     
                }
            }
            if(!rent) 
            	answer--;
            System.out.println("j : " + j);
        }
        return answer;
    }
}

