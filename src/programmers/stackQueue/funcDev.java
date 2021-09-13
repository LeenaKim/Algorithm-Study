package programmers.stackQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class funcDev {

	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		int[] answer = solution(progresses, speeds);
		
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
		
		// 기능개발 일수 저장할 queue 생성 
		Queue<Integer> qu = new ConcurrentLinkedQueue<>();
		
		// 남은 기능개발 %를 개발 속도 일로 나눴을때 0으로 떨어지면 몫 저장, 안떨어지면 몫 + 1 저
		for(int i = 0; i < progresses.length; i++) {
			if((100 - progresses[i]) % speeds[i] == 0){
				qu.add((100 - progresses[i]) / speeds[i]);
			} else {
				qu.add((100 - progresses[i]) / speeds[i] + 1);
			}
		}
		
		System.out.println(qu);
		
		// 각 배포마다 몇개의 기능이 배포되는지를 담는 리스트 result 생성 
		List<Integer> result = new ArrayList<Integer>();
		// 처음 돌때를 위해 queue의 가장 첫번째 배포 기능 수를 뽑아냄 
		int standard = qu.poll();
		System.out.println("standard : " + standard);
		// 기본으로 배포되는 기능은 1개 
		int cnt = 1;
		
		while(!qu.isEmpty()) {
			System.out.println("start while");
			// standard와 비교할, 다음으로 입력된 queue의 원소를 num에 저장 
			int num = qu.poll();
			System.out.println("num : " + num);
			
			// 기준 기능(standard)보다 지금 비교하는 기능(num)이 더 적게걸린다면 배포 기능 수 + 1
			if(standard >= num) {
				System.out.println("standard >= num");
				cnt++;
			// 기준 기능(standard)보다 지금 비교하는 기능(num)이 더 걸린다면 배포 기능 수는 1로 그대로
			// 기준(standard)는 지금 비교하는기능(num)이 됨 
			}else {
				System.out.println("standard < num");
				result.add(cnt);// 이전 while문 돌때 + 된 cnt 저장 
				cnt = 1;
				standard = num;
			}
			System.out.println("result : " + result);
			System.out.println("standard : " + standard);
			System.out.println("------------------------");
			
		}
		result.add(cnt);
		
		// 리스트를 배열로 바꿔주는 작업
		int[] answer = new int[result.size()];
		for(int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}
		
		return answer;
	}
	
}
