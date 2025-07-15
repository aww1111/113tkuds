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
 * Time Complexity: 4
 * 說明：…（推導 1~3 行）
 */