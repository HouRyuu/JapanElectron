/**
 * プログラム名 :Ex032
 * 引数 1 :なし
 * 概要 :サイズを表示
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex032 {
    public static void main(String[] args) {
        int height1 = 180;
        int height2 = 160;
        int height3 = 140;
        System.out.println("1人目のサイズは" + selectSize(height1) + "です");
        System.out.println("2人目のサイズは" + selectSize(height2) + "です");
        System.out.println("3人目のサイズは" + selectSize(height3) + "です");
    }

    private static String selectSize(int height1) {
        if (height1 >= 170) {
            return "L";
        } else if (height1 >= 150) {
            return "M";
        }
        return "S";
    }
}