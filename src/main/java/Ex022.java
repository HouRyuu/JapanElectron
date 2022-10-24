/**
 * プログラム名 :Ex022
 * 引数 1 :なし
 * 概要 :配列の巡り
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex022 {
    public static void main(String[] args) {
        int[] ary1 = new int[]{1, 2, 3, 4, 5};
        double[] ary2 = new double[]{0.1, 0.2, 0.3, 0.4, 0.5};
        char[] ary3 = new char[]{'a', 'b', 'c', 'd', 'e'};
        System.out.print("ary1：");
        for (int i : ary1) {
            System.out.print(i + " ");
        }
        System.out.printf("%nary2：");
        for (double d : ary2) {
            System.out.print(d + " ");
        }
        System.out.printf("%nary3：");
        for (char c : ary3) {
            System.out.print(c + " ");
        }
    }
}