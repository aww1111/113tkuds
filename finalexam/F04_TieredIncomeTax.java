import java.util.Scanner;
public class F04_TieredIncomeTax{
    static final int[] x = {0, 590000, 1330000, 2660000, 4980000};
    static final double[] rates = {0.05, 0.12, 0.2, 0.3, 0.4};
    static final int[] y = {0, 14300, 147700, 413700, 911700};

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = Integer.parseInt(cin.nextLine());

        int total =0;
        for(int i = 0; i < n; i++) {
            int income = Integer.parseInt(cin.nextLine());
            int tax = 0;
        

            for(int j = x.length-1;j>=0;j--){
                if(income >= x[j]){
                    tax = (int)Math.round(income * rates[j]-y[j]);
                    break;
                }
            }
            total += tax;
            System.err.println("Tax:"+tax);
        }
        double avg = (double)total / n;
        System.out.printf("Average: %.2f\n", avg);
        cin.close();
    }
}
/*
 * Time Complexity: O(n)
 * 說明：每段階稅率只要走訪一次，所以式子為O(n)
 *      總共處理n筆收入，時間複雜度為O(n)
 */