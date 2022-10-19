import java.util.Scanner;

/**
 * プログラム名 :Ex018
 * 引数 1 :なし
 * 概要 :○/●をプリント
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\"○\"\"●\"を表示する個数を入力してください。");
        int count = scan.nextInt();
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                if (i % 2 == 0) {
                    System.out.print("○");
                } else {
                    System.out.print("●");
                }
            }
        } else {
            System.out.println("次回からは 1 以上の数字を入力してくださいね!");
        }
    }
}