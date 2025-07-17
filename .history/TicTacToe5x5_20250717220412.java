import java.util.Scanner;

public class TicTacToe5x5{
    static char[][] board = new char[5][5];
    static void Board(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                board[i][j]='.';
            }
        }
    }

    static void printBoard(){
        System.out.print("  ");
        for (int j=0; j<5; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
        for (int i=0; i<5; i++) {
            System.out.print(i+" ");
            for (int j=0; j<5; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    static boolean isWin(char player) {
        for (int i=0; i<5; i++) {
            boolean ok = true;
            for (int j=0; j<5; j++) {
                if (board[i][j] != player) {
                    ok = false;
                    break;
                }
            }
            if (ok) return true;
        }
        for (int j=0; j<5; j++) {
            boolean ok = true;
            for (int i=0; i<5; i++) {
                if (board[i][j] != player) {
                    ok = false;
                    break;
                }
            }
            if (ok) return true;
        }
        boolean ok = true;
        for (int i=0; i<5; i++) {
            if (board[i][i] != player) {
                ok = false;
                break;
            }
        }
        if (ok) return true;
        ok = true;
        for (int i=0; i<5; i++) {
            if (board[i][5-1-i] != player) {
                ok = false;
                break;
            }
        }
        return ok;
    }

    static boolean isFull() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == '.') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Board();

        System.out.println("=== 5x5 井字遊戲 ===");
        printBoard();

        char cnt = 'X';
        while (true) {
            System.out.printf("玩家 %c 請輸入 row col（0-%d）：%n", cnt, 5-1);
            int row = cin.nextInt();
            int col = cin.nextInt();

            if (row<0 || row>=5 || col<0 || col>=5 || board[row][col] != '.') {
                System.out.println("輸入錯誤或該位置已被佔用，請重新輸入。");
                continue;
            }

            board[row][col] = cnt;
            System.out.printf("玩家 %c 在位置 (%d,%d) 放置棋子%n", cnt, row, col);
            printBoard();

            if (isWin(cnt)) {
                System.out.printf("玩家 %c 獲勝！%n", cnt);
                break;
            }
            if (isFull()) {
                System.out.println("平手！");
                break;
            }

            cnt = (cnt == 'X') ? 'O' : 'X';
        }
    }
}