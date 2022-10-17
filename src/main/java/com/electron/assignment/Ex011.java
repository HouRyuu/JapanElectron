/**
 * プログラム名 :Ex011
 * 引数 1 :なし
 * 概要 :Xをプリント
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex011 {
    public static void main(String[] args) {
        int row = 7, col = 7;
        for (int i = 0, j; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (i == j || j == col - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}