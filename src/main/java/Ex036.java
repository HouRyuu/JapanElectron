import java.util.Scanner;

/**
 * プログラム名 :Ex036
 * 引数 1 :なし
 * 概要 :割合の計算
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex036 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("学生の人数を入力してください!");
        int student = scan.nextInt();
        System.out.println("出席率が 100%の学生の人数を入力してください");
        int goodStudent = scan.nextInt();
        double rate = rateCalculate(student, goodStudent);
        System.out.println("出席率が 100%の学生は全体の" + rate + "%です");
    }

    private static double rateCalculate(int student, int goodStudent) {
        double rate = goodStudent * 1.0 / student;
        rate  = (int) ((rate + 0.0005) * 1000) / 10.0;
        return rate;
    }
}