public class matrix_multiplication_trace {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int n = 2;
        int[][] c = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                StringBuilder mulPart = new StringBuilder();
                StringBuilder addPart = new StringBuilder();

                for (int k = 0; k < n; k++) {
                    int prod = a[i][k] * b[k][j];
                    mulPart.append(a[i][k]);
                    mulPart.append("*");
                    mulPart.append(b[k][j]);
                    addPart.append(prod);
                    if (k < n - 1) {
                        mulPart.append(" + ");
                        addPart.append(" + ");
                    }
                    sum += prod;
                }

                c[i][j] = sum;

                System.out.println("計算位置 c[" + i + "][" + j + "]："
                    + mulPart.toString() + " = "
                    + addPart.toString() + " = "
                    + sum);
            }
        }

        System.out.println("結果矩陣：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

}
