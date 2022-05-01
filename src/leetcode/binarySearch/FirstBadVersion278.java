package leetcode.binarySearch;
/*
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */
public class FirstBadVersion278 {

	public int firstBadVersion(int n) {
        int[] num = new int[n];
        for(int i = 0; i < n; i++){	// 길이가 n인 1...n 의 원소를 갖는 배열 형성 
            num[i] = i+1;
        }
        int low = 0;
        int high = num.length - 1;
        int mid = 0;
        
        while(low <= high){
            mid = (low + high)/2;
            if(isBadVersion(num[mid])){ // num[mid]가 badversion이면 그 이전에 firstbadversion 이 있었다는 것 => 왼쪽 절반 탐색  
                high = mid - 1;
            } else if(!isBadVersion(num[mid])){ // num[mid]가 badversion이 아니면 그 후에 firstbadversion 이 있다는 것 => 오른쪽 절반 탐색 
                low = mid + 1;
            }
        }
        return num[low]; // low > high 가 되는순간까지 탐색하면 num[low]가 곧 first bad version 
    }
}
