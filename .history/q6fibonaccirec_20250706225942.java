import java.util.Scanner;
public class q6fibonaccirec {
    static long ops = 0;

    static long fib(int n) {
        if (n == 0 || n == 1) {
        return n;
        }
        ops++;
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
