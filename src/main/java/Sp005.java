import java.util.Scanner;

/**
 * プログラム名 :Sp005
 * 引数 1 :なし
 * 概要 :ビンゴゲーム
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Sp005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ROW = 3, COL = 3, TOTAL = ROW * COL;
        int[][] bingoNums = new int[ROW][COL];
        int count = 0;
        int row, col, num;
        System.out.println("整数を9つ入力してください。");
        while (count < TOTAL) {
            row = count / bingoNums.length;
            col = count % bingoNums[0].length;
            num = scan.nextInt();
            if (num != -1 && search(bingoNums, TOTAL, num) == null) {
                bingoNums[row][col] = num;
                count++;
            }
        }
        System.out.println("ビンゴカード");
        for (int i = 0; i < TOTAL; i++) {
            System.out.print(bingoNums[i / ROW][i % COL] + " ");
            if ((i + 1) % bingoNums[0].length == 0) {
                System.out.println();
            }
        }

        int result = (bingoNums.length + 1) * 2;
        boolean[][] hit = new boolean[ROW][COL];
        int[] position;
        while (true) {
            num = scan.nextInt();
            if (num == -1) {
                break;
            }
            position = search(bingoNums, TOTAL, num);
            if (position !=null) { // 命中
                hit[position[0]][position[1]] = true;
            }
        }
        System.out.println("ビンゴした数は" + result + "つです。");
    }

    /**
     * ビンゴカードから数字を探す
     *
     * @param bingoNums ビンゴカード
     * @param total     ビンゴカードの数字の数
     * @param num       探したい数字
     * @return 数字の位置[行, 列]
     */
    static int[] search(int[][] bingoNums, int total, int num) {
        int row, col;
        for (int i = 0; i < total; i++) {
            row = i / bingoNums.length;
            col = i % bingoNums[0].length;
            if (bingoNums[row][col] == num) {
                return new int[]{row, col};
            }
        }
        return null;
    }

}