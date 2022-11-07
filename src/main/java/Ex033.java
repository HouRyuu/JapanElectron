import java.util.Scanner;

/**
 * プログラム名 :Ex033
 * 引数 1 :なし
 * 概要 :合計
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex033 {
    public static void main(String[] args) {
        sumOf();
    }

    private static void sumOf() {
        Scanner scan = new Scanner(System.in);
        int num, sum = 0;

        System.out.println("    整数を入力してください!");
        while (true) {
            num = scan.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
        }
        System.out.println("入力した整数の合計は" + sum + "です。");
    }
}