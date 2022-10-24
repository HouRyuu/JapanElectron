import java.util.Scanner;

/**
 * プログラム名 :Sp004
 * 引数 1 :なし
 * 概要 :ビンゴカードを作る
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Sp004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] bingoNums = new int[3][3];
        int count = 0, total = bingoNums.length * bingoNums[0].length;
        int row, col, num;
        System.out.println("整数を9つ入力してください。");
        while (count < total) {
            row = count / bingoNums.length;
            col = count % bingoNums[0].length;
            num = scan.nextInt();
            if (num != -1 && !exists(bingoNums, total, num)) {
                bingoNums[row][col] = num;
                count++;
            }
        }
        System.out.println();
        for (int i = 0; i < total; i++) {
            System.out.print(bingoNums[i / bingoNums.length][i % bingoNums[0].length] + " ");
            if ((i + 1) % bingoNums[0].length == 0) {
                System.out.println();
            }
        }
    }

    static boolean exists(int[][] bingoNums, int total, int num) {
        for (int i = 0; i < total; i++) {
            if (bingoNums[i / bingoNums.length][i % bingoNums[0].length] == num) {
                return true;
            }
        }
        return false;
    }

}