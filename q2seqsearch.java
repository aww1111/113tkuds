import java.util.Scanner;

public class q2seqsearch{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        int key = cin.nextInt();

        boolean found = false;
        int ops = 0;

        for (int i = 0; i < n; i++) {
            ops++;
            if (arr[i] == key) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Yes" : "No");
        System.out.println(ops);
        cin.close();
    }
}
