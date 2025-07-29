
import java.util.Scanner;

public class F07_AnagramPalindorme {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String line = cin.nextLine();

        int[] abc = new int[26];
        for (char c : line.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                abc[c - 'a']++;
            }
        }
        int count = 0;
        for (int i = 0; i < abc.length; i++) {
            if (abc[i] % 2 == 1) {
                count++;
            }
        }
        if (count <= 1) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}