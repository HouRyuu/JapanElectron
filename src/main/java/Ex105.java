/**
 * プログラム名 :Ex105
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex105 {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException 例外を catch しました");
            ex.printStackTrace();
        }
    }
}


