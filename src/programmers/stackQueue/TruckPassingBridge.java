package programmers.stackQueue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TruckPassingBridge {

	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7, 4, 5, 6};
		
		int sec = solution(bridge_length, weight, truck_weights);
		System.out.println(sec + "초");
	}
	
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {

        // 총 걸린 초 
        int sec = 0;
        
        // 대기 트럭 리스트 큐 
        Queue<Integer> qu = new ConcurrentLinkedQueue<Integer>();
        
        
        int ttlWeight = 0;
        
        for(int t : truck_weights) {
        	while(true) {
        		// 다리인 qu가 비었을경우 트럭을 추가해주고 총 무게에 현재 트럭무게를 더한다.
        		if(qu.isEmpty()) {
        			qu.add(t);
        			ttlWeight += t;
        			sec++;
        			break;
        		// 다리가 모두 찼다면 먼저 갔던 트럭이 빠져나올때이므로 첫번째 트럭을 빼준다.
        		} else if(qu.size() == bridge_length) {
        			ttlWeight -= qu.poll();
        		// 그 외 : 다리에 트럭이 한대만 있다면 
        		} else {
        			// 기존 다리에 있던 트럭 무게에 새 트럭 무게를 더했을때 다리가 버틸수있는 무게보다 크면 앞의 트럭이 지나가도록 0을 추가 
        			if(ttlWeight + t > weight) {
        				sec++;
        				qu.add(0);
        			// 다리가 버틸수있다면 새 트럭을 qu에 올리고 총 무게에 더해준다. 
        			} else {
        				qu.add(t);
        				ttlWeight += t;
        				sec++;
        				break;
        			}
        		}
        	}
        }
        // 마지막 트럭이 진입하고 이 다리를 모두 지나야하기때문에 다리 길이만큼 더해 리턴 
        return sec + bridge_length;
    }
	
}
