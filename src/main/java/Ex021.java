/**
 * プログラム名 :Ex021
 * 引数 1 :なし
 * 概要 :配列の巡りを修正
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex021 {
    public static void main(String[] args) {
        int[] data = new int[]{10, 20, 30, 40, 50};
        for (int i = 0; i < 5; i++) { // 修正：Java配列の添字は[0,N)です。[1,5]->[0,5)
            System.out.print(data[i] + " ");
        }
        // エラーメッセージ => Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //	at Ex021.main(Ex021.java:12)
    }
}