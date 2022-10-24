/**
 * プログラム名 :Ex023
 * 引数 1 :なし
 * 概要 :配列の正順と逆順
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex023 {
    public static void main(String[] args) {
        int[] data;
        data = new int[]{3, 6, 9, 5};
        System.out.print("配列要素の正順:");
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.printf("%n配列要素の逆順:");
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
    }
}