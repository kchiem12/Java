import java.util.*;

class QuickSort {
	int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  //pivot can be anything, but for example it is the last element
        int i = (low-1); // index of smallest element (actually is out of range)
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++;  //so that only numbers smaller than pivot is on left-most side
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j];   //places all arr[j] in correct position
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot)
        /*
			this is after all the numbers less than the pivot are to the left, and all the
			numbers greater than the pivot are to the right.

			this basically places the pivot in the middle of this, ultimately placing the 
			pivot in its correct position
        */
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
        /*
			returns higher index since n
        */
    } 
  
  
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 

    public static void main(String args[]) {
    	QuickSort ob = new QuickSort();
    	int[] stuff = {39, 1, 22, 9};
    	ob.sort(stuff, 0, 3);
    	for (int i = 0; i < stuff.length; i++) {
    		System.out.println(stuff[i]);
    	}
    }
  
}