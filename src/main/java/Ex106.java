/**
 * プログラム名 :Ex106
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex106 {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("●");
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
    }
}


