/**
 * プログラム名 :Ex071
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex071 {

    public static void main(String[] args) {
        long startT1, endT1;
        long startT2, endT2;
        String str3;
        //Stringクラスによる文字連結
        String str1 = "";
        startT1 = System.nanoTime(); //タイマースタート
        for (int i = 0; i < 1000; i++) {
            str1 = str1.concat("@");
        }
        endT1 = System.nanoTime(); //タイマーストップ
        System.out.println(endT1 - startT1 + "(ns)");
        //StringBuilderクラスによる文字連結
        StringBuilder str2 = new StringBuilder("");
        startT2 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            str2 = str2.append("@");
        }
        str3 = str2.toString();
        endT2 = System.nanoTime();
        System.out.println(endT2 - startT2 + "(ns)");
        /**
         * 実行結果：
         * 1179800(ns)
         * 58800(ns)
         * 原因：
         * Stringのconcatメソッドで文字列を連結するのはnewで新しい文字列を作って、メモリの配分には時間がかかります
         * StringBuilderのappendメソッドはSystem.arraycopy()を使って二つの配列を結合するので、newの方より早いです
         */
    }

}