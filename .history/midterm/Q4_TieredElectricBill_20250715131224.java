package midterm;

import java.util.Scanner;

public class Q4_TieredElectricBill {
    static double calcBill(int kwh){
        int[] a =    {120, 330, 500, 700, 1000};
        double[] b = {1.68, 2.45, 3.70, 5.04, 6.24, 8.46};

        int prev = 0;
        double bill = 0;
        for (int i=0;i<a.length;i++) {
            prev = a[i];
            if(kwh <= a[i]){
                bill +=(kwh-prev)*b[i];
                return bill;
            }
            bill +=(kwh-prev)*b[i];
        }
        bill +=(kwh-prev)*b[b.length-1];
        return bill;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = cin.nextInt();
        }
        int sum = 0;
        for (int kWh : x) {
            int bill = (int) Math.round(calcBill(kWh));
            System.out.println(bill);
            sum += bill;
        }
        long avg = Math.round((double)sum/n);
        System.out.println(sum);
        System.out.println(avg);
    }
}
/*
 * Time Complexity: O(…)
 * 說明：…（推導 1~3 行）
 */