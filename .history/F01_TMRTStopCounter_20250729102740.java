
import java.util.Scanner;

public class F01_TMRTStopCounter{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        
        int n = cin.nextInt();
        String[] stops = new String[n];

        for (int i = 0; i < n; i++)stops[i]=cin.next();
        String star = cin.next();
        String end = cin.next();

        int idxStart = -1, indexEnd = -1;
        for (int i = 0; i < n; i++) {
            if (stops[i].equals(star)) {
                idxStart = i;
            }
            if (stops[i].equals(end)) {
                indexEnd = i;
            }
        }
        if(idxStart == -1 || indexEnd == -1 || idxStart >= indexEnd) {
            System.out.println("Invalid");
        } else {
            int x = Math.abs(idxStart - indexEnd)+1;
            System.out.println(x);
        }
    }
}
/*
 * Time Complexity: O(n)
 * 說明：讀入n個停靠站:O(n)
 *      尋找star&end:O(n)
 */