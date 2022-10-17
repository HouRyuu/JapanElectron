import java.util.Scanner;

/**
 * プログラム名 :Ex020
 * 引数 1 :なし
 * 概要 :配列で十二支を表示
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("西暦を入力してください!");
        int year            = scan.nextInt();
        char[] zodiacArray  = {'申', '酉', '戌', '亥', '子', '丑', '寅', '卯', '辰', '巳', '午', '未'};
        System.out.println(year + "年は" + zodiacArray[year % zodiacArray.length] + "年です");
    }
}