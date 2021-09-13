package sort;

public class MergeSort {

	// 매번 생성하면 메모리를 불필요하게 차지하니 한번 생성해서 계속 사용한다.
	  static int[] tmp;
	  
	  public static void main(String[] args){
	    
	    // 정렬되지 않은 배열 
	    int[] arr = {5, 8, 4, 7, 10, 9, 2, 1, 6, 3};
	    
	    // 임시 저장할 배열 생성
	    tmp = new int[arr.length];
	    
	    // 병합정렬
	    mergeSort(arr, 0, arr.length-1);
	    
	    // 출력
	    for(int i = 0; i < arr.length; i++){
	      System.out.print(arr[i] + " ");
	    }
	  }
	  
	  
	  public static void mergeSort(int[] arr, int left, int right){
	    
	    // 분할된 배열의 length가 1일 때
	    if(left >= right){
	      return;
	    }
	    
	    int mid = (left + right) / 2;
	    System.out.println("mid : " + mid);
	    System.out.println("left : " + left);
	    System.out.println("right : " + right);
	    
	    // 반씩 분할
	    mergeSort(arr, left, mid);
	    mergeSort(arr, mid+1, right);
	    
	    // 병합 + 정렬. 아래 부분은 따로 함수를 빼도 된다.
	    int block1_s = left; // 블럭1의 시작점
	    int block2_s = mid + 1; // 블럭2의 시작점
	    int k = left;
	    System.out.println("block1_s : " + block1_s);
	    System.out.println("block2_s : " + block2_s);
	    System.out.println("k : " + k);
	    
	    // 분할된 두개의 각 원소들을 비교하여 더 작은 것을 먼저 채운다
	    while(block1_s <= mid && block2_s <= right){
	      System.out.println("분할된 두개의 각 원소들을 비교하여 더 작은 것을 먼저 채운다");
	      if(arr[block1_s] > arr[block2_s]){
	    	System.out.println(arr[block1_s] + ">" + arr[block2_s]);
	        tmp[k++] = arr[block2_s++];
	      } else {
	    	System.out.println(arr[block1_s] + "<=" + arr[block2_s]);
	        tmp[k++] = arr[block1_s++];
	      }
	      
	      for(int i = 0; i < tmp.length; i++) {
	    	  System.out.print(tmp[i] + " ");
	      }
	      System.out.println();
	    }
	    
	    // 분할된 block1, block2 중 block2는 전부 정렬되고 block1만 남았을 경우, 차례대로 정렬
	    while(block1_s <= mid){
	      System.out.println("분할된 block1, block2 중 block2는 전부 정렬되고 block1만 남았을 경우");
	      tmp[k++] = arr[block1_s++];
	    }
	    
	    // 분할된 block1, block2 중 block1은 전부 정렬되고 block2만 남았을 경우, 차례대로 정렬
	    while(block2_s <= right){
	      System.out.println("분할된 block1, block2 중 block1은 전부 정렬되고 block2만 남았을 경우");
	      tmp[k++] = arr[block2_s++];
	    }
	    
	    for(int i = 0; i < tmp.length; i++) {
	    	  System.out.print(tmp[i] + " ");
	      }
	    System.out.println();
	    
	    // 정렬된 배열을 원래 배열에 대입
	    for(int i = left; i <= right; i++){
	      arr[i] = tmp[i];
	    }
	  }
}
