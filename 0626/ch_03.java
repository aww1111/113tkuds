import java.util.Scanner;
public class ch_03 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        
        System.out.print("姓名：");
        String name = cin.nextLine();

        System.out.print("年齡：");
        int age = cin.nextInt();
        cin.nextLine();

        System.out.print("城市：");
        String city = cin.nextLine();

        System.out.println("\n輸入的資料：");
        System.out.println("姓名：" + name);
        System.out.println("年齡：" + age);
        System.out.println("城市：" + city);

    }
}
