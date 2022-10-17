import java.util.Scanner;

/**
 * プログラム名 :Ex019
 * 引数 1 :なし
 * 概要 :十二支を表示
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("西暦を入力してください!");
        int year    = scan.nextInt();
        int zodiac  = year % 12;
        switch (zodiac) {
            case 0:
            System.out.println(year + "年は申年です");
            break;
            case 1:
            System.out.println(year + "年は酉年です");
            break;
            case 2:
            System.out.println(year + "年は戌年です");
            break;
            case 3:
            System.out.println(year + "年は亥年です");
            break;
            case 4:
            System.out.println(year + "年は子年です");
            break;
            case 5:
            System.out.println(year + "年は丑年です");
            break;
            case 6:
            System.out.println(year + "年は寅年です");
            break;
            case 7:
            System.out.println(year + "年は卯年です");
            break;
            case 8:
            System.out.println(year + "年は辰年です");
            break;
            case 9:
            System.out.println(year + "年は巳年です");
            break;
            case 10:
            System.out.println(year + "年は午年です");
            break;
            case 11:
            System.out.println(year + "年は未年です");
            break;
        }
    }
}