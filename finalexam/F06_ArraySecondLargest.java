
import java.util.Scanner;

public class F06_ArraySecondLargest{
    static class Pair{
        int max;
        int second;

        Pair(int max, int second){
            this.max = max;
            this.second = second;
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
            arr[i] = cin.nextInt();
        
        Pair s = findSecondMax(arr, 0, n - 1);
        System.out.println("SecondMax: " +s.second);
    }
    static Pair findSecondMax(int[] a,int i,int r){
        if(i==r)
            return new Pair(a[i], Integer.MIN_VALUE);

        int m = (i + r) / 2;
        Pair x = findSecondMax(a, i, m);
        Pair y = findSecondMax(a, m + 1, r);
        
        int max, second;
        if (x.max > y.max) {
            max = x.max;
            second = Math.max(x.second, y.max);
        } else {
            max = y.max;
            second = Math.max(y.second, x.max);
        }
        return new Pair(max, second);
    }
}
/*
 * Time Complexity: O(n)
 * 說明：每次將陣列分為兩半，並遞迴處理每一半，然後合併結果，因此時間複雜度為O(n)。
 */