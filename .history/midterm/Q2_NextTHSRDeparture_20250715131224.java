package midterm;
import java.util.Scanner;
public class Q2_NextTHSRDeparture {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] times = new int[n];
        for(int i=0;i<n;i++){
            times[i] = parse(cin.nextLine());
        }
        int query = parse(cin.nextLine());
    }
}
/*
 * Time Complexity: O(…)
 * 說明：建立出HH:mm
 */