import java.util.Scanner;

/**
 * プログラム名 :Ex014
 * 引数 1 :なし
 * 概要 :*をプリント
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*を表示する個数を入力してください。");
        int count = scan.nextInt();
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("次回からは1以上の数字を入力してくださいね!");
        }
    }
}