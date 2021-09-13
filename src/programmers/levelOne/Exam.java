package programmers.levelOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Exam {

	public static void main(String[] args) {
		int[] answers = {1,3,2,4,2};
		int[] answer = solution(answers);
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
	
	public static int[] solution(int[] answers) {
        
        List<Integer> answerList = new ArrayList<>();
        
        /*
        int[] first = new int[answer.length];
        int[] second = new int[answer.length];
        int[] third = new int[answer.length];
        */
        
        Queue<Integer> firQu = new LinkedList<>();
        Queue<Integer> secQu = new LinkedList<>();
        Queue<Integer> thrQu = new LinkedList<>();
        
        int[] secQuVal = {1, 3, 4, 5};
        int[] thrQuVal = {3, 1, 2, 4, 5};
        int secQuValIdx = 0, thrQuValIdx = 0;

        
        for(int i = 0; i < answers.length; i++) {
        	if((i + 1) % 5 == 0) {
        		firQu.add(5);
        	}else {
        		firQu.add((i + 1) % 5);        		
        	}
        	
        	if(i % 2 == 0) {
        		secQu.add(2);
        	}else {
        		secQu.add(secQuVal[secQuValIdx]);
        		secQuValIdx++;
        		if(secQuValIdx > 3) secQuValIdx = 0;
        	}
        	
        	thrQu.add(thrQuVal[(i % 10) / 2]);
        	
        }
       
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;
        
        for(int i = 0; i < answers.length; i++) {
        	if(answers[i] == firQu.poll()) {
        		cnt1++;
        	}
        	if(answers[i] == secQu.poll()) {
        		cnt2++;
        	}
        	if(answers[i] == thrQu.poll()) {
        		cnt3++;
        	}
        	
        }
        
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(cnt1, 1);
        map.put(cnt2, 2);
        map.put(cnt3, 3);
        
        list.add(cnt1);
        list.add(cnt2);
        list.add(cnt3);
        
        Collections.sort(list);
        Collections.reverse(list);
        
        System.out.println("list :");
        for(int i : list) {
        	System.out.println(i);
        }
        
        int max = list.get(0);
        for(int i = 0; i < list.size(); i++) {
        	if(list.get(i) >= max) {
        		answerList.add(map.get(list.get(i)));
        	}
        }
        /*
        for(int i = 0; i < list.size(); i++) {
        	System.out.println(map.get(list.get(i)));
        	answerList.add(map.get(list.get(i)));
        }
        */
        System.out.println("answerList : ");
        for(int i : answerList) {
        	System.out.println(i);
        }
        int[] answer = new int[answerList.size()];
       
        for(int i = 0; i < answerList.size(); i++) {
        	answer[i] = answerList.get(i);
        }
        
        return answer;
    }
	/*
	public static int[] recursion(int[] answers, Queue<Integer> firQu, Queue<Integer> secQu, Queue<Integer> thrQu) {
		int cnt1 = 0, cnt2 = 0, cnt3 = 0;
		int idx = 0;
		
		if(idx == answers.length) return {};
		if(answers[idx] == firQu.poll()) cnt1++;
		
		
	}
	*/
	
}
