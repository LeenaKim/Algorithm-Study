package programmers.stackQueue;

public class BigNumber {

	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
		String answer = solution(number, k);
		System.out.println("answer : " + answer);
	}
	
	public static String solution(String number, int k) {
        /*
		String answer = "";
        
        String[] numArr = number.split("");
        
        // 총 만들어야하는 숫자 길이 
        int len = number.length() - k;
        int max = Integer.parseInt(numArr[0]);
        int maxIdx = 0;
        
    		
		for(int i = maxIdx; i < len; i++) {
    		if(Integer.parseInt(numArr[i]) > max) {
    			max = Integer.parseInt(numArr[i]);
    			maxIdx = i;
    		}
		}
		answer += max;
		max = Integer.parseInt(numArr[maxIdx]);
		
		
		//for(int i = maxIdx + 1; i < numArr.length; i++) {
		for(int i = maxIdx + 1; i < numArr.length; i++) {
			//max = Integer.parseInt(numArr[i - 1]);
			
			if(len - answer.length() == numArr.length - i) {
				System.out.println("first if");
				for(int j = i; j < numArr.length; j++) {
					answer += numArr[j];
				}
				System.out.println(answer);
				break;
			}
			
			if(Integer.parseInt(numArr[i]) >= max && i <= maxIdx + len - answer.length()) {
				System.out.println("second if");
				max = Integer.parseInt(numArr[i]);
				answer += max;
				maxIdx = i;
				System.out.println(answer);
			}
			
		}
        return answer;
        */
		
		StringBuilder sb = new StringBuilder();
	    
	    //@1.
	    int len = number.length();
	    int remainNumber = len - k; // 숫자를 뽑고 남은, 총 만들어야하는 숫자 개수 
	    int maxIdx = 0; // 최대값의 인덱스 
	    
	    while(remainNumber > 0) { //@2. 문자열의 수를 자르고 남은 수 만큼 반복문 수행 
	    	char maxChar = '0';
	    	for(int i=maxIdx; i<=len-remainNumber && maxChar != '9'; i++) { 
	    		//@3. 원래 수의 길이 - 아직 더 필요한 숫자의 길이 범위 안에서 하나가 반드시 나와야함 
	    		if(number.charAt(i) > maxChar) { //@4.
	    			maxChar = number.charAt(i);
	    			maxIdx = i;
	    		}
	    	}
	    	//@5.
	    	sb.append(maxChar);
	    	maxIdx++;
	    	remainNumber--;
	    }
	    
	    return sb.toString();
    }
}
