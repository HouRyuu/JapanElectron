import java.util.Scanner;

/**
 * プログラム名 :Ex103
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex103 {
    public static void main(String[] args) {
        int[] ary = {1, 2, 3, 4, 5};
        System.out.print("何番目の配列を表示しますか？");
        int index = new Scanner(System.in).nextInt();
        try {
            System.out.println(ary[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
    }
}


