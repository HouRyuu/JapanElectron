/**
 * プログラム名 :Sp001
 * 引数 1 :なし
 * 概要 :二次元配列の九九表
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Sp001 {
    public static void main(String[] args) {
        int[][] nums = new int[9][9];
        int result;
        for (int i = 1, j; i <= nums.length; i++) {
            for (j = 1; j <= nums[0].length; j++) {
                result = i * j;
                if (j > 1) {
                    System.out.print(" ");
                }
                if (j > 1 && result < 10) {
                    System.out.print(" ");
                }
                System.out.print(result);
            }
            System.out.println();
        }
    }
}