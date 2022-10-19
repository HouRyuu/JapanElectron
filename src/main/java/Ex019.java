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
        char zodiacStr = 0;
        switch (zodiac) {
            case 0:
            zodiacStr = '申';
            break;
            case 1:
            zodiacStr = '酉';
            break;
            case 2:
            zodiacStr = '戌';
            break;
            case 3:
            zodiacStr = '亥';
            break;
            case 4:
            zodiacStr = '子';
            break;
            case 5:
            zodiacStr = '丑';
            break;
            case 6:
            zodiacStr = '寅';
            break;
            case 7:
            zodiacStr = '卯';
            break;
            case 8:
            zodiacStr = '辰';
            break;
            case 9:
            zodiacStr = '巳';
            break;
            case 10:
            zodiacStr = '午';
            break;
            case 11:
            zodiacStr = '未';
        }
        System.out.println(year + "年は" + zodiacStr + "年です");
    }
}