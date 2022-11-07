/**
 * プログラム名 :Ex035
 * 引数 1 :なし
 * 概要 :点数の計算
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex035 {
    public static void main(String[] args) {
        int[] scores = new int[]{50, 60, 75, 98, 30};
        System.out.println("これから5人のJavaテストの点数を読み込みます!");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(i + 1 + "人目：");
            System.out.println(scores[i]);
        }
        System.out.println();
        System.out.println("最高点:" + getMax(scores) + "点");
        System.out.println("最低点:" + getMin(scores) + "点");
        System.out.println("平均点:" + getAve(scores) + "点");
    }

    private static int getMax(int[] scores) {
        int max = scores[0];
        for (int score : scores) {
            if (max < score) {
                max = score;
            }
        }
        return max;
    }

    private static int getMin(int[] scores) {
        int min = scores[0];
        for (int score : scores) {
            if (min > score) {
                min = score;
            }
        }
        return min;
    }

    private static double getAve(int[] scores) {
        double sum = 0.0;
        for (int score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}