import java.util.Scanner;
public class q3binsearch {
    public static void main(String[] args) {
        try (Scanner cin = new Scanner(System.in)) {
            int n = cin.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = cin.nextInt();
            }
            int key = cin.nextInt();

            int lo = 0, hi = n - 1;
            int ops = 0;
            int result = -1;

            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                ops++;
                if (arr[mid] == key) {
                    result = mid;
                    break;
                } else if (arr[mid] < key) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            System.out.println(result);
            System.out.println(ops);
        }
    }
}
