import java.util.Scanner;

/**
 * プログラム名 :Sp002
 * 引数 1 :なし
 * 概要 :じゃんけんの勝ち
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Sp002 {
    public static void main(String[] args) {
        // (0:グー、1:チョキ、2:パー) 0>1 1>2 2>0
        final int LOSE = -1, DRAW = 0, WIN = 1;
        int[][] win = new int[3][3];
        for (int i = 0, j; i < win.length; i++) {
            for (j = 0; j < win[0].length; j++) {
                win[i][j] = Integer.compare(j, i);
            }
        }
        win[0][2] = LOSE;
        win[2][0] = WIN;
        System.out.println("じゃんけんを入力してください。");
        Scanner scan = new Scanner(System.in);
        System.out.print("user1:");
        int user1 = scan.nextInt();
        System.out.print("user2:");
        int user2 = scan.nextInt();
        if (0 <= user1 && user1 <= 2 && 0 <= user2 && user2 <= 2) {
            int result = win[user1][user2];
            if (result == LOSE) {
                System.out.println("user2の勝ち");
            } else if (result == DRAW) {
                System.out.println("引き分け");
            } else {
                System.out.println("user1の勝ち");
            }
        }
    }
}