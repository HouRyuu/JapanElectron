import java.util.Scanner;

/**
 * プログラム名 :Ex026
 * 引数 1 :なし
 * 概要 :点数の計算
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex026 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] scores = new int[5];
        System.out.println("これから5人のJavaテストの点数を読み込みます!");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(i + 1 + "人目：");
            scores[i] = scan.nextInt();
        }
        double sum = 0.0, avg;
        int max = scores[0], min = scores[0];
        for (int score : scores) {
            sum += score;
            if (max < score) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }
        avg = sum / scores.length;
        System.out.println();
        System.out.println("最高点:" + max + "点");
        System.out.println("最低点:" + min + "点");
        System.out.println("平均点:" + avg + "点");
    }
}