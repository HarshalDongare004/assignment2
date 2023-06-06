//import java.util.Arrays;

public class QuickSortAlgorithm {

	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i= (start-1);
		
		for (int j = start; j <= end-1; j++) {
			if(arr[j] <pivot) {
				i++;
//				swap
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,end);
	
		return (i+1); //pivot index
	}
	
	 static void swap(int[] arr, int i, int j)
	    {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	
	
	static void quickSort(int [] arr, int start, int end) {
		if(start < end) {
			int pivotIndex = partition(arr,start,end);
			quickSort(arr,start,pivotIndex-1);
			quickSort(arr,pivotIndex+1,end);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {6,3,9,5,2,8};
		int n = arr.length;
		quickSort(arr, 0,n-1 );
		
//		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

}
