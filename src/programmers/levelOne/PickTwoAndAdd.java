package programmers.levelOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class PickTwoAndAdd {

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		int[] answer = solution(numbers);
		for(int num : answer) {
			System.out.print(num + " ");
		}
	}
	
	public static int[] solution(int[] numbers) {
		// 중복을 걸러내기위해 set 사용 
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = i + 1; j < numbers.length; j++) {
        		// 두 수의 합을 set에 저장 
        		hs.add(numbers[i] + numbers[j]);
        	}
        }
        // 리스트로 변환 
        List<Integer> arr = new ArrayList<>(hs);
        // 오름차순 정렬 
        Collections.sort(arr);
        
        // 배열로 변환 
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
        	answer[i] = arr.get(i);
        }
        return answer;
    }
}
