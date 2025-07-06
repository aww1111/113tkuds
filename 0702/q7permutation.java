import java.util.Scanner;
public class q7permutation {

    static long ops = 0;
    public static void main(String[] args) {
        try (Scanner cin = new Scanner(System.in)) {
            int n = cin.nextInt();
            int[] perm = new int[n];
            boolean[] used = new boolean[n + 1];

            backtrack(0, n, perm, used);
            System.out.println(ops);
        }
    }
    static void backtrack(int depth, int n, int[] perm, boolean[] used) {
        if (depth == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(perm[i] + (i < n - 1 ? " " : ""));
            }
            System.out.println();
            ops++;
            return;
        }

        for (int x = 1; x <= n; x++) {
            if (!used[x]) {
                used[x] = true;
                perm[depth] = x;
                backtrack(depth + 1, n, perm, used);
                used[x] = false;
            }
        }
    }
}

