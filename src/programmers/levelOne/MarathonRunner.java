package programmers.levelOne;

import java.util.HashMap;
import java.util.Map;

public class MarathonRunner {

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		String answer = solution(participant, completion);
		System.out.println(answer);
	}
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Boolean> map = new HashMap<>();
        
        // 완주한 목록에 있을경우 map의 value 값을 true로 바꿔줌 
        for(int i = 0; i < participant.length; i++) {
        	map.put(participant[i], false);
        	for(int j = 0; j < completion.length; j++) {
        		if(participant[i] == completion[j]) {
        			map.put(participant[i], true);
        			break;
        		}
        	}
        }
        
        // map의 value값이 false인 사람만 answer에 추가 
        for(String key : map.keySet()) {
        	if(!map.get(key)) {
        		System.out.println(key);
        		answer += key;
        	}
        }
        return  answer;
    }
	
}
