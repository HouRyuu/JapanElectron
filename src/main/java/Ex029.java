import java.util.Random;

/**
 * プログラム名 :Ex029
 * 引数 1 :なし
 * 概要 :シーケンシャルサーチ
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex029 {
    public static void main(String[] args) {
        int[] data = new int[7];
        Random random = new Random();
        int min = 10;
        System.out.print("配列要素の正順:");
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(21) - 10;
            System.out.print(data[i] + " ");
            if (data[i] < min) {
                min = data[i];
            }
        }
        System.out.println();
        System.out.println("配列要素の最小値:" + min);
    }
}