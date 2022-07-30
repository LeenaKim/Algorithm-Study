package backjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP11054 {

	public static int[] arr;
	public static int[] dpAsc; // 각 부분수열의 오름차순 수열 길이 저장 
	public static int[] dpDsc; // 각 부분수열의 내림차순 수열 길이 저장 
	
	public static int asc(int idx) {
		if(dpAsc[idx] == 0) { // 아직 탐색하지 않은 인덱스라면 
			dpAsc[idx] = 1; // 길이는 무조건 1부터 시작이므로 1로 초기화 
			
			for(int i = idx-1; i >= 0; i--) { // 현재 위치의 dp[idx] 이전의 원소들을 탐색 
				if(arr[i] < arr[idx]) { // 현재 위치보다 작으면 작은 원소의 인덱스로 재귀 탐색 
					dpAsc[idx] = Math.max(dpAsc[idx], asc(i) + 1); // +1을 해주는 이유는 dp[idx]이 이전 부분수열에 idx번째 원소가 추가되었기 때문 
				}
			}
		}
		return dpAsc[idx];
	}
	public static int dsc(int idx) {
		if(dpDsc[idx] == 0) { 
			dpDsc[idx] = 1;  
			
			for(int i = idx+1; i < arr.length; i++) { // 현재 위치의 dp[idx] 이후의 원소들을 탐색 
				if(arr[i] < arr[idx]) { // 현재 위치보다 뒤의 원소가 작으면 작은 원소의 인덱스로 재귀 탐색 
					dpDsc[idx] = Math.max(dpDsc[idx], dsc(i) + 1); // +1을 해주는 이유는 dp[idx]이 이전 부분수열에 idx번째 원소가 추가되었기 때문 
				}
			}
		}
		return dpDsc[idx];
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		arr = new int[size];
		dpAsc = new int[size];
		dpDsc = new int[size];
		for(int j = 0; j < size; j++) {
			arr[j] = Integer.parseInt(st.nextToken());				
		}
		// 오름차순 부분수열 길이구하기 
		for(int j = 0; j < size; j++) {
			asc(j);				
		}
		// 내림차순 부분수열 구하기 
		for(int j = 0; j < size; j++) {
			dsc(j);				
		}
		// 두 길이의 합 - 1 
		int[] ttlArr = new int[size];
		for(int i = 0; i < size; i++) {
			ttlArr[i] = dpAsc[i] + dpDsc[i] - 1;
		}
		// 최댓값 찾기 
		int max = ttlArr[0];
		for(int i = 1; i < ttlArr.length; i++) {
			if(ttlArr[i] > max) {
				max = ttlArr[i];
			}
		}
		System.out.println(max);
		
		
	}

}
