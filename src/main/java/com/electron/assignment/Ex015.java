import java.util.Scanner;

/**
 * プログラム名 :Ex015
 * 引数 1 :なし
 * 概要 :正方形をプリント
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("正方形の1辺の\"*\"の数を入力してください");
        int count = scan.nextInt();
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                System.out.print("*");
                for (int j = 0; j < count - 2; j++) {
                    if (i == 0 || i == count - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("*");
            }
        } else {
            System.out.println("次回からは 1 以上の数字を入力してくださいね!");
        }
    }
}