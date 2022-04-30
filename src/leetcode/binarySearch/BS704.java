package leetcode.binarySearch;
/*
 * Given an array of integers nums which is sorted in ascending order, 
 * and an integer target, write a function to search target in nums. 
 * If target exists, then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class BS704 {

    public int search(int[] nums, int target) {
        int low = 0; 					// 탐색할 범위의 첫번째 인덱스 
        int high = nums.length - 1;		// 탐색할 범위의 마지막 인덱스 
        int mid = 0;
        
        
        while(low <= high) {			// low > high 가 될때까지 반복 
        	mid = (low + high)/2;		// 탐색할 범위의 중간 인덱스 
        	if(nums[mid] == target) {	// 중간값과 같아진다면 중간 인덱스 리턴 
        		return mid;
        	} else if(nums[mid] < target) {	// 중간값보다 타겟이 크다면 중간값의 오른쪽 범위만 잘라 재탐색 
        		low = mid + 1;
        	} else { // 중간값보다 타겟이 작다면 중간값의 왼쪽 범위만 잘라 재탐색 
        		high = mid - 1;
        	} 
        }
        
        return -1; // low > high 가 되면 반복문 안에서 탐색을 못했으므로 -1 리턴 
    }
}
