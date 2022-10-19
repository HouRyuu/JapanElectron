/**
 * プログラム名 :Ex009
 * 引数 1 :なし
 * 概要 :*の斜線をプリント
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex009 {
    public static void main(String[] args) {
        for (int i = 0, j; i < 5; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println("**");
        }
    }
}