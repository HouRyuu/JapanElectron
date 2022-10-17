/**
 * プログラム名 :Ex008
 * 引数 1 :なし
 * 概要 :三角形をプリント
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex008 {
    public static void main(String[] args) {
        for (int i = 1, j; i <= 8; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}