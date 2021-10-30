import java.util.Arrays;
import java.util.Scanner;

public class Heating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int tc = 0; tc < n; tc++) {
            int c = sc.nextInt();
            int sum = sc.nextInt();

            solve(c, sum);
        }

        sc.close();
    }

    static void solve(int c, int sum) {
        int[] sectionNums = new int[c];
        for (int i = 0; i < sectionNums.length; i++) {
            sectionNums[i] = sum / c;

            if (i < sum % c) {
                sectionNums[i]++;
            }
        }

        System.out.println(Arrays.stream(sectionNums).map(x -> x * x).sum());
    }
}