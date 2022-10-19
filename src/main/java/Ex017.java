import java.util.Scanner;

/**
 * プログラム名 :Ex017
 * 引数 1 :なし
 * 概要 :1000以内の合計
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("入力する整数の合計を求めます。");
        System.out.println("数を入力してください。(ただし合計が 1000 を超えたら終了します)");
        int count = scan.nextInt(), num, sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("整数を入力してください:");
            num = scan.nextInt();
            if (1000 < sum + num) {
                System.out.println("合計が1000を超えたので終了します");
                break;
            } else {
                sum += num;
            }
        }
        System.out.printf("合計は%dです。%n", sum);
    }
}