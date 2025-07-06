import java.util.Scanner;
public class q5matrixmul {
    public static void main(String[] args) {
        try (Scanner cin = new Scanner(System.in)) {
            int n = cin.nextInt();

            int[][] A = new int[n][n];
            int[][] B = new int[n][n];
            int[][] C = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    A[i][j] = cin.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    B[i][j] = cin.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int sum = 0;
                    for (int k = 0; k < n; k++) {
                        sum += A[i][k] * B[k][j];
                    }
                    C[i][j] = sum;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(C[i][j]);
                    if (j < n - 1) System.out.print(" ");
                }
                System.out.println();
            }
            long ops = 2L * n * n;
            System.out.println(ops);
        }
    }
}
