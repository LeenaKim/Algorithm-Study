package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 */
/*
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.
 */
/*
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */
public class Order10989 {

	//삽입정렬로 풀어보자.
	/*
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		int temp, j;
		for(int i = 1; i < nums.length; i++) {
			temp = nums[i];
			for(j = i-1; j >= 0 && nums[j] > temp; j--) {
				nums[j+1] = nums[j];
			}
			nums[j+1] = temp;
		}
		for(int i : nums) {
			System.out.println(i);
		}
		
	}
	*/
	// 힙정렬 1
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		int[] nums = new int[n];
//		
//		for(int i = 0; i < nums.length; i++) {
//			nums[i] = Integer.parseInt(br.readLine());
//		}
//		
//		/*
//	     * < maxHeap 만들기 >
//	     * - 부모노드의 값이 자식노드의 값들보다 큰 형태
//	     * - i의 초기값은 배열의 제일 끝 자식노드의 부모노드부터 시작한다.
//	     */
//		
//	    for(int i = nums.length/2 - 1; i >= 0; i--){
//	      heapify(nums, nums.length, i);
//	    }
//	    
//	    // 정렬하기
//	    for(int i = nums.length - 1; i >= 0; i--){
//	      swap(nums, i, 0); // 최상단 노드와 최하단 노드의 값을 교환한다.
//	      heapify(nums, i-1, 0); // 루트노드를 기준으로 최대힙을 만든다.
//	    }
//	    
//	    for(int i : nums) {
//	    	System.out.println(i);
//	    }
//	  }
//	  
//	  public static void heapify(int[] arr, int size, int pNode){
//	    
//	    int parent = pNode; // 부모노드
//	    int lNode = pNode * 2 + 1; // 왼쪽 자식노드
//	    int rNode = pNode * 2 + 2; // 오른쪽 자식노드
//	    
//	    
//	    // size > lNode => 인덱스 범위를 넘어서는지 확인하기 위함
//	    if(size > lNode && arr[parent] < arr[lNode]){
//	      parent = lNode;
//	    }
//	    
//	    if(size > rNode && arr[parent] < arr[rNode]){
//	      parent = rNode;
//	    }
//	    
//	    // parent에 저장된 값은 자식노드 중 큰 값이 있다면 큰 값의 인덱스 값이 남아있을 것이다.
//	    // 초기에 설정한 부모노드의 인덱스와 다르다면 교환을 해준다.
//	    if(parent != pNode){
//	      swap(arr, pNode, parent);
//	      
//	      /*
//	       * 노드와 자리를 바꾸면 최대힙 기준에 맞지 않을 수 있기 때문에
//	       * 바뀐 자식노드 아래 최대힙으로 맞춰주기 위함
//	       */
//	      heapify(arr, size, parent);
//	    }
//	  }
//	  
//	  
//	  public static void swap(int[] arr, int i, int j){
//	    int tmp = arr[j];
//	    arr[j] = arr[i];
//	    arr[i] = tmp;
//	  }
	  
	/* 힙정렬 2
	public static void heap(int[] data, int number) { 
		for(int i=1; i<number; i++) { 
			int child = i; 
			while(child > 0) { 
				int parent = (child-1)/2; 
				if(data[child] > data[parent]) { 
					int temp = data[parent]; 
					data[parent] = data[child]; 
					data[child] = temp; 
				} 
				child = parent;
			} 
		} 
	}

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(br.readLine());
		int[] data = new int[number];
		
		for(int i = 0; i < data.length; i++) {
			data[i] = Integer.parseInt(br.readLine());
		}
		
		heap(data, number); 
		
		for(int i = number-1; i>0; i--) { 
			int temp = data[0]; 
			data[0] = data[i]; 
			data[i] = temp; 
			heap(data, i); 
		} 
		
		for(int i=0; i< number; i++) { 
			System.out.println(data[i]); 
		}
	
	
	}
	*/
	
	// 카운팅 정렬 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(br.readLine());
		int[] data = new int[number];
		int[] counting = new int[10001];
		
		for(int i = 0; i < data.length; i++) {
			data[i] = Integer.parseInt(br.readLine());
			counting[data[i]]++;
		}
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++) {
			while(counting[i] > 0) {
				sb.append(i).append('\n');
				counting[i]--;
			}
		}
		
		System.out.println(sb);
	}
}
