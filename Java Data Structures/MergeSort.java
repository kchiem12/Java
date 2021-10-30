import java.util.*;

public class MergeSort {

	public static void merge(int[] arr, int l, int m, int r) // l = left, m = middle, r = right
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        // Create temporary arrays
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        //copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];      //l+1 because l can actually be any number, not just 0
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];  //m is largest index for left array. thus mid + 1
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;  //where the array leaves off from
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    public static void mergeSort(int[] arr, int l, int r)
    {
        if (l < r) {
            // Find the mid point
            // better way to find average (avoids overflow for larger arrays)
            int m =l+ (r-l)/2;
 
            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }


	public static void main(String args[]) {
		int[] bruh = {100, 7, 1111, 9, 6, 4};
		mergeSort(bruh, 0, 5);
		for (int i = 0; i < bruh.length; i++) {
			System.out.println(bruh[i]);
		}
	}
}