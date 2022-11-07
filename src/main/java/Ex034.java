import java.util.Random;
import java.util.Scanner;

/**
 * プログラム名 :Ex034
 * 引数 1 :なし
 * 概要 :比較
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex034 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        int max = maxValue(a, b);
        System.out.println("a:" + a + ",b:" + b + ",max:" + max);
    }

    private static int maxValue(int a, int b) {
        return a > b ? a : b;
    }
}