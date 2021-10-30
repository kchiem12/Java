import java.util.*;

class Solution {
    public int squareDigits(int n) {
    	String num = String.valueOf(n);
    	int[] arr = new int[num.length()];
    	String ans = "";

    	for (int i = 0; i < arr.length; i++) {
    		double temp = Integer.parseInt(num.substring(i, i + 1));
    		arr[i] = (int)Math.pow(temp, 2.0);
    		ans += "" + arr[i];
    	}

    	return Integer.parseInt(ans);
  }
}