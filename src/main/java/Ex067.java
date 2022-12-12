import java.util.Scanner;

/**
 * プログラム名 :Ex067
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex067 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("str1入力：");
        String str1 = scan.next();
        System.out.println("str2入力：");
        String str2 = scan.next();
        int index = str1.indexOf(str2);
        if (index < 0) {
            System.out.println(str2 + "は" + str1 + "に存在しません。");
        } else {
            System.out.println(str1);
            for (int i = 0; i < index; i++) {
                System.out.print(" ");
            }
            System.out.println(str2);
        }
    }

}