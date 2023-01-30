/**
 * プログラム名 :Ex108
 * 引数 1 :なし
 * 学籍番号 :22JY0140
 * 名前 :劉　鵬
 */
public class Ex108 {
    public static void main(String[] args) {
        try {
            foo();
        } catch (FooException e) {
            System.out.println(e);
        }
    }

    static void foo() throws FooException {
        throw new FooException();
    }
}

class FooException extends Exception {

}


