import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Taxis {

	

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int groups;
		try {
			groups = Integer.parseInt(br.readLine());
			int[] people = new int[groups];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < groups; i++) {
				people[i] = Integer.parseInt(st.nextToken());
			}
			Solver sol = new Solver();
			sol.solve(groups, people);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Solver {

	public void solve(int groups, int[] temp) {	
		int count = 0;
		mergeSort(temp, temp.length);
		int k = temp.length;

		for (int i = 0; i < k; i++) {
			if (temp[i] == 4) {
				count++;
			}
			else if (temp[i] == 3) {
				if (temp[k - 1] == 1) {
					count++;
					k--;
				}
				else {
				count++;
			}
			}
			else if (temp[i] == 2) {
				if (i + 1 < temp.length && temp[i + 1] == 2) {
					count ++;
					i++;
				}
				else {
					if (i + 1 < temp.length) {
						if (i + 2 < temp.length) {
							count ++;
							i += 2;
						}
						else {
							count ++;
							i++;
						}
					}
					else {
						count++;
					}
				}
			}
			else {
				if (i + 3 < temp.length) {
					count ++;
					i += 3;
				}
				else if (i + 2 < temp.length) {
					count ++;
					i += 2;
				}
				else if (i + 1 < temp.length) {
					count ++;
					i++;
				}
				else {
					count++;
				}
			}
		}
		System.out.println(count);
	}


	public void mergeSort(int[] current, int length) {
        
        if (length < 2) {
            return;
        }
        
        int mid = length / 2; 

        int[] left = new int[mid]; 
        int[] right = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = current[i];
        }

        for (int i = mid; i < length; i++) {
            right[i - mid] = current[i];
        }
        

        mergeSort(left, mid);
        mergeSort(right, length - mid);


        merge(current, left, right);
    }

    public void merge(
        int[] current, int[] left, int[] right) {

        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] > right[j]) {
                current[k] = left[i];
                k++;
                i++;
            }
            else {
                current[k++] = right[j++];
            }
        }
        
        while (i < leftSize) {
            current[k++] = left[i++];
        }
        while (j < rightSize) {
            current[k++] = right[j++];
        }

    }

}