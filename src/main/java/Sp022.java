import java.util.Scanner;

/**
 * プログラム名 :Sp022
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Sp022 {
    public static void main(String[] args) {
        System.out.print("入力：");
        int month = new Scanner(System.in).nextInt();
        System.out.println(month + "月は" + Season.values()[month / 3 % 4] + "です。");
    }

}

enum Season {
    WINTER, // 12月,1月,2月
    SPRING, // 3月,4月,5月
    SUMMER, // 6月,7月,8月
    AUTUMN // 9月,10月,11月
}