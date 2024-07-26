package insertionSort;

public class insertionSort {
	
	public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

	public static void main(String[] args) {
		int[] arr = {10, 17, 14, 22, 18, 30};
	        
		System.out.print("Original Array\t: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		insertionSort newobj = new insertionSort();
		newobj.insertionSort(arr);
		
		System.out.println();System.out.println();
				
		System.out.print("Sorted Array\t: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}	
		}

}
