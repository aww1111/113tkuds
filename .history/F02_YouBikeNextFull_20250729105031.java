import java.util.Scanner;
public class F02_YouBikeNextFull{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] times = new int[n];

        for (int i = 0; i < n; i++) {
            String[] t = cin.nextLine().split(":");
            times[i] = Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
        }
        String[] qy = cin.nextLine().split(":");
        int query = Integer.parseInt(qy[0]) * 60 + Integer.parseInt(qy[1]);

        int x =0;
        int y = n-1;
        int ans = -1;
        while(x<=y){
            int mid = (x+y)/2;
            if(times[mid] == query){
                ans = mid;
            } else if(times[mid] < query){
                x = mid + 1;
            } else {
                y = mid - 1;
            }
        }
        if(ans == -1){
            System.out.println("No Bike");
        } else {
            System.out.printf("%02d:%02d\n", times[ans] / 60, times[ans] % 60);
        }
        cin.close();
    }
}
/*
 * Time Complexity: O(1)
 * 說明：讀入n個時間:O(n)
 *      二分搜尋首個>查詢值:O(log n)
 *      輸出結果:O(n)
 */