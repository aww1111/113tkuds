package midterm;
import java.util.Scanner;

public class Q3_NightMarketRanking {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        double[] scores = new double[n];
        for (int i = 0; i < n; i++) {
            scores[i] = cin.nextDouble();
        }

        int limit = Math.max(n,5);
        for (int i = 0; i < limit; i++) {
            int maxIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (scores[j] > scores[maxIdx]) {
                    maxIdx = j;
            }
        }
        double tmp = scores[i];
        scores[i] = scores[maxIdx];
        scores[maxIdx] = tmp;
        }

        // 3. 輸出前 5 名分數（不足 5 則全列），保留 1 位小數
        for (int i = 0; i < limit; i++) {
            System.out.printf("%.1f%n", scores[i]);
        }
    }
}
/*
 * Time Complexity: O(n²)
 * 說明：5~10行，輸入攤位數和評分;
 * 12~21行，找最大然後交換;
 * 25~27行，輸出前5名;
 */