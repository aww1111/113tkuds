package midterm;
import java.util.Scanner;

public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        String[] station = new String[n];
        for (int i=0;i<n;i++) {
            station[i] = cin.next();
        }

        String start = cin.next();
        String end = cin.next();
        int startIdx = -1;
        int endIdx = -1;

        for (int i=0;i<n;i++) {
            if(station[i].equals(start))startIdx=i;
            if(station[i].equals(end))endIdx=i;
        }
        if(startIdx==-1||endIdx==-1){
            System.out.println("Invalid");
        }else{
            int x = Math.abs(endIdx-startIdx)+1;
            System.out.println(x);
        }
    }
}
/*
 * Time Complexity:
 * 說明：8~11行，建立輸入的站數陣列。
 *      18~21行，尋找陣列中使用者輸入的起點站和終點站。
 *      22~27行，如果頭尾其中一個沒找到，就印Invalid;都有的話就計算出站數印出。
 */