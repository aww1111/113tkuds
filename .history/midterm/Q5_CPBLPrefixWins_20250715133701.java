package midterm;

import java.util.Scanner;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = cin.nextInt();
        }

        int k = cin.nextInt();

        int[] ps = new int[n+1];
        ps[0] = 0;
        for(int i=1;i<=n;i++){
            ps[i] = ps[i-1]+a[i-1];
        }
        System.out.print("PrefixSum: ");
        for (int i = 1; i <= k; i++) {
            System.out.print(ps[i] + (i < k ? " " : ""));
        }
        System.out.println();
    }
}
/*
 * Time Complexity: O(…)
 * 說明：8~12行，輸入場數和勝敗紀錄(1為勝);
 * 16~19行，建立勝場數的陣列;
 * 22~23行，計算K場各自的累積勝場數;
 */