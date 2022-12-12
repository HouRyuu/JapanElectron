import java.util.Scanner;

/**
 * プログラム名 :Ex066
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex066 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = "私の好きな食べ物は";
        String str2 = "です。";
        System.out.println("好きな食べ物を入力:");
        String food = scan.next();
        System.out.println(str1.concat(food).concat(str2));
    }

}