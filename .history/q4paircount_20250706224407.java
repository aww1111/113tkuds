import java.util.Scanner;
public class q4paircount {
    public static void main(String[] args){
        try (Scanner cin = new Scanner(System.in)) {
            int n = cin.nextInt();
            for (int i = 0; i < n; i++) {
                cin.nextInt();
            }
            long pairCount = (long) n * (n - 1) / 2;
            long ops = pairCount;

            System.out.println(pairCount);
            System.out.println(ops);
    }
}
