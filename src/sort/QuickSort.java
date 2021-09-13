package sort;

public class QuickSort {

	public static void main(String[] args) {
	    int[] array = { 80, 70, 60, 50, 40, 30, 20 };
	    System.out.print("original array :");
	    for(int a : array) {
	    	System.out.print(a + " ");
	    }
	    System.out.println();
	    
		quicksort(array, 0, array.length - 1);
		
		for (int v : array) {
			System.out.println(v);
		}
		
	}
	 
	public static int partition(int[] array, int left, int right) {
	    int mid = (left + right) / 2;
	    swap(array, left, mid);
	   
	    System.out.println("after first swap");
	    for(int a : array) {
	    	System.out.print(a + " ");
	    }
	    System.out.println();
	    
	    int pivot = array[left];
	    System.out.println("pivot : " + pivot);
	    int i = left, j = right;
	    System.out.println("i : " + i + ", j : " + j);
	    while (i < j) {
	        while (pivot < array[j]) {
	            j--;
	        }
	 
	        while (i < j && pivot >= array[i]) {
	            i++;
	        }
	        System.out.println("i : " + i + ", j : " + j);
	        swap(array, i, j);
	        for (int v : array) {
				System.out.print(v + " ");
			}
	    }
	    array[left] = array[i];
	    array[i] = pivot;
	    
	    System.out.println("after second swap");
	    for(int a : array) {
	    	System.out.print(a + " ");
	    }
	    return i;
	}
	 
	public static void swap(int[] array, int a, int b) {
	    int temp = array[b];
	    array[b] = array[a];
	    array[a] = temp;
	}
	 
	public static void quicksort(int[] array, int left, int right) {
	    if (left >= right) {
	        return;
	    }
	 
	    System.out.println();
	    int pi = partition(array, left, right);
	    System.out.println("pi : " + pi);
	    
	    quicksort(array, left, pi - 1);
	    quicksort(array, pi + 1, right);
	}
}
