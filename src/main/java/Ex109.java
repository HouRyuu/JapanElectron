import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * プログラム名 :Ex109
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex109 {
    public static void main(String[] args) {
        try {
            System.out.print("乗客数を入力してください");
            check(new Scanner(System.in).nextInt());
        } catch (InputMismatchException e) {
            System.out.println("エラー:整数を入力してください");
        } catch (PassengerNumberException e) {
            System.out.println("エラー：" + e.getMessage());
        }
    }

    static void check(int num) throws PassengerNumberException {
        if (num < 0 || 4 < num) {
            throw new PassengerNumberException("入力した人数は乗車できません");
        }
        System.out.println("乗客数は" + num + "人です");
        System.out.println();
    }

}

class PassengerNumberException extends Exception {
    PassengerNumberException(String msg) {
        super(msg);
    }
}


