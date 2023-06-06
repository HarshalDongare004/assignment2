class ArrayDuplicates {
	static void duplicate(int [] arr) {
		bubbleSort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				System.out.println(arr[i]);
			}
		}
	}
	
	static void bubbleSort(int[] arr) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
					flag = true;
				}
			}
			if ( flag == true) {
				break;
			}
		}
	}
	
	static void swap(int [] arr, int a ,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,5,3,5,3,45,34,9,3,5,5,6,3,4,-32,-11,-4};
		duplicate(arr);
//		int [] arr1 = {1,4,5,7,9,7,9,7,6,9,6,8,9,5,8,6,8,5,4};
//		duplicate(arr);
	}

	
	

}
