/**
 * プログラム名 :Ex025
 * 引数 1 :なし
 * 概要 :乱数の配列
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex025 {
    public static void main(String[] args) {
        int[] data  = new int[5];
        System.out.print(data.length+"件の乱数:");
        for (int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random()*10);
            System.out.print(data[i]+" ");
        }
    }
}