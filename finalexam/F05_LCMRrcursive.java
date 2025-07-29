
import java.util.Scanner;

public class F05_LCMRrcursive{
    public static int GCD(int a, int b){
        if(a==b)return a;
        if(a>b)return GCD(a-b, b);
        return GCD(a, b-a);
    }
    public static int LCM(int a, int b){
        return a * b / GCD(a, b);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();

        int lcm = LCM(a, b);
        System.out.println("LCM: " + lcm);
        cin.close();
    }
}
/*
 * Time Complexity: O(max(a, b))
 * 說明：每次遞迴都會減少a或b的值，直到其中一個變為0,因此時間複雜度為O(max(a, b))
 */