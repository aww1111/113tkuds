import java.util.Scanner;
public class q6fibonaccirec {
    static long ops = 0;

    static long fib(int n) {
        ops++;
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        try (Scanner cin = new Scanner(System.in)) {
            int n = cin.nextInt();
            long fn = fib(n);
            System.out.println(fn);
            System.out.println(ops);
        }
    }
}
