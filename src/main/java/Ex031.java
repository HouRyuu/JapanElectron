import java.util.Random;
import java.util.Scanner;

/**
 * プログラム名 :Ex031
 * 引数 1 :なし
 * 概要 :点数によって表示
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex031 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("点数を入力してください!");
        int ten = stdIn.nextInt();
        assess(ten);
    }

    private static void assess(int ten) {
        if (ten >= 80) {
            System.out.println("大変よくできました");
        } else if (ten >= 60) {
            System.out.println("よくできました");
        } else {
            System.out.println("がんばりましょう");
        }
    }
}