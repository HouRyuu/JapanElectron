import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * プログラム名 :Ex104
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex104 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("数値を入力してください");
        int num;
        try {
            num = s1.nextInt();
            System.out.println("入力された数値は" + num + "です");
        } catch (InputMismatchException ex) {
            System.out.println("数字以外が入力されました");
        }
    }
}


