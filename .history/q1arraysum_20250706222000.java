import java.util.Scanner;

public class q1arraysum{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        long sum = 0;
        int ops = 0;

        for (int i = 0; i < n; i++) {
            sum += cin.nextInt();
            ops++;
        }
        System.out.println(sum + " " + ops);
    }
}