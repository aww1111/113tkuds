
import java.util.Scanner;

public class F03_ConvenienceHotItems{
    static class Item{
        String name;
        int qty;

        Item(String name, int qty) {
            this.name = name;
            this.qty = qty;
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            String x = cin.nextLine();
            String[] parts =x.split(" ");
            String name = parts[0];
            int qty = Integer.parseInt(parts[1]);
            items[i] = new Item(name, qty);
        }
        for(int i =1;i<n;i++){
            Item s = items[i];
            int j = i-1;
            while(j >= 0 && items[j].qty < s.qty){
                items[j + 1] = items[j];
                j++;
        }
        items[j - 1] = s;
        }
        int count = Math.min(10, n);
        for (int i = 0; i < count; i++) {
            System.out.println(items[i].name + " " + items[i].qty);
        }
        cin.close();
    }
}
/*
 * Time Complexity: O(n^2)
 * 說明：插入排序:O(n^2)
 *      輸出前10個:O(10)
 */