package bubblesort;

public class bubbleSort {

	public void bubble_sort(int[] arr) {
		int length = arr.length;
		int temporary; 
		
		for(int i=0; i<length-1; i++) {
			
			for(int j=0; j<length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					
					temporary = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temporary ;
					
				}
			}			
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {72, 51, 11, 30, 28, 64, 46};
		
		System.out.print("Original Array\t: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		bubbleSort newobj = new bubbleSort();
		newobj.bubble_sort(arr);
		
		System.out.println();System.out.println();
				
		System.out.print("Sorted Array\t: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}	
	}

}
