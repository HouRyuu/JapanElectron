import java.util.Scanner;

/**
 * プログラム名 :Ex072
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex073 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("文字列を入力:");
        String str = scan.next();
        System.out.print("逆順：");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

}