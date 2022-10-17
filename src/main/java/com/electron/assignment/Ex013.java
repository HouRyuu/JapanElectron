import java.util.Scanner;

/**
 * プログラム名 :Ex013
 * 引数 1 :なし
 * 概要 :計算
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;
        System.out.print("x を入力してください:");
        x = scan.nextInt();
        System.out.print("y を入力してください:");
        y = scan.nextInt();

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
    }
}