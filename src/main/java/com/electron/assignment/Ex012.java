/**
 * プログラム名 :Ex012
 * 引数 1 :なし
 * 概要 :九九表をプリント
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex012 {
    public static void main(String[] args) {
        int nine = 9, result;
        for (int i = 1, j; i <= nine; i++) {
            for (j = 1; j <= nine; j++) {
                result = i * j;
                if (1 < j) {
                    System.out.print(" ");
                }
                if (result < 10) {
                    System.out.print(" ");
                }
                System.out.print(result);
            }
            System.out.println();
        }
    }
}