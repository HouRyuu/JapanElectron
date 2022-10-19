/**
 * プログラム名 :Ex005
 * 引数 1 :なし
 * 概要 :四捨五入
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex005 {
    public static void main(String[] args) {
        // 宣言
        int i1      = 5;
        int i2      = 3;
        //　計算
        double div  = (int) (((double) i1 / i2 + 0.005) * 100) / 100.0;
        // 結果をプリント
        System.out.println(i1 + "/" + i2 + "=" + div);
    }
}