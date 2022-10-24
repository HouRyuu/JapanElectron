/**
 * プログラム名 :Ex028
 * 引数 1 :なし
 * 概要 :配列のコピー
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex028 {
    public static void main(String[] args) {
        int[] data1 = new int[]{11, 22, 33};
        int[] data2 = new int[data1.length];
        //配列のコピー
        System.arraycopy(data1, 0, data2, 0, data1.length);
        //data2 の値の書き換え
        data2[0] = 10;
        data2[1] = 20;
        //data1,2 の内容表示
        System.out.print("data1:");
        printAry(data1);
        System.out.print("data2:");
        printAry(data2);
    }

    static void printAry(int[] ary) {
        for (int data : ary) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
}