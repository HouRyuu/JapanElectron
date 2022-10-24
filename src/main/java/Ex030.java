import java.util.Random;

/**
 * プログラム名 :Ex030
 * 引数 1 :なし
 * 概要 :チョキ、パー、グーの回数
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex030 {
    public static void main(String[] args) {
        String[] rockPaperScissors = {"グー", "チョキ", "パー"};
        int[] counts = new int[rockPaperScissors.length];
        Random random = new Random();
        int index, i;
        for (i = 0; i < 100; i++) {
            index = random.nextInt(3);
            System.out.println("じゃんけん:\t" + rockPaperScissors[index]);
            counts[index]++;
        }
        System.out.println();
        for (i = 0; i < rockPaperScissors.length; i++) {
            System.out.println(rockPaperScissors[i] + "の回数：\t" + counts[i]);
        }
    }
}