import java.util.Scanner;

/**
 * プログラム名 :Ex068
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex068 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("文字列1を入力:");
        String str1 = scan.next();
        System.out.print("文字列2を入力:");
        String str2 = scan.next();
        System.out.println(str1.equals(str2) ? "等しい" : "等しくない");
    }

}